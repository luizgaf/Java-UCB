public class Juro{
    public static double getFees(double value, int y){
        double r = 0.05;
        return value* Math.pow((1+r),y );
    }
    public static void main(String[] args) {
        double value = 1000;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Year %d = $ %.2f %n", (i+1), getFees(value, (i+1)));
        }
    }
}