public class Product{
    public static Integer product(int i){
        int product = 0;
        if (i <= 1) {
            return 1;
        } 
        if (i % 2 != 0) {
            return i * product(i - 2);
        }
        else{
        return product(i - 1);
        }
    }
    public static void main(String[] args) {
        System.out.println(product(15));   
    }
}