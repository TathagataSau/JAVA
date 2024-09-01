import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class LearnArrayList{
    public static void main(String[] args){
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(1,34);
        System.out.println(list);

        List<Integer> list1 = new ArrayList();
        list1.add(90);
        list1.add(93);

        list.addAll(list1);
        System.out.println(list);
        list.remove(1);
        list.remove(Integer.valueOf(93));
        System.out.println(list);
        list.set(2,56);
        //list.clear();

        System.out.println(list);
        System.out.println(list.contains(56));
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator" + it.next());
        }

    }
}
