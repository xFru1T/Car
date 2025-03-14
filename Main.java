// 4. Инкапсуляция: private, public, protected, default
// Создать класс Car с полями brand, year и mileage.
// - Сделать brand и year доступными только для чтения (private + getter).
// - mileage должно изменяться только через метод drive(int km).
import java.time.Year;
import java.util.*;
import java.util.Date;
class Car {
    private String brand;
    private int year;
    private int mileage;
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        this.mileage = 0;
    }
    private String getBrand() {
        return brand;
    }
    private int getYear() {
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
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String newLine = System.getProperty("line.separator");
        Car car = new Car("Toyota", 2020);
        car.drive(100);
        System.out.println("Brand: " + car.getBrand() + newLine + "Year: " + car.carAge(calendar.get(Calendar.YEAR)) + newLine + "Mileage: " + car.getMileage());
    }
}