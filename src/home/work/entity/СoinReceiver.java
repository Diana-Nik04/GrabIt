package home.work.entity;

import home.work.manager.ClowMachine;

import java.io.IOException;

public class СoinReceiver {
    private static final int MIN_COIN_FOR_TRY = 50;
    private int currentCashAmount;
    private int tries;

    public СoinReceiver() {
        this.currentCashAmount = 0;
        this.tries = 0;

    }

    public int getCurrentCashAmount() {
        return currentCashAmount;
    }

    public void setCurrentCashAmount(int currentCashAmount) {
        this.currentCashAmount = currentCashAmount;
    }

    public int tryCounter(int someCash) {
        setCurrentCashAmount(someCash);
        if (this.currentCashAmount % MIN_COIN_FOR_TRY == 0) {
            this.tries = this.currentCashAmount / MIN_COIN_FOR_TRY;
            if (this.tries % 4 == 0) {
                this.tries+=(this.tries/4) ;
            }
            return this.tries;
        }
        return this.tries;
    }

}
