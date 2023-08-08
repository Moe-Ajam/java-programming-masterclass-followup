public class TestingClass {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,2021));
    }

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

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || month > 12) return -1;
        if(year < 1 || year > 9999) return -1;
        if (isLeapYear(year) && month == 2){
            return 29;
        } else if (!isLeapYear(year) && month == 2){
            return 28;
        }
        switch (month){
            case 1:
                return 31;
            case 3:
                return 31;
            case 5:
                return 31;
            case 7:
                return 31;
            case 8:
                return 31;
            case 10:
                return 31;
            case 12:
                return 31;
            case 4:
                return 30;
            case 6:
                return 30;
            case 9:
                return 30;
            case 11:
                return 30;
            default: return -1;
        }
    }
}
