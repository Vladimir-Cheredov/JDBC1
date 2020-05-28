import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class T2Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4, 4, 4, 1, 4, 1}, true},
                {new int[]{8, 8, 7, 7, 7, 3, 5, 1}, false},
                {new int[]{1, 4, 8, 7}, false}
        });
    }
    private int[] in;
    private boolean out;

    public T2Test(int[] in, boolean out) {
        this.in = in;
        this.out = out;
    }

    private T2 t2;

    @Before
    public void startTest() {
        t2 = new T2();
    }

    @Test
    public void testOnly1And4() { Assert.assertEquals(T2.Only1And4(in), out);
    }
}
