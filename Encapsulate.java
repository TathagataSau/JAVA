//Exception handling

class myException extends Exception{
    public myException(String message){
        super(message);
    }
}
public class Ex{
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        
        try{
            if(j==0){
                throw new myException("Cann not devide by zero");
            }
            int k = i/j;
        }
        catch(myException e){
            System.out.println("Dividon by zero"+ e.getMessage);
        }
    }
}