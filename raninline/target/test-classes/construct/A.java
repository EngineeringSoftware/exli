package construct;

import org.inlinetest.Here;
import static org.inlinetest.Here.group;

public class A {

    public void m(int a, int b) {
        a = a + b;
        if (a > 1 && b < 1) {
            new Here("Randoop").given(a, 2).given(b, 0).checkTrue(group());
            a = a + b;
        } else {
            a = a - b;
        }
    }
}
