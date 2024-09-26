import java.util.Scanner;

public class Velha{

    public static char[] [] tabuleiro = new char[3] [3];
    public static char winner;

    public static void defaultTabuleiro(){
        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = ' ';
            }
        }
    }

    public static void printTabuleiro(){
        int line = 1;
        for (char[] linha: tabuleiro) {
            for (char casa : linha) {
                System.out.print("[ "+ casa +" ]");
            } 
            System.out.println(" "+ line);
            line++;
        }
        System.out.println("  1    2     3 ");
    }

    public static boolean play(int x, int y, int player){
        //verificar se esta livre
        if(tabuleiro[(x-1)][(y-1)] == ' ' ){
            tabuleiro[(x-1)][(y-1)] = ifPlayer(player);
            return false;
        }
        else{
            System.err.println("A casa não está vazia");
            return true;
        }
    }

    public static int alternator(int i){
        if(i == 1){
            return 2;
        }
        if(i == 2){
            return 1;
        }
        return 0;
    }

    public static char ifPlayer(int i){
        if(i == 1){
            return 'X';
        }
        if(i == 2){
            return 'O';
        }
        else{
            return ' ';
        }
    }

    public static boolean isTie(){
            int casaPreenchida = 0;
            for (char[] linha : tabuleiro) {
                for(char casa : linha){
                    if(casa != ' '){
                        casaPreenchida++;
                    }
                }
            }
            if(casaPreenchida == 9){
                return true;
            }
            else{
            return false;
            } 
    }  
    public static boolean isWin() {
    return checkWin('X') || checkWin('O');
    }

    private static boolean checkWin(char player) {
        // linhas
        if (tabuleiro[0][0] == player && tabuleiro[0][1] == player && tabuleiro[0][2] == player) { winner = player; return true; }
        if (tabuleiro[1][0] == player && tabuleiro[1][1] == player && tabuleiro[1][2] == player) { winner = player; return true; }
        if (tabuleiro[2][0] == player && tabuleiro[2][1] == player && tabuleiro[2][2] == player) { winner = player; return true; }
        
        // colunas
        if (tabuleiro[0][0] == player && tabuleiro[1][0] == player && tabuleiro[2][0] == player) { winner = player; return true; }
        if (tabuleiro[0][1] == player && tabuleiro[1][1] == player && tabuleiro[2][1] == player) { winner = player; return true; }
        if (tabuleiro[0][2] == player && tabuleiro[1][2] == player && tabuleiro[2][2] == player) { winner = player; return true; }
        
        // diagonais
        if (tabuleiro[0][0] == player && tabuleiro[1][1] == player && tabuleiro[2][2] == player) { winner = player; return true; }
        if (tabuleiro[2][0] == player && tabuleiro[1][1] == player && tabuleiro[0][2] == player) { winner = player; return true; }
        
        return false;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean game = true;
        int playerNumber = 1;
        defaultTabuleiro();

        while(game){
            boolean verifier = true;
            while(verifier){
                System.out.println("Your turn: Player "+ playerNumber);
                printTabuleiro();
                System.out.println("Digite as coordenadas 1 2 3 ( COLUNA ) e 1 2 3 ( LINHA )");
                int y = sc.nextInt(); 
                int x = sc.nextInt();
                verifier = play(x, y, playerNumber);
            }
            if(isWin()){
                printTabuleiro();
                System.out.println("Vitoria! do jogador de marcação '"+ winner +"'");
                game = false;
            }

            if(isTie()){
                printTabuleiro();
                System.out.println("EMPATE!");
                game = false;
            }        
            playerNumber = alternator(playerNumber); 

        }
    }
}

