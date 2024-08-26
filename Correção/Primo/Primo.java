import java.util.Scanner;
public class Primo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero para verificar se ele e primo:");
        int num = sc.nextInt();
        int truenum = 1; 
        for(int i = 2; i < num; i++){
            if(num%i==0){
                System.out.printf("Ele nao e primo pois %d e divisivel por: %d%n", num, i);
                truenum = 0;
                break;
            }
        }
        if(truenum == 1){
            System.out.printf("%d e primo", num);
        }

    }
}