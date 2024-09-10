import javax.swing.JOptionPane;

public class BancoAppJavax{

    private static Double saldo = 0.0;

    public static String getSaldo(){
        String aux = String.format("R$ %.2f", saldo);
        return aux;
    }

    public static void setDeposito(double value){
        BancoAppJavax.saldo += value;
    }

    public static void main(String[] args) {
        boolean status = true;

        String[] opcoes = {"Ver Saldo", "Depositar", "Sair"};

        while (status) { 
            int option = JOptionPane.showOptionDialog(  null,
                                                        "Escolha uma opção:",
                                                        "Banco",
                                                        JOptionPane.DEFAULT_OPTION,
                                                        JOptionPane.INFORMATION_MESSAGE,
                                                        null,
                                                        opcoes,
                                                        opcoes[0]
                                                    );

            switch (option) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Seu saldo: "+ getSaldo());
                    break;
                case 1:
                    String sValue = JOptionPane.showInputDialog(null, "Digite a quantia desejada em R$");

                    try {
                        Double value = Double.parseDouble(sValue);
                        setDeposito(value);
                        JOptionPane.showMessageDialog(null, "Valor adicionado!");
                    } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor inválido. Por favor insira um número.");
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Programa Encerrado");
                    status = false;
                    break;   
            }
        }
    }
    


}