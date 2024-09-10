import java.util.Scanner;

public class BancoApp{

    private static Double saldo = 0.0;

    public static String getSaldo(){
        String aux = String.format("R$ %.2f", saldo);
        return aux;
    }

    public static void setDeposito(double value){
        BancoApp.saldo += value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean status = true;

        while (status) { 
            System.out.println("Qual funcao quer realizar:");
            System.out.println("1 - Ver saldo");
            System.out.println("2 - Deposito");
            System.out.println("3 - Sair");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Seu saldo: "+ getSaldo());
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Quanto deseja depositar?:");
                    double value = sc.nextDouble();
                    setDeposito(value);
                    System.out.println("Valor adicionado!");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Encerrando....");
                    status = false;
                    break;
                default:
                    System.err.println("Resposta invalida!");
            }
        }
    }
    


}