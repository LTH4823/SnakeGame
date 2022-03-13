package snake02.tile.dao;

import lombok.Getter;

@Getter

public enum Snake {

    SNAKE1(68), SNAKE2(88), SNAKE3(56), SNAKE4(83),SNAKE5(72);

    private int target;

    Snake(int target){
        this.target = target;
    }

}
