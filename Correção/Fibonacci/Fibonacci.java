import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 = 1, num2 = 1, aux;
        int pos;
        System.out.printf("Qual a posicao do termo de fibonacci: ");
        pos = sc.nextInt();
        for(int i = 2; i < pos; i++){
            aux = num2;
            num2 += num1;
            num1 = aux;
        }
        System.out.printf("O %d* termo da sequencia de fibonacci e %.0f", pos, num2);
    }
}