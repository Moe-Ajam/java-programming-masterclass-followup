public class CodeHistory {
    public static void main(String[] args) {
        System.out.println(FlourPacker.canPack(2, 0, 10));
    }
}
// I'll check if I can make the count with big bags alone
// if not then I'll use as much big bags as I before I reach the max
// then I'll fill the remaining will small bags
// if I can reach the full amount with that -> return true

// 1 big bag = 5 kilos
// 1 small bag = 1 kilo
// goal is in kilos
class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) { // #1 validation
            return false;
        }

        while (bigCount > 0 && goal >= 5) { // #2 subtract 5 from goal for each bigCount
            goal -= 5;
            bigCount--;
        }
        return smallCount >= goal; // #3 make sure enough smallCount to fill remaining goal
    }

}
