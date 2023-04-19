package by.alishev.tasks.day7.task2;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(97);
        Player player3 = new Player(94);

        Player.info();

        Player player4 = new Player(96);
        Player player5 = new Player(92);
        Player player6 = new Player(100);

        Player.info();

        Player player7 = new Player(100);

        Player.info();

        for (int i = 0; i < 94; i++) {

            player3.run();
        }
        Player.info();
    }
}
