import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0; // used double so no need to cast later

        while(scanner.hasNextInt()){
            sum += scanner.nextInt();
            count++;
        }
        long avg = Math.round(sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
