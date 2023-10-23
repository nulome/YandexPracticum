public class Praktikum {

    public static void main(String[] args) {
        // Ниже вызовите новый метод
        String highestGrossingFilm = findHighestGrossingFilm();
        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);
    }

    public static String findHighestGrossingFilm() {
        String film1 = "Титаник";
        int income1 = 2194;

        String film2 = "Аватар";
        int income2 = 2810;

        String film3 = "Тёмный рыцарь";
        int income3 = 1084;

        // Допишите реализацию метода ниже
        if (income1>income2) {
            if (income1>income3) {
                return "Титаник";
            } else {
                return "Тёмный рыцарь";
            }

        } else if (income2>income3) {
            return  "Аватар";
        } else {
            return "Тёмный рыцарь";
        }
    }

}