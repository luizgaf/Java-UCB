import java.util.Scanner;


public class Parentese{
    public static int occurrencies = 0;


    public static boolean verifyParenteses(char ch){
            if( ch == '('){
                occurrencies++;
                return true;
            }
            if( ch == ')'){
                occurrencies--;
                if(occurrencies == 0){
                    return true;
                }
                if(occurrencies < 0){
                    return false;
                }
            }
            else{
                return false;
            }
            return true;
    }


    public static void main(String[] args) {
        boolean result = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com uma expressão de parenteses:");
        String pa = sc.next();
        
        char[] ch = pa.toCharArray();
        if(ch[0] == ')'){
            System.out.println("ERROR");
            System.exit(0);
        }
        for(char cr : ch){
            result = verifyParenteses(cr);
            if(result == false){
                break;
            }
        }
       
       
        if(result == true){
            System.out.println("OK!");
            System.exit(1);
        }
        else{
            System.out.println("ERROR");
            System.exit(0);
        }
       
    }
}
