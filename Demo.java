import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(17);
        Collections.reverse(list);
        Collections.sort(list);
        Collections.sort(list, Collections.reverseOrder());
        Collections.shuffle(list);
    }
}
