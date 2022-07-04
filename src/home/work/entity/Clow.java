package home.work.entity;

import java.util.Random;

public class Clow {
    private int triesToWin;
    private Random random;
    private int count;

    public Clow() {
        this.count = 1;
        triesToWin = 5;
        //random= new Random();
        // createWinCondition();
    }

    public void tryToGetToy() {

        if (this.count == triesToWin) {
            System.out.println("VIctory");
            this.count = 1;
            // createWinCondition();
        }else{
            System.out.println("May be next time");
        }
        this.count++;

    }
     /*
     public void tryToGetToy( ){
        triesToWin = random.nextInt(5);
        if(this.count==triesToWin){
            System.out.println("вы достали игрушку");
            this.count=0;
            createWinCondition();
        }
        this.count++;
    }


     private void createWinCondition(){
         triesToWin = random.nextInt(5);
     }
     */
}
