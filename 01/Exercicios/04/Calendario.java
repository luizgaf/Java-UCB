import java.util.Scanner;

public class Calendario{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma quantidade em segundos: ");
        int ammount = sc.nextInt();

        int seg = 0, min = 0, hour = 0, days = 0;

        for(int i = 0; i < ammount; i++){
            seg++;
            if(seg == 60){
                min++;
                seg = 0;
            }
            if(min == 60){
                hour++;
                min = 0;
            }
            if(hour == 24){
                days++;
                hour = 0;
            }
        }

        System.out.printf("%d dias : %d horas : %d minutos : %d segundos", days, hour, min, seg);

    }
}