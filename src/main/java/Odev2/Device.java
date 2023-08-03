package Odev2;

import Odev2.Controller.GameController;

abstract class Device implements GameController{
    private GameController gameController;
    private boolean isOpen = false;

    @Override
    public void addController(String controller) {
        if (isOpen) {
            throw new IllegalStateException(getClass().getSimpleName() + " is already open.");
        }
        System.out.println(controller + " controller added to " + getClass().getSimpleName());
        isOpen = true;
    }

    @Override
    public void playGame() {
        if (!isOpen) {
            throw new IllegalStateException(getClass().getSimpleName() + " is closed.");
        }
        System.out.println("Game started on " + getClass().getSimpleName());
    }

    public void open() {
        if (isOpen) {
            throw new IllegalStateException(getClass().getSimpleName() + " is already open.");
        }
        System.out.println(getClass().getSimpleName() + " opened.");
        isOpen = true;
    }

    public void shutdown() {
        if (!isOpen) {
            throw new IllegalStateException(getClass().getSimpleName() + " is already closed.");
        }
        System.out.println(getClass().getSimpleName() + " shut down.");
        isOpen = false;
    }
}
