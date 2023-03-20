package Lesson2;

public class homework3 {
    public static void main(String[] args) {
        int month = 4;
        if (month >= 1 && month <= 2) {
            System.out.println("Сейчас зима");

        } else if (month >= 3 && month <= 6) {
            System.out.println("Сейчас весна");
        } else if (month >= 6 && month <= 9) {
            System.out.println("Сейчас лето");
        } else if (month >= 9 && month <= 11) {
            System.out.println("Сейчас осень");
        } else if (month == 12) {
            System.out.println("Сейчас зима");
        }
    }
}
