import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylist {
    public static void main(String args[]){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        for(int i =0; i< l1.size();i++){
            System.out.println(l1.get(i));

        }

      // l1.sort(null);
        Collections.sort( l1 );
        System.out.println("sorted" + l1);
        Collections.reverse(l1);
        System.out.println("reversed" +l1);
    }
}
