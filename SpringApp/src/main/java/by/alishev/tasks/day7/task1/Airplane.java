package by.alishev.tasks.day7.task1;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel ;

    public Airplane() {
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void info(){
        System.out.println(
                "Producer : " + producer +
                        ", year : " + year +
                        ", length : " + length +
                        ", weight : " + weight +
                        ", fuel : " + fuel);
    }
    public int fillUp(int value){
        fuel +=value;
        return value;
    }
    public static void compareAirplanes(Airplane airplane1,Airplane airplane2){
        if (airplane1.getLength()>airplane2.getLength()){
            System.out.println("Airplane 1 is longer then Airplane 2 ");
        }else if (airplane1.getLength()<airplane2.getLength()){
            System.out.println("Airplane 2 is longer then Airplane 1");
        }else {
            System.out.println("The Airplanes length is equal");
        }
    }
}

