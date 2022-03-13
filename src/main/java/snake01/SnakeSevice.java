package snake01;

public class SnakeSevice {

    private Player[] players;

    public void makePlayer(Integer playerNum) {
        this.players = new Player[playerNum];
        for (int i = 0; i < playerNum; i++) {
            players[i] = new Player(i + 1);
        }
    }

    public String move(Integer pno) {
        int current = players[pno - 1].getLocation();
        int dice = (int) (Math.random() * 6) + 1;
        players[pno - 1].setLocation(current + dice);
        return String.format("%d번 플레이어가 %d에서 %d로 이동하였습니다.\n", pno, current, current + dice);
    }

    public Snake checkEvent(Integer pno) {
        int current = players[pno - 1].getLocation();
        return Snake.findSnake(current);
    }

    public String event(Integer pno, Snake snake) {
        int current = players[pno - 1].getLocation();
        int after = snake.getEnd();
        players[pno - 1].setLocation(after);
        return String.format("%d번 플레이어가 %d의 뱀을 타고 %d으로 이동하였습니다.\n", pno, current, after);
    }

    public boolean checkEnd(Integer pno) {
        if (players[pno - 1].getLocation() >= 100) {
            return true;
        }
        return false;
    }
}

