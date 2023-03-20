package Lesson2;

public class homework5 {
    public static void main(String[] args) {
        int x = 10 + (int) (Math.random()*500);
        double y = 25 + (double) (Math.random()*200);
        if (x < 26 && x > 199) {
            System.out.println("Число не содержится в интервале");
        } else {
            System.out.println("Число содержится в интервале");
        }


    }
}
