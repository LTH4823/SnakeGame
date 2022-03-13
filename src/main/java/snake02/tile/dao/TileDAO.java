package snake02.tile.dao;

import snake02.tile.domain.TileVO;

public class TileDAO {

    private TileVO[] tiles;

    public TileDAO() {
        tiles = new TileVO[100];

        for (int i = 0 ; i < 100 ; i++) {
            TileVO tile = new TileVO(i + 1);
            tiles[i] = tile;
        }

        tiles[0].setSnake(Snake.SNAKE1);
        tiles[1].setSnake(Snake.SNAKE2);
        tiles[2].setSnake(Snake.SNAKE3);
        tiles[3].setSnake(Snake.SNAKE4);
        tiles[4].setSnake(Snake.SNAKE5);

    }

    public int checkSnake(int location){
        if(location >= 100) {
            return 100;
        }
        TileVO tileVO = tiles[location-1];
        Snake snake = tileVO.getSnake();
        if (snake==null){
            return location;
        }
        return snake.getTarget();
    }

}
