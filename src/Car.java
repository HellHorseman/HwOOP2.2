public class Car extends Transport implements tyreService, checkEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

}
