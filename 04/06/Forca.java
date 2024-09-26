import java.util.Scanner;

public class Forca{

    public static void printForca(char[] gameChars){
        for (char c : gameChars) {
            System.err.print(c + " ");
        }
    }

    public static boolean ifWin(char[] game){
        for (char c : game) {
            if(c == '_'){
                return false;
            }
        }
        return true;
    }

    public static void printBoneco(int i){
        switch (i) {
            case 6:
                System.out.println("");
                break;
            case 5:
                System.out.println("  O");
                break;
            case 4:
                System.out.println("  O");
                System.out.println("  |");
                break;
            case 3:
                System.out.println("  O");
                System.out.println(" /|");
                break;
            case 2:
                System.out.println("  O");
                System.out.println(" /|\\");
                break;
            case 1:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / ");
                break;
            case 0:
                System.out.println("  O");
                System.out.println(" /|\\");
                System.out.println(" / \\");
                break;
            default:
                throw new AssertionError();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String word = sc.next();
        // nao adicionei verificacao de palavra e repeticao de caractere errado 

        char[] gabaritoForca = word.toCharArray();
        
        int caseNumber = word.length();

        char[] gameChars = new char[caseNumber];
        for(int i=0; i<caseNumber; i++){
            gameChars[i] = '_';
        }
        System.out.println("Forca com "+ caseNumber +" caracteres");
        boolean gameon = true;
        int chances = 6;

        while (gameon) { 
            printForca(gameChars);
            System.out.println("Chances: "+ chances);
            printBoneco(chances);

            System.out.println("Entre com algum caractere");
            String anstring = sc.next();
            char ans = anstring.charAt(0);

            boolean hasChar = false;

            for (int i = 0; i < caseNumber; i++) {
                if(gabaritoForca[i] == ans){
                    gameChars[i] = ans;
                    hasChar = true;
                }
            }
            if(!hasChar){
                chances--;
            }


            if(ifWin(gameChars)){
                System.out.println("Voce venceu!");
                System.out.println("Palavra: "+ word);
                gameon = false;
            }
            if( chances == 0){
                System.out.println("Voce perdeu!");
                printBoneco(chances);
                System.out.println("Palavra: "+ word);
                gameon = false;
            }
        }
    }

}