package org.raninline;

import java.util.ArrayList;
import java.util.List;

public class InlineTest {
    public String testName;
    public int lineNo;
    public int targetStmtLineNo;
    public List<String> givens;
    public List<String> assertions;
    public String srcPath; // source file path that inline test is in
    public String clazzName; // class that inline test is in

    public InlineTest() {
        this.givens = new ArrayList<String>();
        this.assertions = new ArrayList<String>();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.testName == null && this.targetStmtLineNo <= 0) {
            sb.append(Constant.DECLARE_NAME + "()");
        } else if (this.testName == null && this.targetStmtLineNo > 0) {
            sb.append(Constant.DECLARE_NAME + "(" + this.targetStmtLineNo + ")");
        } else if (this.testName != null && this.targetStmtLineNo <= 0) {
            sb.append(Constant.DECLARE_NAME + "(\"" + this.testName + "\")");
        } else {
            sb.append(Constant.DECLARE_NAME + "(\"" + this.testName + "\", " + this.targetStmtLineNo + ")");
        }
        for (String given : givens) {
            sb.append(".");
            sb.append(given);
        }
        for (String assertion : assertions) {
            sb.append(".");
            sb.append(assertion);
        }
        sb.append(";");
        return sb.toString();
    }

    public int hashCode() {
        return this.srcPath.hashCode() + this.lineNo + this.toString().hashCode();
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InlineTest)) {
            return false;
        }
        InlineTest other = (InlineTest) o;
        return this.srcPath.equals(other.srcPath) && this.lineNo == other.lineNo
                && this.toString().equals(other.toString());
    }
}
