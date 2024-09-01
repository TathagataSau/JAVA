package encapsulation;

public class EncapsulationIntro {
    public static void main(String[] args){
        Laptop L1 = new Laptop();
        L1.setPrice(45);

    }

    
}
class Laptop{
    int ram;
    private int price;

    public void setPrice(int price){
        this.price = price;
    }
}
