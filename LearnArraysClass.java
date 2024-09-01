import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 8, 0, 9, 1,4,5};
        int index = Arrays.binarySearch(numbers, 0);
        System.out.println("The index of elemetnt 0 in the array is "+ index);
        Arrays.sort(numbers);
        for(int i: numbers){
            System.out.print(i + " ");
        }
    }
}
