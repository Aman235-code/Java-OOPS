public class Car {

//    static field
    static int noOfCarsSold;

//    instance properties
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    // when class loads for first time this is called
    static {
       noOfCarsSold = 1;
        System.out.println("This is a static block");
    }

//    when object created this called first
    {
        noOfCarsSold++;
        System.out.println("This is an initialization block");
    }

    // constructor (default)
    Car(){
//        noOfWheels = 4;
//        color = "Black";
//        maxSpeed = 150;
//        currentFuelInLiters = 2;
//        noOfSeats = 5;

        this("Black");
        currentFuelInLiters = 5;
//        System.out.println("Constructor called");
    }

    // constructor (parametrized)
    Car(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
//        System.out.println("Constructor called with parameters");
    }

//    instance methods
    public Car start(){
        if (currentFuelInLiters == 0){
            System.out.println("Car is out of fuel cannot start");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("Reserved mode Please refuel");
            currentFuelInLiters--;
        }
        else{
            System.out.println("Car is started............");
        }
        return this;
    }

    public void drive(){
            System.out.println("Car is driving");
            currentFuelInLiters--;
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("I'm in finalize");
//    }
}
