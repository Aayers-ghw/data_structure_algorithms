package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:14
 */
public class Frequency {

    /**
     * 请设计一个高效的方法，找出任意指定单词在一篇文章中的出现频数。
     * <p>
     * 给定一个string数组article和数组大小n及一个待统计单词word，请返回该单词在文章中的出现频数。
     * 保证文章的词数小于等于1000。
     *
     * @param article
     * @param n
     * @param word
     * @return
     */
    public int getFrequency(String[] article, int n, String word) {
        // write code here
        if (article == null || article.length == 0) {
            return 0;
        }
        int cnt = 0;
        for (String a : article) {
            if (word.equals(a)) {
                cnt++;
            }
        }
        return cnt;
    }
}
