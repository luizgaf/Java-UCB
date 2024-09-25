import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        boolean status = true;
        int i = 0;

        while (status) {
            int auxi;

            while (true) {
                System.out.println("Insira um número entre 10 e 100:");
                auxi = sc.nextInt();
                if (auxi >= 10 && auxi <= 100) {
                    break;
                } else {
                    System.out.println("Número fora do intervalo, tente novamente.");
                }
            }
            boolean duplicado = false;

            for (int j = 0; j < i; j++) {
                if (nums[j] == auxi) {
                    duplicado = true;
                    break;
                }
            }

            if (duplicado) {
                System.out.println("Número existente, tente outro.");
            } else {
                nums[i] = auxi;
                i++;
            }

            System.out.print("Números ocupados: ");
            for (int j = 0; j < i; j++) {
                System.out.print(nums[j] + " ");
            }
            System.out.println();

            if (i == 5) {
                status = false;
            }
        }

        System.out.print("Números finais: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
