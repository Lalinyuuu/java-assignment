// Main class สำหรับ main() method
class Main {
    public static void main(String[] args) {
        // สร้าง object จาก Class Car
        Car myCar = new Car();
        
        // ใช้ setter เพื่อกำหนดค่า brand และ speed
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);
        
        // เรียกใช้ displayInfo()
        myCar.displayInfo();
    }
}

// Car class สำหรับเก็บข้อมูลรถยนต์และพฤติกรรม
class Car {
    // Property แบบ private
    private String brand;
    private int speed;
    
    // Getter และ Setter สำหรับ brand
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    // Getter และ Setter สำหรับ speed
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    // Method แสดงข้อมูลรถ
    public void displayInfo() {
        System.out.println("Car brand: " + this.brand + ", Speed: " + this.speed + " km/h");
    }
}

