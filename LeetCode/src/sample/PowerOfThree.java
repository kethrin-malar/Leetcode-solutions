//326 Power of Three

package sample;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 27;
        PowerOfThree powerOfThree = new PowerOfThree();
        
        System.out.println("Is " + n + " a power of three? " + powerOfThree.isPowerOfThree(n));
    }
}
