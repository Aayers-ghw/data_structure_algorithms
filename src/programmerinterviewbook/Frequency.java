package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/23 17:14
 */
public class Frequency {

    /**
     * �����һ����Ч�ķ������ҳ�����ָ��������һƪ�����еĳ���Ƶ����
     * <p>
     * ����һ��string����article�������Сn��һ����ͳ�Ƶ���word���뷵�ظõ����������еĳ���Ƶ����
     * ��֤���µĴ���С�ڵ���1000��
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
