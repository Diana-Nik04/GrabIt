package home.work.entity;

import home.work.exception.customRuntimeException;

public class BoxWithToys {
    int boxCapacity;
    int boxCurrentState;

    public BoxWithToys() {
        this.boxCapacity = 10;
        this.boxCurrentState = 10;
    }

    public int getBoxCurrentState() {
        return boxCurrentState;
    }

    public void boxIsEmpty()  {
        if (boxCurrentState <= 2) {
            throw new customRuntimeException("no toys for game");
        }
    }

    public void boxFiller() {
        this.boxCurrentState = boxCapacity;
    }

}
