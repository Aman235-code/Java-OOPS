package in.kgcoding.nested;

public class Car {

    private int noOfDoors;

    private static int price = 5000;

    public void repair() {
        Tyre tyre = new Tyre();
    }
    protected class Tyre {
        private double width;
        private double pressure;
        private String material;

        public void inflate(){
            noOfDoors = 4;
            price = 9000;
        }
    }
}
