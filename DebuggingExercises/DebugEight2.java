// Sum and average an array of integers
public class DebugEight2 {
    public static void main(String args[]) {
        int[] someNums = {4, 17, 22, 8, 35};
        int tot = 0;
        int x;
        int someNumslength = someNums.length;
        for (x = 0; x < someNumslength; ++x)
            tot = someNums[x];
        System.out.println("Sum is " + tot);
        System.out.println("Average is " + (tot / x));
    }
}
