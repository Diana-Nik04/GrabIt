package home.work.manager;

import home.work.entity.BoxWithToys;
import home.work.entity.Clow;
import home.work.entity.Screen;
import home.work.entity.СoinReceiver;
import home.work.service.IOServiceImpl;

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
        this.cashAmount = 0;
    }

    public void run() {
        welcomingMessage();
        containerIsEmpty();
        getMoney();
        getTriesAmount(cashAmount);
        gameProcess(tries);
    }
    public void reset(){
        box.boxFiller();
    }

    private void gameProcess(int numberOfTries) {
        System.out.println("You have "+numberOfTries+" tries");
        System.out.println("press 'START' button");

      /*  for (int i = 0; i < numberOfTries; i++) {
            System.out.println((i + 1) + " try :");
            clow.tryToGetToy();
        }
        */
    }

    private void welcomingMessage() {
        System.out.println("Its ClowCrane");
        System.out.println("50 cent is 1 try ");
        System.out.println("Incert a coin to continue");
        System.out.println(box.getBoxCurrentState() + " toys in box");
    }

    private void containerIsEmpty() {
        box.boxIsEmpty();
    }

    private void getMoney() {
        int cash = 0;
        notEnoughMoney(cash);
    }

    private void notEnoughMoney(int cash) {
        this.incomingCash = ioService.readInt();
        if (incomingCash < 50) {
            cash += incomingCash;
            if (cash % 50 == 0) {
                cashAmount = cash;
                return;
            } else {
                notEnoughMoney(cash);
            }
        }
        this.cashAmount = this.incomingCash;
    }

    private void getTriesAmount(int cashAmount) {
        this.tries = coinReceiver.tryCounter(cashAmount);
        screen.onSilverScreen(String.valueOf(tries));
    }

}
