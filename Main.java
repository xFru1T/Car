// 4. Инкапсуляция: private, public, protected, default
// Создать класс Car с полями brand, year и mileage.
// - Сделать brand и year доступными только для чтения (private + getter).
// - mileage должно изменяться только через метод drive(int km).
import java.util.Calendar;
public class Car {
    private String brand;
    private int year;
    private int mileage;
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.mileage = 0;
    }
    public String getBrand() {
        return brand;
    }
    public int getYear() {
        return year;
    }
    public int getMileage() {
        return mileage;
    }
    public void drive(int km) {
        if (km > 0) {
            mileage += km;
        }
    }
    public int carAge(int currentYear) {
        return currentYear - year;
    }
}
class CarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Car car = new Car("Toyota", 2020);
        car.drive(100);
        System.out.println("Brand: " + car.getBrand() + '\n' + "Year: " + car.carAge(calendar.get(Calendar.YEAR)) + '\n' + "Mileage: " + car.getMileage());
    }
}