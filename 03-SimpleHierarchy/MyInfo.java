class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    
    public void start() {
        System.out.println(brand + " กำลังสตาร์ท...");
    }
}


class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    public void drive() {
        System.out.println(brand + " กำลังขับเคลื่อนบนถนน");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();
        myCar.drive();
    }
}
