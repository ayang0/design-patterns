package ga.ayang.builder;

import ga.ayang.builder.builders.CarBuilder;
import ga.ayang.builder.builders.CarManualBuilder;
import ga.ayang.builder.cars.Car;
import ga.ayang.builder.cars.Manual;
import ga.ayang.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getResult();
        System.out.println("Car build:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual build:\n" + carManual.print());
    }
}
