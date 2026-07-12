/** Class that prints the Collatz sequence starting from a given number.
 *  @author Zhang Yihao
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    /**
 * Returns the next number in the Collatz sequence after the given number.
 * If n is even, returns n/2. If n is odd and greater than 1, returns 3n+1.
 * @param n current number in the sequence (assumes n > 1)
 * @return the next number in the sequence
 */
    public static int nextNumber(int n) {
        if (n%2==0){
            return n/2;
        } else{
            return 3*n+1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

