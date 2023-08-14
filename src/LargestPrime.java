public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) return -1;

        int currentPrime = number;
        for (int i = 2; i <= number; i++) {
            for (int j = 2; j <= number; j++) {
                if (i * j == number)
                    if (i > j) {
                        currentPrime = i;
                    } else {
                        currentPrime = j;
                    }
            }
        }

        return currentPrime;
    }
}
