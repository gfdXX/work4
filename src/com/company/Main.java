import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите а: ");
        int a = in.nextInt();
        System.out.println("Введите b: ");
        int b = in.nextInt();

        System.out.println(integRal(a,b));

    }
    static double integRal(int a, int b) {
        System.out.println("Интеграл: ");
        double f1 = Math.pow(a, 5)/5 + Math.pow(a, 3)/3 + Math.pow(a, 2)/2 - 7*a;
        double f2 = Math.pow(b, 5)/5 + Math.pow(b, 3)/3 + Math.pow(b, 2)/2 - 7*b;
        double integral = f2 - f1;
        return  integral;

    }
}


