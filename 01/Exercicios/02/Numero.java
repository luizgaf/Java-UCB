import java.util.Scanner;

public class Numero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int num = sc.nextInt();

        int r1 = num%10000;
        int r2 = num%1000;
        int r3 = num%100;
        int r4 = num%10;

        System.out.printf("%d   %d   %d   %d   %d", num/10000, r1/1000, r2/100, r3/10, r4)  ; 

    }
}