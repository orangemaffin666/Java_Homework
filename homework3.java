package Lesson01;

public class homework3 {
    public static void main(String[] args) {
        double time= 2.0;
        double distance= 83.0;
        double speedkmh= (distance/time);
        double speedms= speedkmh*1000.0/3600.0;
        System.out.println(speedms);
    }
}
