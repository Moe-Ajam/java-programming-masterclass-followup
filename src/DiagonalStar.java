public class DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else {
            for (int i=1;i<=number;i++){
                for (int j=1;j<=number;j++){
                    //if(i==1 || j == 1 || i==number || j ==number || (i == j) || (i == (number - j + 1)))
                    if(i==1 || j == 1) {
                        System.out.print("*");
                    } else if(j == number || i == number){
                        System.out.print("*");
                    } else if ((i == (number - j + 1))){
                        System.out.print("*");
                    } else if(i==j){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
