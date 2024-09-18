import java.util.Scanner;
public class Minor{
    private static Integer minor = null;
    public static void setMinor(int num){
        if(minor == null){
            minor = num;
        }
        if(num < minor){
           minor = num;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to add");
        int num = sc.nextInt();
        int[] nums = new int[num];
        System.out.println("Digite os numeros");
        for(int i = 0; i < num; i++){
           nums[i] = sc.nextInt(); 
           setMinor(nums[i]);
        }
        System.out.println("The minor is "+ minor);
    }
}