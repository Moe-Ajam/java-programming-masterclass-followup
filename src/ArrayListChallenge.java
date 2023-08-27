
// interactive console program.
// give the user a menu of options:
// 0 - to shutdown
// 1 - to add item(s) to list (comma delimited list)
// 2 - remove any item (comma delimited list)
// Enter a number for which action you want to do

/*
    your grocery list should be an ArrayList.
    check if items exist in the list, and print a sorted list
    you should print the list, sorted alphabetically, after each operation
    you shouldn't allow duplicate items in the list
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default -> flag = false;
            }

            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }
    }

    public static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    public static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]:");
        String[] items = scanner.nextLine().split(",");
        for (String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    private static void printActions() {
        String textBlock = """
                Available actions:
                0 - to shutdown
                1 - to add item(s) to list (comma delimited list)
                2 - to remove any items (comma delimited list)
                Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }
}