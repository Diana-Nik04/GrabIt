package home.work.service;

import home.work.entity.Screen;

public class IOServiceImpl implements  IOService{
    private Screen screen;
    public IOServiceImpl() {
        this.screen = new Screen();
    }

    @Override
    public void write(String message) {
        System.out.println(message);;
    }

    @Override
    public void displayAmountOfTries(int tiesCount) {
        screen.render(tiesCount);
    }
}
