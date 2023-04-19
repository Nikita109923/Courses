package by.alishev.tasks.day7.task2;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayer;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayer < 6)
            countPlayer++;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public static int getCountPlayer() {
        return countPlayer;
    }

    public static void setCountPlayer(int countPlayer) {
        Player.countPlayer = countPlayer;
    }
    public void run(){
       if (stamina==0)
           return;
        stamina--;
        if (stamina==0)
        countPlayer--;
    }
    public static void info(){
        if (countPlayer<6){
            System.out.println("Команда не полная и есть " +(6-countPlayer) + " свободных мест");
        } else {
            System.out.println("Мест в командах больше нет");
        }

    }
}
