import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int num1 = sc.nextInt();
        System.out.println("Digite outro numero:");
        int num2 = sc.nextInt();

        System.out.printf("Soma: %d %nProduto: %d %nDiferenca: %d %nDivisao: %d", num1+num2, num1*num2, num1 - num2, num1/num2);
    }
}