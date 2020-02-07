package normal;

public class Cube {
    public static long cube(long t) {
        long total = 0;
        int counter = 0;

        while (total < t) {
            counter++;
            total = total + (long) Math.pow(counter, 3);
        }

        if (t == total)
            return counter;
        return -1;


    }
}
