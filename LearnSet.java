import java.util.*;
public class LearnSet {
    public static void main(String[] arg){
        Set<Integer> set = new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(90);
        set.add(67);

        System.out.println(set);
        set.remove(90);
        System.out.println(set);
        System.out.println(set.isEmpty());
    }
}
