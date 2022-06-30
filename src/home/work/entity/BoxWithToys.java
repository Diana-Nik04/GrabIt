package home.work.entity;

public class BoxWithToys {
    int boxCapacity;
    int boxCurrentState;

    public BoxWithToys(int boxCapacity) {
        this.boxCapacity = boxCapacity;
        this.boxCurrentState = 10 ;
    }

    public int getBoxCapacity() {
        return boxCapacity;
    }

    public int getBoxCurrentState() {
        return boxCurrentState;
    }

    public void setBoxCurrentState(int boxCurrentState) {
        this.boxCurrentState = boxCurrentState;
    }
    public void callManager(){
        if(boxCurrentState==2){
            System.out.println("ОСталось 2 игрушки");
        }
        if(boxCurrentState<boxCapacity/2){
            System.out.println("Достигнута половина вместимости коробки с игрушками");
        }
    }
}
