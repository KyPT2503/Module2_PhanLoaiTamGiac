

public class TriangleClassifier {
    private static final String ISOSCELES_TRIANGLE = "isosceles triangle";
    private static final String EQUILATERAL_TRIANGLE = "equilateral triangle";
    private static final String ORDINARY_TRIANGLE = "ordinary triangle";
    private static final String NOT_A_TRIANGLE = "not a triangle";

    public static String triangleClassifier(int[] sides) {
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] <= 0) return NOT_A_TRIANGLE;
        }
        if (sides[0] + sides[1] < sides[2] || sides[1] + sides[2] < sides[0] || sides[0] + sides[2] < sides[1])
            return NOT_A_TRIANGLE;
        if (sides[0] == sides[1] || sides[1] == sides[2] || sides[0] == sides[2]) {
            if (sides[0] == sides[1] && sides[1] == sides[2]) return ISOSCELES_TRIANGLE;
            return EQUILATERAL_TRIANGLE;
        }

        return ORDINARY_TRIANGLE;
    }
}
