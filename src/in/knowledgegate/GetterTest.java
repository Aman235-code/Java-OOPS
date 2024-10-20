package in.knowledgegate;

import in.gettersetter.Car;

public class GetterTest {
    public static void main(String[] args) {
        Car c = new Car("Red","Maruthi",3,8000);
        c.setColor("Green");
        System.out.printf("%s %s", c.getColor(), c.getModel());
    }
}
