import java.util.*;
public class LearnMap {
    public static void main(String[] args){
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one",1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.putIfAbsent("four", 23);

        

        System.out.println(numbers);

        for( String key: numbers.keySet()){
            System.out.println(key);
        }
    }
    
}
