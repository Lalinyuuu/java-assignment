public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);
        myCar.displayInfo();
    }
}

class Car {
    private String brand;
    private int speed;
    
    public void setBrand(String newBrand) {
        brand = newBrand;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}
