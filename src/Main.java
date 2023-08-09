public class Main {

    public static void main(String[] args) {

    }

}

class NumberToWords {
    public static void numberToWords(int number){
        if (number < 0) System.out.println("Invalid Value");
        else {
            while(number > 0){

            }
        }
    }
}

class PerfectNumber {
    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;

        // to skip itself
        int temp  = number -1;
        int sum = 0;

        while (temp > 0){
            if(number % temp == 0) sum += temp;
            temp --;
        }

        if (sum == number) return true;
        else return false;

    }
}

class NumberPalindrome {

    // return true if the number is palindrome number
    public static boolean isPalindrome(int number) {

        // find the reverse of the number and store in a variable
        int reverse = 0;
        int temp = number;

        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (Math.abs(number) == reverse){
            return true;
        } else return false;
    }
}

class SumOddRange {
    public static boolean isOdd(int num) {
        if (num < 0) return false;

        if (num % 2 != 0) return true;
        else return false;
    }

    public static int sumOdd(int start, int end) {
        if (start > end || start < 0 || end < 0) {
            return -1;
        } else {
            int sum = 0;
            for (int i = start;i<=end;i++){
                if(isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
    }

}

class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) return -1;
        if (year < 1 || year > 9999) return -1;
        if (isLeapYear(year) && month == 2) {
            return 29;
        } else if (!isLeapYear(year) && month == 2) {
            return 28;
        }
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 31;
            case 4, 6, 9, 11:
                return 30;
            default:
                return -1;
        }
    }
}

class NumberInWord {
    public static void printNumberInWord(int num) {
        switch (num) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}

class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temp) {
        if (summer && (temp >= 25 && temp <= 45)) {
            return true;
        } else if (!summer && (temp >= 25 && temp <= 35)) {
            return true;
        } else return false;
    }
}

class IntEqualityPrinter {
    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if (x == y && x == z) {
            System.out.println("All numbers are equal");
        } else if (x != y && x != z && y != z) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}

class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        //1 hour = 60 minutes
        //1 day = 24 hours
        //1 year = 365 days

        if (minutes < 0) System.out.println("Invalid Value");
        else {
            int years = (int) (minutes / 60 / 24 / 365);
            int remainder = (int) (minutes % 525600); // 60 * 24 * 365 = 525,600
            System.out.println("remainder is " + remainder);
            int days = remainder / 365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }


}

class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0d;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0d;
        }
        return x * y;
    }
}

class TeenNumberChecker {

    public static boolean hasTeen(int n1, int n2, int n3) {
        if ((n1 >= 13 && n1 <= 19) || (n2 >= 13 && n2 <= 19) || (n3 >= 13 && n3 <= 19)) {
            return true;
        } else return false;
    }

    public static boolean isTeen(int n1) {
        if (n1 >= 13 && n1 <= 19) {
            return true;
        } else return false;
    }

}

class EqualSumChecker {
    public static boolean hasEqualSum(int n1, int n2, int n3) {
        if (n1 + n2 == n3) {
            return true;
        }
        return false;
    }
}

class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        if ((int) firstNumber * 1000 == (int) secondNumber * 1000) {
            return true;
        }
        return false;
    }
}

class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 0 || year >= 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}

class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        }
        return false;
    }
}

class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1l;
        }
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}

class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }
}