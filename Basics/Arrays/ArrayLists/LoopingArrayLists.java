/** ArrayListIterators
* Some examples of how to iterate over ArrayLists.
* from JBC canvas
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoopingArrayLists {
    public static void main(String[] args) {
        //Create a list of names
        ArrayList<String> names = new ArrayList<String>();

        //Add some names in list
        names.add("Eve");
        names.add("Anna");
        names.add("Tonny");
        names.add("Steve");

        //Method #1 : Iterate using for loop
        System.out.println("Using for loop");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Method #2 : Iterate using enhanced for loop
        System.out.println("Using enhanced for loop");
        for (String name : names) {
            System.out.println(name);
        }

        //Method #3 : Iterate using while loop and iterator
        System.out.println("Using Iterator");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Method #4 : Iterate using while loop and index
        System.out.println("Using while loop and index");
        int index = 0 ;
        while (names.size()> index) {
            System.out.println(names.get(index));
            index++ ;
        }
    }
}
