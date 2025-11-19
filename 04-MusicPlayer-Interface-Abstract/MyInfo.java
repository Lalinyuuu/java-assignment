// Interface Playable
interface Playable {
    void play();
}

// Abstract class MusicDevice
abstract class MusicDevice {
    protected String brand;
    
    public MusicDevice(String brand) {
        this.brand = brand;
    }
    
    public void info() {
        System.out.println("เครื่องเล่นเพลงยี่ห้อ " + brand);
    }
    
    public abstract void connect();
}

// Class CDPlayer
class CDPlayer extends MusicDevice implements Playable {
    public CDPlayer(String brand) {
        super(brand);
    }
    
    @Override
    public void connect() {
        System.out.println("เชื่อมต่อแผ่น CD...");
    }
    
    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก CD");
    }
}

// Class Smartphone
class Smartphone extends MusicDevice implements Playable {
    public Smartphone(String brand) {
        super(brand);
    }
    
    @Override
    public void connect() {
        System.out.println("เชื่อมต่อผ่าน Bluetooth...");
    }
    
    @Override
    public void play() {
        System.out.println("กำลังเล่นเพลงจาก Spotify");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // สร้าง object CDPlayer และ Smartphone
        CDPlayer cdPlayer = new CDPlayer("Sony");
        Smartphone smartphone = new Smartphone("Samsung");
        
        // เรียก method connect(), info(), และ play() ของ CDPlayer
        System.out.println("=== CD Player ===");
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();
        
        System.out.println();
        
        // เรียก method connect(), info(), และ play() ของ Smartphone
        System.out.println("=== Smartphone ===");
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
}

