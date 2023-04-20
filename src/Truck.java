public class Truck extends EngineTransport implements ServiceTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
