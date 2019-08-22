package programmerinterviewbook;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aayers-ghw
 * @date 2019/8/22 10:53
 */
public class Flood {

    /**
     * ��һ��nxm������״�ĳ����ﱬ���˺�ˮ����ˮ��(0,0)�ĸ�������������У�������������еĸ�����һЩ������
     * ��ˮֻ����û�н����ĸ����������뷵�غ�ˮ����(n - 1,m - 1)������ʱ��(��ˮֻ�ܴ�һ���������������ڵ�
     * �����Һ�ˮ��λʱ���ܴ�һ�������������ڸ���)��
     * <p>
     * ����һ������map��ʾ���У�����map[i][j]��ʾ����Ϊ(i,j)�ĸ��ӣ�ֵΪ1����ø����н�����0����û�н�����
     * ͬʱ��������Ĵ�Сn��m(n��m��С�ڵ���100)���뷵������(n - 1,m - 1)������ʱ�䡣��֤��ˮһ���������յ㡣
     *
     * @param map
     * @param n
     * @param m
     * @return
     */
    public int floodFill(int[][] map, int n, int m) {
        // write code here
        if (map == null || map.length == 0) {
            return 0;
        }
        int[][] dp = new int[n][m];
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        while (!queue.isEmpty()) {
            Point p = ((LinkedList<Point>) queue).pop();
            int x = p.x;
            int y = p.y;
            if (x == n - 1 && y == m - 1) {
                return map[x][y];
            }
            if (x + 1 < n && map[x + 1][y] == 0) {
                queue.offer(new Point(x + 1, y));
                //��ʼ���ұ߽ڵ㡣ע�⣬���������жϵ�������map[x+1][y]==0��Ҳ����˵·��ͨ�ġ�
                //��һ�㺬�����������0��˵���߹��˻������ϰ�����1��
                map[x + 1][y] = map[x][y] + 1;
            }
            //����Ľڵ㣬����˳���ܱ䣬��Ϊ����ʱ�䣬�϶��Ǵ��ұ߻��������ߣ�ֻ���߲�ͨ��ʱ�������ߺ�����
            if (y + 1 < m && map[x][y + 1] == 0) {
                queue.add(new Point(x, y + 1));
                map[x][y + 1] = map[x][y] + 1;
            }

            if (x - 1 >= 0 && map[x - 1][y] == 0) {
                queue.add(new Point(x - 1, y));
                map[x - 1][y] = map[x][y] + 1;
            }

            if (y - 1 >= 0 && map[x][y - 1] == 0) {
                queue.add(new Point(x, y - 1));
                map[x][y - 1] = map[x][y] + 1;
            }
        }
        return 0;
    }

    class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
