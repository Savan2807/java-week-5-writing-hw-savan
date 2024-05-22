import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string)
 * and printout the collection using for each loop.
 */


public class Programme_4_ColourArrayList {
    public static void main(String[] args) {
        AbstractList<String> colourelist = new ArrayList<>();
        colourelist.add("Red");
        colourelist.add("Blue");
        colourelist.add("Green");
        colourelist.add("Yellow");
        colourelist.add("Black");
        colourelist.add("White");
        colourelist.add("Orange");
        colourelist.add("Purple");
        colourelist.add("Cyan");
        for (String colourList : colourelist) {
            System.out.println(colourList + ", ");
        }
    }
}
