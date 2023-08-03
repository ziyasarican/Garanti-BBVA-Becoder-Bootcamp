package Odev2;

public class Main {
    public static void main(String[] args) {
        Xbox xbox = new Xbox();
        xbox.addController("Xbox controller");
        xbox.playGame();

        Playstation playstation = new Playstation();
        playstation.addController("Playstation controller");
        playstation.playGame();

        Computer computer = new Computer();
        computer.open();
        computer.shutdown();
    }
}
