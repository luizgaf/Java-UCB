import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero: ");
		int num1 = sc.nextInt();

		System.out.println("Digite outro numero: ");
		int num2 = sc.nextInt();	

		System.out.printf("%d + %d = %d%n", num1, num2, num1+num2);
		System.out.printf("Raiz de %d = %.2f%n", num1, Math.sqrt(num1));
		System.out.printf("Quadrado de %d = %.2f", num2, Math.pow(num2, 2));	
		
	}
}