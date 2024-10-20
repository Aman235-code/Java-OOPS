public class Driver {

//    static field
    static int minAge = 18;

//    non-static field
    String name;
    int age;
    String dateOfLicense;

//    non-static method
    public boolean isAllowedToDrive(){
        return this.age >= minAge;
    }

//    static method
    public static void main(String[] args) {
//        Car myCar = new Car();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

//        deafult constructor
//        Car swift = new Car();

//        parametrized constructor
        Car swift = new Car("red");
        Car thar = new Car();

//        swift.addFuel(6);
//        Car startedCar = swift.start();
//        startedCar.drive();
        swift.start().drive();
        System.out.println(swift.color);

//        dateOfLicense = "1/Jan/2024" -- static method cannot access the non-static field

//        Driver myDriver = new Driver();
//        myDriver.dateOfLicense = "1/Jan/2024";
//        System.out.println(myDriver.minAge);
//        System.out.println(Driver.minAge);
    }
}
