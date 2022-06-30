package home.work.entity;

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
        if (this.currentCashAmount == MIN_COIN_FOR_TRY || currentCashAmount % MIN_COIN_FOR_TRY == 0) {
            return this.tries = currentCashAmount / MIN_COIN_FOR_TRY ;
        }
        return this.tries;
    }

}
