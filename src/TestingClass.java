public class TestingClass {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number) {

        // find the reverse of the number and store in a variable
        int reverse = 0;
        int temp = Math.abs(number);

        while (temp  > 0) {
            reverse = reverse * 10 + temp  % 10;
            temp =  temp / 10;
        }

        if (Math.abs(number) == reverse){
            return true;
        } else return false;
    }
}
