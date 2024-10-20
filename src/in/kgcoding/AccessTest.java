package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        AccessModifier car = new AccessModifier();
        car.color = "Red";
        car.model = "Swift";
        car.costOfPurchase = 5684;
        System.out.println(car);
        AccessModifier newA = new AccessModifier("Black","BMW",1.0,5000);
        System.out.println(newA);
        Default def = new Default();
    }
}
