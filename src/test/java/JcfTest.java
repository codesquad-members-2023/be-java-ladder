import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.HashMap;

public class JcfTest {

    @Test
    public void setTest() {
        HashSet<Point> points = new HashSet<>();
        points.add(Point.of(1, 1));
        points.add(Point.of(2, 2));
        points.add(Point.of(3, 3));

        System.out.println(points);

        points.remove(Point.of(1, 1));
        System.out.println(points);

        points.add(Point.of(2, 2));
        System.out.println(points.size());
    }

    @Test
    public void hashMapTest() {
        HashMap<Integer, Point> points = new HashMap<>();
        points.put(1, Point.of(1, 1));
        points.put(2, Point.of(3, 5));
        points.put(3, Point.of(5, 7));

        System.out.println(points.get(2));
        points.put(4, Point.of(10, 15));

        System.out.println(points.values());
        points.remove(3);

        System.out.println(points.values());
        System.out.println(points);
    }
}

