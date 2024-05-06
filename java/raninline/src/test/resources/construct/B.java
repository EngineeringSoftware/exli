package construct;
import org.inlinetest.ITest;
import static org.inlinetest.ITest.itest;
import static org.inlinetest.ITest.group;


public class B {
    public int parseArray() {
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < array.length; i++) {
            int d = array[i] << 2 + 3;
            itest("Randoop").given(i, 0).given(array, new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }).checkEq(d, 5);
        }
    }
}
