import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try {
            test(getRandomNumberInRange(-5, 5));
        } catch (IOException e) {
            System.out.println("OTLOVILI");
        }
    }
    /**
     * @param min - передаем минимальную интовую переменную
     * @param max - передаем максимальную интовую переменную
     * @return - возвращаем рандомное число между минимальной и максимальной переменной
     */
    private static int getRandomNumberInRange(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }

    /**
     * Exp!!!
     * @param x
     */
    private static void test(int x) throws IOException {
        if (x > 0) {
            System.out.println(x*x);
        }else {
            throw new IOException();
        }
    }
}