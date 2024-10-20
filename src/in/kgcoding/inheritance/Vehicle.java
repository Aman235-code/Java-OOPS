package in.kgcoding.inheritance;

public class Vehicle {
    private int noOfTires;

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    @Override
    public String toString() {
        return "No of tires: "+ noOfTires;
    }

    public void commute(){
        System.out.printf("I'm going for place A to B using %d tyres\n", noOfTires);
    }
}
