import java.util.Scanner;

public class Zadacha1 { // Програма за изчисляване на дистанция

    public static void main(String[] args) {
        System.out.println("Въведете първото число: ");
        Scanner sc1 = new Scanner(System.in);
        double x = sc1.nextDouble();
        System.out.println("Въведете първото число: ");
        Scanner sc2 = new Scanner(System.in);
        double y = sc2.nextDouble();
        System.out.println("Резултата е: " +(Math.sqrt(Math.pow(x,2)+Math.pow(y,2))) );


    }

}
