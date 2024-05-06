package construct;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;


public class F {
    public int m (int a){
        a = a + 1; // increment a by 1
        itest("Unit", 5).given(a, 1).checkEq(a, 2);
        return a;
    }
}
