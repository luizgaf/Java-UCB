import java.util.Scanner;
import java.lang.StringBuilder;

public class Criptografar{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] digit= new int[4];

        System.out.println("Digite um numero de 4 digitos: ");
        String code = sc.next();

        for (int i = 0; i < 4; i++) {
            digit[i] = Integer.parseInt(String.valueOf(code.charAt(i)));
            
            digit[i] += 7;
            if(digit[i] > 9){
                digit[i] -= 10;
            }
        }
        for (int i = 0; i < 2; i++) {
            int aux = digit[i];
            digit[i] = digit[i+2];
            digit[i+2] = aux;
        }
        StringBuilder sb = new StringBuilder();
        for(int di : digit){
            sb.append(di);
        }
        String crip = sb.toString();
        System.out.println("Numero criptografado: "+ crip);
        
    }
}