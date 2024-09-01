import java.util.*;
import java.util.stream.Stream;
public class Hello{
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(1,2,3,4,2,4);
        // Stream<Integer> s1 = nums.stream();
        // Stream<Integer> s2 = s1.filter(n -> n%2==0);
        // Stream<Integer> s3 = s2.map(n->n*2);
        // s3.forEach(n -> System.out.println(n));
        int result = nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*2)
                        .reduce(0,(c,e) -> c+e);
        System.out.println(result);
        

    }
}