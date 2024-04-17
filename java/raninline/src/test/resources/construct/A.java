package construct;

import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;

public class A {

    public void m(int a, int b) {
        a = a + b;
        if (a > 1 && b < 1) {
            itest("Randoop").given(a, 2).given(b, 0).checkTrue(group());
            a = a + b;
        } else {
            a = a - b;
        }
    }
}
