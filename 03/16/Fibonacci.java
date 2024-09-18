import java.util.Scanner;
public class Fibonacci{

    public static Double fib(int n){
        int  x2 = 1;
        /* calcular n-esimo termo */
        if (n < 3) {
            System.out.println("Favor inserir valor maior que 3");
        }
        else{
            int aux = 1, x1 = 1;
            for (int i = 0; i < (n-1); i++) {
                x1 += x2;
                x2 = aux;
                aux = x1;
            }
            
        }
        return (double)x2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite n para descobrir n-esimo termo da sequencia de fibonacci");
        int num = sc.nextInt();

        System.out.println("O "+ num + "o termo da sequencia e "+ String.format("%.0f", fib(num)));
    }
}