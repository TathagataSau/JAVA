import java.util.*;
public class while1 {
    public static void main(String[] args){
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("input: ");
            input = scanner.nextLine();
            if (input.equals("quit")){
                break;
            }
            System.out.println(input);
            
        }
    }
    
}
