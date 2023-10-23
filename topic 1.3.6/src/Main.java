public class Praktikum {

    public static void main(String[] args) {

        // Напишите аналогичный вызов метода findMax для таких пар чисел: 16 и 5, -1 и -7
        findMax(5, 3);
        findMax(16, 5);
        findMax(-1, -7);
    }

    public static int findMax(int a, int b) {
        if (a > b) {
            System.out.println("Наибольшее из чисел " + a + " и " + b + " = " + a);
        } else {
            System.out.println("Наибольшее из чисел " + a + " и " + b + " = " + b);
        }
    }

}