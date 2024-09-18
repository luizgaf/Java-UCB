import java.util.Scanner;
public class Cos{
    public static Double factorial(double num){
        if(num == 0 || num == 1){
            return 1.0;
        }
        else{
            double fac = 1.0;
            for (double i = num; i > 0; i--) {
                fac *= i;
            }
            return fac;
        }
    }

    public static Double cos(double num){
        double cos = 1;
        for (int i = 0, var = 2; i < 7 /* 7 termos sao calculados para melhor aproximacao */; var+=2, i++) {
            if( i % 2 == 0){
                cos -= (Math.pow(num, var)/factorial(var));
            }
            if(i % 2 != 0){
                cos += (Math.pow(num, var)/factorial(var));
            }
        }
        return cos;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero x para saber o cosseno");
        double x = sc.nextDouble();

        System.out.println("O cosseno de "+ String.format("%.0f", x) +" e aproximado a " + cos(x));
    }
}