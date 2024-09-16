import java.util.Scanner;

public class Quadrado{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tamanho da linha do quadrado:");
        int tam = sc.nextInt();

        for (int i = 0; i < tam; i++) {
            if(i == 0 || i == (tam-1)){
                for (int j = 0; j < tam; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            else{
                System.out.print("*");
                for (int j = 1; j < (tam - 1); j++) {
                System.out.print(" ");
                }
                System.out.print("*");
                System.out.println("");
            }
        }
    }
}