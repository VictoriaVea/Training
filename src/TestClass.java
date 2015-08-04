import java.util.ArrayList;
import java.util.Arrays;


public class TestClass {
    public static void main(String[] args) {
        String s="atata";
        System.out.println(s.length());

        ArrayList<Integer> a= new ArrayList<Integer>();
        a.add (0,10);
        a.add(1, 20);
        System.out.println(a.get(1));
        a.remove(1);
     

        Integer [] mass={1,11,111};
        a.addAll(Arrays.asList(mass));

    }
}
