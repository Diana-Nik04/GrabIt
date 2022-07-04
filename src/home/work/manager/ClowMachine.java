package home.work.manager;

import home.work.entity.BoxWithToys;
import home.work.entity.Clow;
import home.work.entity.Screen;
import home.work.entity.СoinReceiver;
import home.work.service.IOService;
import home.work.service.IOServiceImpl;

import java.io.IOException;

public class ClowMachine {
    private BoxWithToys box;
    private СoinReceiver coinReceiver;
    private Clow clow;
    private IOServiceImpl ioService;
    private Screen screen;
    private int incomingCash;
    private int tries;
    private int cashAmount;


    public ClowMachine() {
        this.box = new BoxWithToys();
        this.coinReceiver = new СoinReceiver();
        this.clow = new Clow();
        this.ioService = new IOServiceImpl();
        this.screen = new Screen();
        this.incomingCash = 0;
        this.tries = 0;
        this.cashAmount =0;
    }

    public void run() {
        welcomingMessage();
        getMoney();
        getTriesAmount(cashAmount);
        gameProcess(tries);
    }

    private void gameProcess(int numberOfTries) {
        for (int i = 0; i < numberOfTries; i++) {
            screen.render((i + 1) + " try :");
            clow.tryToGetToy();
        }
        screen.render("THE END");
    }
    private void welcomingMessage() {
        screen.render("Its ClowCrane");
        screen.render("50 cent is 1 try ");
        screen.render("Incert a coin to continue");
    }

    private void notEnoughMoney(int incomingCash) {
        if (incomingCash < 50 && cashAmount !=50 ) {
            System.out.println("not enough");
            this.cashAmount += incomingCash;
            getMoney();
        }
    }

    private void getMoney() {
        this.incomingCash = ioService.readInt();
        notEnoughMoney(incomingCash);
    }

    private void getTriesAmount(int cashAmount) {
        this.tries = coinReceiver.tryCounter(cashAmount);
    }
}
