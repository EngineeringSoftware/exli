package com.aquaticinformatics.aquarius.sdk;

import net.servicestack.func.Func;
import java.util.ArrayList;
import java.util.Objects;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class AquariusServerVersion {

    public static AquariusServerVersion Create(String apiVersion) {
        return new AquariusServerVersion(apiVersion);
    }

    private final ArrayList<Integer> _versionComponents;

    private AquariusServerVersion(String apiVersion) {
        Objects.requireNonNull(apiVersion, "apiVersion cannot be null");
        _versionComponents = Func.map(apiVersion.split("\\."), Integer::parseUnsignedInt);
        itest("evosuite", 19).given(apiVersion, ".").checkEq(_versionComponents, "19.xml");
        itest("dev", 19).given(apiVersion, "15").checkEq(_versionComponents, "1.xml");
        itest("dev", 19).given(apiVersion, "0.0.0.0").checkEq(_versionComponents, "0.xml");
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
