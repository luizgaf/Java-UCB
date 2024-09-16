import java.lang.StringBuilder;
import java.util.Scanner;

public class Descriptografar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero de 4 digitos para descriptografar: ");
        String code = sc.next();

        int[] digit = new int[4];

        for (int i = 0; i < 4; i++) {
            digit[i] = Integer.parseInt(String.valueOf(code.charAt(i)));

            digit[i] -= 7;
            if(digit[i] < 0){
                digit[i] += 10;
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
        String descrip = sb.toString();
        System.out.println("Numero descriptografado: "+ descrip);
    }
}