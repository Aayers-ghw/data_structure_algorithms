package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/25 21:18
 */
public class Substr {

    /**
     * ����һ��СдӢ����ĸ��ɵ��ַ���s��һ�������϶�СдӢ���ַ���������p�������һ����Ч�㷨��
     * ����p�е�ÿһ���϶��ַ������ж����Ƿ�Ϊs���Ӵ���
     * <p>
     * ����һ��string����p�����Ĵ�Сn��ͬʱ����string s��Ϊĸ�����뷵��һ��bool���飬ÿ��Ԫ�ش���p�еĶ�Ӧ�ַ����Ƿ�Ϊs���Ӵ���
     * ��֤p�еĴ�����С�ڵ���8����p�еĴ��ĸ���С�ڵ���500��ͬʱ��֤s�ĳ���С�ڵ���1000��
     *
     * @param p
     * @param n
     * @param s
     * @return
     */
    public boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        if (p == null || p.length == 0) {
            return new boolean[]{};
        }
        boolean[] res = new boolean[n];
        for (int i = 0; i < p.length; ++i) {
            if (s.contains(p[i])) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        return res;
    }
}
