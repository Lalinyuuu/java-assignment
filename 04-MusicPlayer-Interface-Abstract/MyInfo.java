interface Playable {
    void play();
}

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

public class MyInfo {
    public static void main(String[] args) {
        CDPlayer cdPlayer = new CDPlayer("Sony");
        Smartphone smartphone = new Smartphone("Samsung");
        
        System.out.println("=== CD Player ===");
        cdPlayer.connect();
        cdPlayer.info();
        cdPlayer.play();
        
        System.out.println();
        
        System.out.println("=== Smartphone ===");
        smartphone.connect();
        smartphone.info();
        smartphone.play();
    }
}
