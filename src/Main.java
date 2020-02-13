import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int x = getRandomNumberInRange(-10, 10);
        if (x > 0) {
            System.out.println(Math.pow(x, 2));
        }else {
            throw new ArithmeticException();
        }
        try {
            getRandomNumberInRange(-10, 10);
        } catch (ArithmeticException e) {
            System.out.println("Отловили!");
        }
    }
    /**
     * @param min - передаем минимальную интовую переменную
     * @param max - передаем максимальную интовую переменную
     * @return - возвращаем рандомное число между минимальной и максимальной переменной
     */
    private static int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        int rand = r.nextInt((max - min) + 1) + min;
        return rand;
    }
}