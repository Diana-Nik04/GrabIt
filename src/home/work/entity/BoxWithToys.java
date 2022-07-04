package home.work.entity;

public class BoxWithToys {
    int boxCapacity;
    int boxCurrentState;

    public BoxWithToys() {
        this.boxCapacity = 10;
        this.boxCurrentState = 0 ;
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

    public void boxFiller(){
        this.boxCurrentState = boxCapacity;
    }
    public void callManager(){
        if(boxCurrentState==2){
            System.out.println("");
        }
        if(boxCurrentState<boxCapacity/2){
            System.out.println("Достигнута половина вместимости коробки с игрушками");
        }
    }
}
