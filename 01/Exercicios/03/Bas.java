import java.util.Scanner;

public class Bas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a:");
        int a = sc.nextInt();

        System.out.println("Digite b:");
        int b = sc.nextInt();

        System.out.println("Digite c:");
        int c = sc.nextInt();

        double delta = Math.pow(b , 2) - 4 * a * c;
        if(delta >= 0){
        double x1 = (-b + Math.sqrt(delta))/ (2*a);
        double x2 = (-b - Math.sqrt(delta))/ (2*a);

        System.out.printf("x1 = %.2f x2 = %.2f", x1, x2);
        }
        else{
           System.out.println("Delta nao pode ser menor que zero, pois as raízes são complexas") ;
        }
    }
}