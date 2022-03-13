package snake01;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Player {
    private Integer pno;
    private Integer location;

    public Player(Integer pno) {
        this.pno = pno;
        this.location = 0;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

}
