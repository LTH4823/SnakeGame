package snake01;

import lombok.Getter;

@Getter
public enum Snake {
    SNAKE1(20, 74), SNAKE2(66, 14), SNAKE3(94, 64), SNAKE4(32, 56), SNAKE5(98, 78),
    SNAKE6(3,100), SNAKE7(1,100), SNAKE8(2,99), SNAKE9(4,97);

    private int start;
    private int end;

    Snake(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static Snake findSnake(int location) {
        Snake result = null;
        for (Snake snake : values()) {
            if (snake.getStart() == location) {
                result = snake;
            }
        }
        return result;
    }

}
