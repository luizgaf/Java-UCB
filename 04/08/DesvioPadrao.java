import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class DesvioPadrao{
    public static ArrayList<Integer> nList = nList = new ArrayList<>();;

    public static void addNum(int n){
         nList.add(n);
    }

    public static double getMedia(){
        double media = 0.0;
        for (int i : nList) {
            media += i;
        }
        return (media/nList.size());
    }

    public static double getDesvio(){
        double numerator = 0.0;
        for (int i : nList) {
            numerator+=(Math.pow((i - getMedia()), 2));
        }

        return (Math.sqrt(numerator/(nList.size()-1)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros quer adicionar");
        int ans = sc.nextInt();

        for(int i = 0; i < ans; i++){
            System.out.println("Numero "+ (i+1));
            int num = sc.nextInt();
            addNum(num);
        }
        System.out.println("Media: "+ getMedia());
        System.out.println("Desvio: "+ getDesvio());
    }
}