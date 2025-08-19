package static2.ex;

public class MathArrayUtil {

    private MathArrayUtil() {
        //인스턴스 생성을 막는다
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static double average(int[] values) {
        double average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        average = average / values.length;
        return average;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int i = 0; i < values.length; i++) {
            min = Math.min(min, values[i]);
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            max = Math.max(max, values[i]);
        }
        return max;
    }
}
