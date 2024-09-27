import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> arrayList = new ArrayList<>();
        HashSet<Double> hashSet = new HashSet<>();
        long addArrayStart, addArrayEnd, addHashStart, addHashEnd, searchArrayStart, searchArrayEnd, searchHashStart, searchHashEnd;

        addArrayStart = System.currentTimeMillis();
        for (double i = 0.0; i < 30000; i++) {
            arrayList.add(i);
        }
        addArrayEnd = System.currentTimeMillis();

        searchArrayStart = System.currentTimeMillis();
        for (double d : arrayList) {
            ;
        }
        searchArrayEnd = System.currentTimeMillis();

        addHashStart = System.currentTimeMillis();
        for (double i = 0.0; i < 30000; i++) {
            hashSet.add(i);
        }
        addHashEnd = System.currentTimeMillis();

        searchHashStart = System.currentTimeMillis();
        for (double d : hashSet) {
            ;
        }
        searchHashEnd = System.currentTimeMillis();

        System.out.println();
        System.out.println("Procura                        Adicionar        Diferença");
        System.out.println("HASH      " + (searchHashEnd - searchHashStart) + " ms       HASH         " + (addHashEnd - addHashStart) + " ms            " + ((searchHashEnd - searchHashStart) - (addHashEnd - addHashStart)) + " ms");
        System.out.println("ARRAYLIST " + (searchArrayEnd - searchArrayStart) + " ms     ARRAYLIST    " + (addArrayEnd - addArrayStart) + " ms            " + ((searchArrayEnd - searchArrayStart) - (addArrayEnd - addArrayStart)) + " ms");
    }
}
