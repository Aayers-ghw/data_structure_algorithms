package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 20:57
 */
public class Distance {

    /**
     * 有一篇文章内含多个单词，现给定两个单词，请设计一个高效算法，找出文中这两个单词的最短距离
     * (即最少相隔的单词数,也就是两个单词在文章中位置的差的绝对值)。
     * <p>
     * 给定一个string数组article，代表所给文章，同时给定文章的单词数n和待查找的两个单词x和y。请返回两个单词的最短距离。
     * 保证两个单词均在文中出现且不相同，同时保证文章单词数小于等于1000。
     *
     * @param article
     * @param n
     * @param x
     * @param y
     * @return
     */
    public int getDistance(String[] article, int n, String x, String y) {
        // write code here
        if (n <= 0) {
            return -1;
        }
        int left = 0;
        int right = 0;
        int minDis = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            if (article[i].equals(x)) {
                left = i;
            } else if (article[i].equals(y)){
                right = i;
            }
            if (left != 0 && right != 0) {
                minDis = Math.min(minDis, Math.abs(left - right));
            }
        }
        return minDis;
    }
}
