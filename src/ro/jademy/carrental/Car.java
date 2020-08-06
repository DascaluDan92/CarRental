package ro.jademy.carrental;

public class Car {

    // Q: how can we better represent the car make?
    // associate the car with a hashtag
    public String make;
    public String model;
    public Integer year;

    // Q: how can we better represent the car type?
    public String carType;
    // coupe, sedan, hatchback, convertible, wagon, SUV
    //implement this in every car model

    // Q: how can we better represent the motor type?
    public String fuelType;
    // diesel, gasoline, alternative
    // implement in model and make

    public Integer doorNumber;
    // imlement in model

    public String color;
    // implement in model

    // Q: how can we better represent the transmission type?
    public String transmissionType; // automatic, manual

    // Q: how can we better represent the engine?
    public String engine;
    // cc, horsepower

    // Q: how can we better represent money value?
    public String basePrice;
    //initial price, after more uses, after an accident,


    // Q: do we need a constructor other than the default one?
    // Q: how can we better protect the car data?
    // getter and setter



    public Car ( String make, String model, Integer year, String carType, String fuelType, Integer doorNumber, String color, String  transmissionType, String engine, String basePrice){
        this.make = make;
        this.model = model;
        this.year = year;
        this.carType = carType;
        this.fuelType = fuelType;
        this.doorNumber = doorNumber;
        this.color = color;
        this.transmissionType = transmissionType;
        this.engine = engine;
        this.basePrice = basePrice;

    }




    )


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getCarType() {
        return carType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public Integer getDoorNumber() {
        return doorNumber;
    }

    public String getColor() {
        return color;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getEngine() {
        return engine;
    }

    public String getBasePrice() {
        return basePrice;
    }




}
