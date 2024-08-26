import java.util.Scanner;
public class EhPrimo{
    public static int ehPrimo(int num){
        int bool = 1;
        for(int i=2; i<num; i++){
            if(num%i==0){
                bool = 0;
                break;
            }
        }
        return bool;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num, contador = 0, n = 2;
        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        while(contador<num){
            if(EhPrimo.ehPrimo(n) == 1){
                contador++;
            }
            n++;
        }
        System.out.printf("O %d* numero primo e %d", num, n-1);
    }
}