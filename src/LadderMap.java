import java.util.ArrayList;
import java.util.List;

public class LadderMap {
    private List<Line> map;

    public LadderMap(int playerNum, int mapHeight) {
        int mapLength = (playerNum * 2) - 1;
        init(mapHeight, mapLength);
    }

    private void init(int mapHeight, int mapLength) {
        map = new ArrayList<>();
        for (int i = 0; i < mapHeight; i++) {
            map.add(new Line(mapLength));
        }
    }
}
