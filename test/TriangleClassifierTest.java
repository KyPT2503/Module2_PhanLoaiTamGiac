import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class TriangleClassifierTest {
    private static final String ISOSCELES_TRIANGLE = "isosceles triangle";
    private static final String EQUILATERAL_TRIANGLE = "equilateral triangle";
    private static final String ORDINARY_TRIANGLE = "ordinary triangle";
    private static final String NOT_A_TRIANGLE = "not a triangle";

    private int[] sides;
    private String result;

    public TriangleClassifierTest(int[] sides, String result) {
        this.sides = sides;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{{new int[]{2, 2, 2}, ISOSCELES_TRIANGLE},
                {new int[]{2, 2, 3}, EQUILATERAL_TRIANGLE},
                {new int[]{3, 4, 5}, ORDINARY_TRIANGLE},
                {new int[]{-1, 2, 1}, NOT_A_TRIANGLE},
                {new int[]{8, 2, 3}, NOT_A_TRIANGLE},
                {new int[]{0, 1, 1}, NOT_A_TRIANGLE}});
    }

    @Test
    public void triangleClassifier() {
        assertEquals(TriangleClassifier.triangleClassifier(sides),result);
    }
}