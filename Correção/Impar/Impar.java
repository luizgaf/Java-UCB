import java.util.Scanner;
public class Impar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        double result = 0;
        System.out.println("Entre com um numero: ");
        num = sc.nextInt();

        for(int i = 0; i < num; i++){
            result += 2*i+1;
        }
        System.out.printf("Resultado %.0f", result);
    }
}