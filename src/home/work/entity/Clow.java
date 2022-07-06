package home.work.entity;

import java.util.Random;

public class Clow {
    private int triesToWin;
    private Random random;
    private int count;

    public Clow() {
        this.count = 0;
        triesToWin = 5;
        random = new Random();
        createWinCondition();
    }

    public void tryToGetToy( ) {
        triesToWin = random.nextInt(5);
        if (this.count == triesToWin) {
            System.out.println("VICTORY");
            this.count = 0;
            createWinCondition();
        }
        System.out.println("DEfeat");
        this.count++;
    }


    private void createWinCondition() {
        triesToWin = random.nextInt(5);
    }

}
