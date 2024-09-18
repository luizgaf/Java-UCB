import java.util.Scanner;
public class Prime{
    public static boolean isPrime(int num){
        if (num <= 1) {
        return false;
    }
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se ele e primo");
        int num = sc.nextInt();

        if(isPrime(num) == true){
            System.out.println("O numero é primo");
        }
        else{
            System.out.println("O numero não é primo");
        }
    }
}