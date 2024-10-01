public class Car {
//    instance properties
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

//    instance methods
    public void drive(){
        if (currentFuelInLiters == 0){
            System.out.println("Car is out of fuel");
        }
        else if(currentFuelInLiters < 5){
            System.out.println("Reserved mode Please refuel");
            currentFuelInLiters--;
        }
        else{
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }

    }

    public void addFuel(float fuel){
        currentFuelInLiters += fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
