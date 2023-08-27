import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTemp {

}

record GroceryItem(String name, String type, int count)
{
    public GroceryItem(String name){
        this(name, "DIARY", 1);
    }
}

class Main1
{
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("Butter"));
        objectList.add("Yogurt");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        // groceryList.add("Yogurt"); -- wrong because it's not a GroceryItem element
    }
}