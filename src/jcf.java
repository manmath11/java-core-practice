import java.util.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
// java collection  fraework
public class jcf {
    public static void main (String[] args){
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(3,9);// replace hota hai element
        l1.addAll(l2);
       // l2.clear();
        for(int i=0;i< l1.size();i++){
            System.out.println(l1.get(i));
        }

    }
}
