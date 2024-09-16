import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalKm = 0, totalL = 0;

        System.out.println("Quantas corridas voce quer adicionar?");
        int num = sc.nextInt();

        int[] kilometer = new int[num];
        int[] litre = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Quantos Km foram percorridos a viagem "+ (i+1));
            kilometer[i] = sc.nextInt();

            System.out.println("Quantos Litros foram consumidos na viagem "+ (i+1));
            litre[i] = sc.nextInt();

            totalKm += kilometer[i];
            totalL += litre[i];
        }
        for (int i = 0; i < num; i++){
            System.out.println("Media viagem "+ (i+1) +(": ") + (kilometer[i]/litre[i]) + ("Km/L"));
        }
        System.out.println("Total km: "+ (totalKm));
        System.out.println("Total Litres: "+ (totalL));
    }
}