import org.junit.Before;
import org.junit.Test;

public class T1ExTest {
    private T1 t1;

    @Before
    public void startTest() {
        t1 = new T1();
    }

    @Test(expected = RuntimeException.class)
    public void testAfterLast4Ex() {
        T1.AfterLast4(new int[]{0, 3, 7, 5, 0, 0, 3, 2});
    }
}
