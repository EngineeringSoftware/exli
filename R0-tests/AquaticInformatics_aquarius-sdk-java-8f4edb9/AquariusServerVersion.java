package com.aquaticinformatics.aquarius.sdk;

import net.servicestack.func.Func;
import java.util.ArrayList;
import java.util.Objects;
import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class AquariusServerVersion {

    public static AquariusServerVersion Create(String apiVersion) {
        return new AquariusServerVersion(apiVersion);
    }

    private final ArrayList<Integer> _versionComponents;

    private AquariusServerVersion(String apiVersion) {
        Objects.requireNonNull(apiVersion, "apiVersion cannot be null");
        _versionComponents = Func.map(apiVersion.split("\\."), Integer::parseUnsignedInt);
        new Here("Randoop", 19).given(apiVersion, "2021.08.9990").checkEq(_versionComponents, "14.xml");
        new Here("Unit", 19).given(apiVersion, "16.1.123").checkEq(_versionComponents, "6.xml");
        new Here("Randoop", 19).given(apiVersion, "21.4.62.0").checkEq(_versionComponents, "15.xml");
        new Here("Unit", 19).given(apiVersion, "3.6.121").checkEq(_versionComponents, "8.xml");
        new Here("Unit", 19).given(apiVersion, "3").checkEq(_versionComponents, "7.xml");
        new Here("Unit", 19).given(apiVersion, "15").checkEq(_versionComponents, "1.xml");
        new Here("Unit", 19).given(apiVersion, "3.6").checkEq(_versionComponents, "12.xml");
        new Here("Unit", 19).given(apiVersion, "2").checkEq(_versionComponents, "2.xml");
        new Here("Unit", 19).given(apiVersion, "0.1").checkEq(_versionComponents, "11.xml");
        new Here("Unit", 19).given(apiVersion, "0").checkEq(_versionComponents, "10.xml");
        new Here("Unit", 19).given(apiVersion, "14.4.58").checkEq(_versionComponents, "9.xml");
        new Here("Unit", 19).given(apiVersion, "2.1").checkEq(_versionComponents, "3.xml");
        new Here("Unit", 19).given(apiVersion, "0.0.0.0").checkEq(_versionComponents, "0.xml");
        new Here("Unit", 19).given(apiVersion, "14.4").checkEq(_versionComponents, "13.xml");
        new Here("Unit", 19).given(apiVersion, "3.9.123").checkEq(_versionComponents, "4.xml");
        new Here("Unit", 19).given(apiVersion, "15.4.123").checkEq(_versionComponents, "5.xml");
        if (_versionComponents.isEmpty()) {
            throw new IllegalArgumentException("apiVersion cannot be empty");
        }
        AdjustMajorVersion();
    }

    private void AdjustMajorVersion() {
        final int firstNgMajorVersion = 14;
        final int lastYearInCentury = 99;
        final int thisMillenium = 2000;
        final int majorVersionIndex = 0;
        final int majorVersion = _versionComponents.get(majorVersionIndex);
        if (majorVersion >= firstNgMajorVersion && majorVersion <= lastYearInCentury) {
            _versionComponents.set(majorVersionIndex, majorVersion + thisMillenium);
        }
    }

    @Override
    public String toString() {
        return String.join(".", Func.map(_versionComponents, Object::toString));
    }

    public boolean IsLessThan(AquariusServerVersion other) {
        if (IsDeveloperBuild() && !other.IsDeveloperBuild()) {
            return false;
        }
        if (!IsDeveloperBuild() && other.IsDeveloperBuild()) {
            return true;
        }
        for (int i = 0; i < _versionComponents.size(); ++i) {
            if (i >= other._versionComponents.size()) {
                return false;
            }
            if (_versionComponents.get(i) < other._versionComponents.get(i)) {
                return true;
            }
            if (_versionComponents.get(i) > other._versionComponents.get(i)) {
                return false;
            }
        }
        return _versionComponents.size() < other._versionComponents.size();
    }

    public int Compare(AquariusServerVersion other) {
        if (IsLessThan(other)) {
            return -1;
        }
        if (other.IsLessThan(this)) {
            return 1;
        }
        return 0;
    }

    public boolean IsDeveloperBuild() {
        return Func.all(_versionComponents, comp -> comp == 0);
    }
}
