package Odev2;

public class Computer {
    private boolean isOpen = false;

    public void open() {
        if (isOpen) {
            throw new IllegalStateException("Computer is already open.");
        }
        System.out.println("Computer opened.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException("Computer is already closed.");
        }
        System.out.println("Computer shut down.");
        isOpen = false;
    }
}
