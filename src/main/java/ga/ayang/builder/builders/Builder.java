package ga.ayang.builder.builders;

import ga.ayang.builder.cars.CarType;
import ga.ayang.builder.components.Engine;
import ga.ayang.builder.components.GPSNavigator;
import ga.ayang.builder.components.Transmission;
import ga.ayang.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
