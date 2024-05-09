package lab10.lab8Variant;

import java.util.Arrays;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.List;
import lab10.lab8Variant.Variant5.Car;
import lab10.lab8Variant.Variant5.Ship;
import lab10.lab8Variant.Variant8.Document;
import lab10.lab8Variant.Variant8.TextDocument;

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car(350, "Lamborghini", "red");
    Car car2 = new Car(250, "Ferrari", "blue");
    Car[] carArray = {car1, car2};
    Iterable<Car> cars = Arrays.asList(carArray);
    cars.forEach(System.out::println);


    Ship ship1 = new Ship(200, 3000);
    Ship ship2 = new Ship(150, 2000);
    Ship[] shipArray = {ship1, ship2};
    Iterable<Ship> ships = Arrays.asList(shipArray);
    ships.forEach(System.out::println);


    Document document1 = new TextDocument("document1");
    Document document2 = new TextDocument("document2 is larger than document1");
    Document[] documentArray = {document1, document2};
    Iterable<Document> documents = Arrays.asList(documentArray);
    documents.forEach(System.out::println);

  }
}
