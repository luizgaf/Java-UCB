import java.util.Scanner;
public class Sqrt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero N para saber o quadrado");
        int num = sc.nextInt();
        int result = 0;

        for (int i = 1, count = 0; count < num; count++, i+=2) {
            result += i;
        }
        System.out.println("O quadrado de "+ num + " e igual a "+ result);
    }
}