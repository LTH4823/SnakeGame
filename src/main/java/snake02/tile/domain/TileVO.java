package snake02.tile.domain;

import lombok.*;
import snake02.tile.dao.Snake;

@Getter
@ToString
@RequiredArgsConstructor
@Setter

public class TileVO {

    @NonNull
    private Integer tno;
    private Snake snake;

}
