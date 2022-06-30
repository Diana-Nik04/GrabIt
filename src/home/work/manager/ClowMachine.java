package home.work.manager;

import home.work.entity.BoxWithToys;
import home.work.entity.Clow;
import home.work.entity.СoinReceiver;
import home.work.service.IOService;
import home.work.service.IOServiceImpl;

import java.io.IOException;

public class ClowMachine {
    private BoxWithToys box;
    private СoinReceiver coinReceiver;
    private Clow clow;
    private IOServiceImpl ioService;


    public ClowMachine() {
        this.box = new BoxWithToys(20);
        this.coinReceiver = new СoinReceiver();
        this.clow = new Clow();
        this.ioService = new IOServiceImpl();

    }

    public void run(int incomingCash) {
        int tries;
        tries = coinReceiver.tryCounter(incomingCash);
        gameProcess(tries);
    }

    private void pressStartButton() throws IOException {
        ioService.write("нажмите на кнопку");
        clow.tryToGetToy();

    }

    public void gameProcess(int numberOfTries) {
        for (int i = 0; i < numberOfTries; i++) {
            ioService.displayAmountOfTries(numberOfTries);
            try {
                pressStartButton();
            } catch (IOException e) {
                ioService.write("ошибка ввода Enter ");
            }
        }
        ioService.write("THE END");




    }
}
