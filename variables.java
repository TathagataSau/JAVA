import java.util.Date;
public class variables {
    public static void main(String[] args){
        long viewsCount = 3_456_789_123L;
        float integer = 10.99F;
        char letter = 'H';
        String message = "   Mess\"   \"age"+ " +++";
        message.endsWith("!!");
        Date now = new Date();
        boolean isEligible= true;
        System.out.println(viewsCount);
        System.out.println(integer);
        System.out.println(letter);
        System.out.println(isEligible);
        System.out.println(now);
        System.out.println(message.replace("+", "**"));
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        
        
    }
    
}
