package Zadatak_4;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * The Class LinkedListTime.
 */
public class LinkedListTime {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// 5 miliona cijelih brojeva  5000 postavke
		
		List<Integer> integers = generateIntegerList(5000);
        long timeStart = System.currentTimeMillis();
        for (Integer integer : integers) {
            Integer ref = integer;
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Vrijeme koje je potrebno da se prode kroz listu upotrebljen iterator:");
        System.out.println(formatTime(timeEnd - timeStart));

        timeStart = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            Integer ref = integers.get(i);
        }
        timeEnd = System.currentTimeMillis();
        System.out.println("Vrijeme koje je potrebno da se prode kroz listu koristeci se get(index) metodom:");
        System.out.println(formatTime(timeEnd - timeStart));
    }

    /**
     * Format time.
     *
     * @param millis the millis
     * @return the string
     */
    private static String formatTime(long millis) {
        return String.format("%02d:%02d:%02d.%03d", TimeUnit.MILLISECONDS.toHours(millis),
                TimeUnit.MILLISECONDS.toMinutes(millis) % TimeUnit.HOURS.toMinutes(1),
                TimeUnit.MILLISECONDS.toSeconds(millis) % TimeUnit.MINUTES.toSeconds(1),
                millis % 1000);
    }

    /**
     * Generate integer list.
     *
     * @param size the size
     * @return the list
     */
    private static List<Integer> generateIntegerList(int size) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add((int) (Math.random() * size));
        }
        return list;
    }
}
		
		
		
		
		
	


