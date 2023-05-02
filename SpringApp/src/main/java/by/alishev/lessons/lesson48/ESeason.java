package by.alishev.lessons.lesson48;

public enum ESeason {
    SUMMER(35), AUTUMN(10), WINTER(-13), SPRING(20);
    private int temperature;

    ESeason(int temperature) {
        this.temperature = temperature;
    }
    public int getTemperature(){
        return temperature;
    }
}
