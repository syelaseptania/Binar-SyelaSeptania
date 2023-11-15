// Kelas All untuk menguji implementasi
public class All {
    public static void main(String[] args) {
        ToyotaRush Rush = new ToyotaRush();
        HondaHrv hrv = new HondaHrv(true);
        HyundaiCreta creta = new HyundaiCreta(true);
        Rush.forward();
        Rush.turn();
        Rush.backwards();
        Rush.turnnRadio();
        System.out.println();
        hrv.forward();
        hrv.turn();
        hrv.backwards();
        hrv.aktifkanSunroof();
        System.out.println();
        creta.forward();
        creta.turn();
        creta.backwards();
        creta.tampilkanLaneKeepAssist();
    }
}
// Kelas Vehicle
class Vehicle {
    private int totalWheels;

    // Construktor
    public Vehicle(int totalWheels) {
        this.totalWheels = totalWheels;
    }

    // Metode kendaraan bergerak maju ke depan
    public void forward() {
        System.out.println("The vehicle moving forward");
    }

    // Metode kendaraan berbelok
    public void turn() {
        System.out.println("Vehicle turning");
    }
}

// Kelas Car yang merupakan subclass dari Vehicle
class Car extends Vehicle {
    private int totalSeats;
    private int passengerCapacity;

    // Konstruktor
    public Car(int totalSeats, int passengerCapacity) {
        super(4); // Mobil biasanya memiliki 4 roda
        this.totalSeats = totalSeats;
        this.passengerCapacity = passengerCapacity;
    }

    // Metode override untuk bergerak maju
    @Override
    public void forward() {
        System.out.println("The car moves forward");
    }

    // Metode untuk bergerak mundur
    public void backwards() {
        System.out.println("The car moves backwards");
    }

    // Getter for Total Seats
    public int getTotalSeats() {
        return totalSeats;
    }

    // Getter untuk Passenger Capacity
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
}

// Kelas ToyotaRush yang merupakan subclass dari Car
class ToyotaRush extends Car {
    // Konstruktor
    public ToyotaRush() {
        super(7, 8);
    }

    // Metode override untuk berbelok
    @Override
    public void turn() {
        System.out.println("Toyota turns well");
    }

    // Metode spesifik untuk Toyota Rush
    public void turnnRadio() {
        System.out.println("Turning on the radio on the Toyota Rush");
    }
}

// Kelas HondaHrv subclass dari Car
class HondaHrv extends Car {
    private boolean LEDMapLight;

    // Konstruktor
    public HondaHrv(boolean LEDMapLight) {
        super(5, 5);
        this.LEDMapLight = LEDMapLight;
    }

    // Metode spesifik untuk Honda Hrv
    public void aktifkanSunroof() {
        System.out.println("Sunroof mode enabled");
    }
}

// Kelas Hyundai Creta yang merupakan subclass dari Car
class HyundaiCreta extends Car {
    private boolean SmartSense;

    // Konstruktor
    public HyundaiCreta(boolean SmartSense) {
        super(6, 7);
        this.SmartSense = SmartSense;
    }

    // Metode override untuk berbelok
    @Override
    public void turn() {
        System.out.println("Hyundai Creta turns smoothly");
    }

    // Metode spesifik untuk Hyundai Creta
    public void tampilkanLaneKeepAssist() {
        System.out.println("Lane Keep Assist mode active");
    }
}
