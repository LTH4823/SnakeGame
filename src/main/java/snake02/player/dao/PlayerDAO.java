package snake02.player.dao;

import snake02.player.domain.PlayerVO;

public class PlayerDAO {

    private PlayerVO[] players;

    public void makePlayer(int num){
        players = new PlayerVO[num];

        for (int i = 0; i < num ; i++) {
            PlayerVO player = new PlayerVO(i+1);
            players[i] = player;
        }//end for
    }

    public int move(int pno, int dice){
        PlayerVO player = players[pno - 1];
        int current = player.getLoc();
        int after = current + dice;
        player.setLoc(after);
        return after;
    }

    public int getLocation(int pno){
        PlayerVO playerVO;
        playerVO = players[pno-1];
        return playerVO.getLoc();
    }

    public void rideSnake(int pno, int location){
        PlayerVO playerVO;
        playerVO = players[pno-1];
        playerVO.setLoc(location);
    }
}
