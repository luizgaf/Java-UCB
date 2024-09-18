public class Pi{

    public static void main(String[] args) {
        double pi = 0;
        long maxTerms = 200000;
        double divisor = 1;

        for (int i = 0; i < maxTerms; i++) {
            
            pi += 4/divisor;
            pi *= -1;
            divisor += 2;
        }
        System.out.println("Aproximação de Pi após " + maxTerms + " termos: " + pi);
    }
}