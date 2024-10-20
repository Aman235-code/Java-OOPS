public class CarClass {

    int noOfWheels;

    int noOfDoors;

    int maxSpeed;

    String name;

    String modelNumber;

    String company;

    public CarClass(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        return "My Car name is: " + name;
//    }


    @Override
    public String toString() {
        return "CarClass{" +
                "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        CarClass swift = new CarClass(4,4,120,"Swift","SW896","Maruthi");
        System.out.println(swift.toString());
        System.out.println(swift);
    }
}
