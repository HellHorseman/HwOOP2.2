public abstract class EngineTransport extends WheelTransport {
    public EngineTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
