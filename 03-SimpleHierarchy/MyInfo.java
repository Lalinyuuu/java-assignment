// Base class Vehicle
class Vehicle {
    protected String brand;
    
    public Vehicle(String brand) {
        this.brand = brand;
    }
    
    public void start() {
        System.out.println(brand + " กำลังสตาร์ท...");
    }
}

// Derived class Car ที่สืบทอดจาก Vehicle
class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }
    
    public void drive() {
        System.out.println(brand + " กำลังขับเคลื่อนบนถนน");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // สร้าง object ของ Car
        Car myCar = new Car("Toyota");
        
        // เรียกทั้ง start() และ drive()
        myCar.start();
        myCar.drive();
    }
}

