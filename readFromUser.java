import java.util.Scanner;
public class readFromUser{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("YOUR NAME:");
        String name = scanner.nextLine().trim();
        System.out.println("your name is : "+ name);

    }
}
