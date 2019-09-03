package leetcode800;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 20:38
 */
public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        queue.add(0);
        set.add(0);
        while (!queue.isEmpty()) {
            int t = queue.poll();
            List<Integer> list = rooms.get(t);
            for (int i : list) {
                if (set.contains(i)) {
                    continue;
                }
                queue.add(i);
                set.add(i);
                if (set.size() == rooms.size()) {
                    return true;
                }
            }
        }
        return set.size() == rooms.size();
    }
}
