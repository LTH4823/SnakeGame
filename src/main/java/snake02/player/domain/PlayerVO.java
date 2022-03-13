package snake02.player.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class PlayerVO {
    public PlayerVO(int pno) {
        this.pno = pno;
        this.loc = 0;
    }

    private int pno;
    private int loc;

    public void setLoc(int loc) {
        this.loc = loc;
    }
}
