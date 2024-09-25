public class Program{
    public static int minor = 1000;
    public static int maior = 0;
    public static int media;
    public static int negativePlus = 0;
    public static int firstOccurrences = 0;
    public static int firstNumber;

    public static void getMinor(int number){
        if(number < minor){
            minor = number;
        }
    }
    public static void getMaior(int number){
        if(number > maior){
            maior = number;
        }
    }
    public static void getMedia(int number){
        media += number;
    }
    public static void getNegativePlus(int number){
        if(number < 0){
            negativePlus += number;
        }
    }
    public static void firstOccurrences(int number){
        if(firstOccurrences == 0){
            firstNumber = number;
        }
        if(firstNumber == number){
            firstOccurrences++;
        }
    }
    public static void getPair(int number){
        if(number%2 ==0){
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {12, -2, 4, 8, 29, 45, 78, 36, -17, 2, 12, 8, 3, 3,-52};
        int quantity = 0;
        for (int num : nums) {
            getMinor(num);
            getMaior(num);
            getMedia(num);
            getNegativePlus(num);
            firstOccurrences(num);
            quantity++;
        }

        System.out.println("Menor numero: "+ minor);
        System.out.println("Maior numero: "+ maior);
        System.out.println("Media: "+ (media/quantity));
        System.out.println("Soma dos negativos: "+ negativePlus);
        System.out.println("Ocorrencias do numero "+ firstNumber +": "+ firstOccurrences);
        System.out.print("Numero pares: ");
        for (int num : nums) {
            getPair(num);
        }
    }
}