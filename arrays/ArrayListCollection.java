import java.util.ArrayList;
// Generic ArrayList<T> collection demonstration
// video https://learning.oreilly.com/videos/java-8-fundamentals/9780133489354/9780133489354-JFUN_lesson07_17
/*
Display list of contents with counter controlled loop yellow redformat yellow red
format yellow red green yellow
format red yellow
"red" is
in the listSize: 2
*/
public class ArrayListCollection {

    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow"); // inserts yellow at index position 0

        System.out.print("Display list of contents with counter controlled loop");

        for (int i = 0; i < items.size(); i++) {
            System.out.printf(" %s", items.get(i));
        }
        display(items, "%nDisplay list contents with enhanced statement: ");
        items.add("green");
        items.add("yellow");
        display(items, "list with two new elements:");
        items.remove("yellow");
        items.remove(1);
        display(items, "removed second list element");

        System.out.printf("\"red\" is %s%nin the list", items.contains("red") ? "": "not ");

        System.out.printf("Size: %s%n", items.size());
    }

    private static void display(ArrayList<String> items, String header) {
        System.out.printf("format", header);

        for (String item : items) {
            System.out.printf(" %s", item);
        }
        System.out.println();
    }
}