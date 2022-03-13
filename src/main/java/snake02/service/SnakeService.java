package snake02.service;

import lombok.AllArgsConstructor;
import snake02.player.dao.PlayerDAO;
import snake02.tile.dao.TileDAO;

@AllArgsConstructor

public class SnakeService {

    private PlayerDAO playerDAO;
    private TileDAO tileDAO;

    public void makePlayers(int num){
        playerDAO.makePlayer(num);
    }

    public int rollDice(int pno){
        int diceValue = (int) (Math.random()*6) + 1;
        int location = playerDAO.move(pno, diceValue);

        int after = tileDAO.checkSnake(location);
        playerDAO.rideSnake(pno, after);
        return after;
    }

    public boolean checkEnd(int pno){
        int location = playerDAO.getLocation(pno);

        if(location >= 100) {
            return true;
        }
        return false;
    }


}
