package home.work.entity;

public class Clow {
    private static final int TRIES_COUNT = 5;
    private int count;
     public Clow() {
         this.count=0;
     }

     public void tryToGetToy( ){
          if(this.count==TRIES_COUNT){
               System.out.println("вы достали игрушку");
               this.count++;
          }
          this.count++;
     }
}
