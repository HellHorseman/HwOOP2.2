public class Truck extends Transport implements tyreService, checkEngine, checkTrailer {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
