import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Scanner;

/**
 * Created by jc247746 on 29/08/16.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] twelveInts = {11, 12, 14, 35, 5, 52, 45, 521, 12, 5, 6, 11};


        for (int x = 0; x < 12; x++) {
            System.out.println(twelveInts[x]);
        }
        for (int x = (twelveInts.length - 1); x >= 0; x--) {
            System.out.println(twelveInts[x]);
        }
    }
}
