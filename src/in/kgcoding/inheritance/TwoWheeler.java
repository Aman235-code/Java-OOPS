package in.kgcoding.inheritance;

public class TwoWheeler extends Vehicle {
    TwoWheeler() {
        setNoOfTires(2);
    }

    public void balance(){
        System.out.println("Balancing on 2 tyres");
    }
}
