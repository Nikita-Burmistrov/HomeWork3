import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int o, l;
        System.out.println("Введите чётное число:");
        l = in.nextInt();
        for (o = 0; o < l; o+=2) {
            System.out.println("Счёт:" + o);
        }
    }
}