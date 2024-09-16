import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o numero da conta: ");
        int accountNumber = sc.nextInt();
        
        System.out.print("Digite o saldo no inicio do mês: ");
        int initialBalance = sc.nextInt();
        
        System.out.print("Digite o total de todos os itens cobrados neste mês: ");
        int totalCharges = sc.nextInt();
        
        System.out.print("Digite o total de créditos aplicados neste mês: ");
        int totalCredits = sc.nextInt();
        
        System.out.print("Digite o limite de crédito autorizado: ");
        int creditLimit = sc.nextInt();
        
        int newBalance = initialBalance + totalCharges - totalCredits;

        System.out.println("Conta numero: "+ accountNumber);
        System.out.println("Novo saldo: " + newBalance);
        
        if (newBalance > creditLimit) {
            System.out.println("Limite de crédito excedido");
        } else {
            System.out.println("Limite de crédito dentro do permitido");
        }
    }
}
