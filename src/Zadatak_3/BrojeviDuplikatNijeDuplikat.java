package Zadatak_3;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * The Class BrojeviDuplikatNijeDuplikat.
 */
public class BrojeviDuplikatNijeDuplikat {

    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        int[] intArr = new int[] { 1, 4, 1, 2, 1, 3, 4, 6, 2, 8 };

        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();

        for (int i = 0; i < intArr.length; i++) {
            // take first element and then matched complete array
            int temp = intArr[i];
            int count = 0;

            for (int j = 0; j < intArr.length; j++) {
                if (temp == intArr[j]) {
                    // element matched -- break
                    count++;
                }
            }
            map.put(temp, count);
        }

        Set<Integer> duplicate = new LinkedHashSet<Integer>();
        Set<Integer> noDuplicate = new LinkedHashSet<Integer>();

        for (int i = 0; i < intArr.length; i++) {
            if (map.containsKey(intArr[i])) {
                System.out.println("Broj :" + intArr[i] + "  Vrijednost : " + map.get(intArr[i]));

                if (map.get(intArr[i]) > 1) {
                    // means repeated character
                    duplicate.add(intArr[i]);

                } else {
                    // non repeated character
                    noDuplicate.add(intArr[i]);
                }
            }
        }

        System.out.println("Duplikati na pozicijama : " + Arrays.toString(duplicate.toArray()));
        System.out.println("Nisu duplikati na pozicijama : " + Arrays.toString(noDuplicate.toArray()));

    }

}