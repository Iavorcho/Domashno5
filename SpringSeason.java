import java.util.Scanner;

public class SpringSeason {
        public static void main(String[] args) {
            System.out.println("Въведете месец: ");
            Scanner sc1 = new Scanner(System.in);
            int month = sc1.nextInt();
            System.out.println("Въведете ден: ");
            Scanner sc2 = new Scanner(System.in);
            int day = sc2.nextInt();
            boolean trueFalse = ((month == 3) && (day > 19)) || ((month == 6) && (day < 21)) || ((month > 3) && (month < 6));
            System.out.println(trueFalse);


    }
}
