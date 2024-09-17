import java.util.Scanner;

public class Factorial{
    public static long  getFactorial(int num){
        if(num == 0 || num == 1){
            return 1;
            }
        if (num > 25) {
            System.err.println("The result is very long");
            return 0;
        }
        else{
            return num * getFactorial(num - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        	int num = sc.nextInt();
        
        System.out.println("Factorial of " + num + " is " + getFactorial(num));
    }
}