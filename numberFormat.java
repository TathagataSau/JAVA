import java.text.NumberFormat;
public class numberFormat {
    public static void main(String[] args){
        String result = NumberFormat.getPercentInstance().format(0.9); 
        System.out.println(result);
    }
    
}
