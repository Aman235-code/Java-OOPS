package in.kgcoding;

public class AccessModifier {
    public String color;
    public String model;
    private double fuelLevel;
    long costOfPurchase;

    public AccessModifier(){

    }

    public AccessModifier(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "AccessModifier{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", fuelLevel=" + fuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }
}
