import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by Jay Vaghani
 */


public class Programme_11_CompareArrayList {

    public static void main(String[] args) {
        AbstractList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.add("Green");
        AbstractList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        //Storing the comparison output in ArrayList<String>
        AbstractList<String> c3 = new ArrayList<String>();
        for (String e : c1)
        c3.add(c2.contains(e) ? "Yes" : "No");
        System.out.println(c3);
    }
}
