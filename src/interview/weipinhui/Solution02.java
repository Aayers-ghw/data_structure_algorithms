package interview.weipinhui;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/9/15 18:20
 */
public class Solution02 {

    public static void main(String[] args) {
        LFUCache lfuCache = new LFUCache(3);
        lfuCache.set(2, 2);
        lfuCache.set(1, 1);
        System.out.println(lfuCache.get(2));
        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(2));
        lfuCache.set(3, 3);
        lfuCache.set(4, 4);
        System.out.println(lfuCache.get(3));
        System.out.println(lfuCache.get(2));
        System.out.println(lfuCache.get(1));
        System.out.println(lfuCache.get(4));
    }

    static class LFUCache {

        private int size;

        Map<Integer, EntryMap> map;

        public LFUCache(int size) {
            this.size = size;
            map = new LinkedHashMap<>();
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                map.get(key).cnt++;
                check();
                return map.get(key).value;
            }
            return -1;
        }

        public void set(int key, int value) {
            if (map.containsKey(key)) {
                map.get(key).value = value;
                map.get(key).time = System.currentTimeMillis();
            } else {
                EntryMap entryMap = new EntryMap(value, System.currentTimeMillis());
                map.put(key, entryMap);
                check();
            }
        }

        private void check() {
            Map<Integer, EntryMap> sortedMap = new LinkedHashMap<>();
            ArrayList<Map.Entry<Integer, EntryMap>> entries = new ArrayList<>(map.entrySet());
            Collections.sort(entries, new Comparator<Map.Entry<Integer, EntryMap>>() {
                @Override
                public int compare(Map.Entry<Integer, EntryMap> o1, Map.Entry<Integer, EntryMap> o2) {
                    if (o1.getValue().cnt == o2.getValue().cnt) {
                        return (int) (o1.getValue().time - o2.getValue().time);
                    }
                    return o1.getValue().cnt - o2.getValue().cnt;
                }
            });
            Map.Entry<Integer, EntryMap> next;
            Iterator<Map.Entry<Integer, EntryMap>> iterator = entries.iterator();
            int i = 0;
            while (iterator.hasNext() && i < size) {
                i++;
                next = iterator.next();
                sortedMap.put(next.getKey(), next.getValue());
            }
            map = sortedMap;
            return;
        }
    }

    static class EntryMap {

        private long time;
        private int value;
        private int cnt;

        public EntryMap(int value, long time) {
            this.value = value;
            this.time = time;
            this.cnt = 1;
        }
    }
}
