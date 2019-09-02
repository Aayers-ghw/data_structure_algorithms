package interview.t360;

import java.util.*;

/**
 * @author Aayers-ghw
 * @date 2019/8/15 18:55
 */
public class Solution01 {

    /**
     * Ӣ����ʦ����������Ӣ����Ϻ���Χͬѧ��ͷ�Ӷ������Ը��㲼����һ�ݶ���ļ�ͥ��ҵ���ͷ��ͷ��㣺
     * ����һ���ַ���s��������s�������Ӵ��У��ҵ����ִ��������Ӵ���������ʦ���ĳ��ִ�����
     * <p>
     * ����
     * ��һ�У�һ���ַ���s������Ӣ��Сд��ĸ��ɣ�1��|s|��10000��
     * <p>
     * ���
     * һ������������ʾ�����ִ�����
     * <p>
     * <p>
     * ��������
     * aba
     * �������
     * 2
     * <p>
     * ��ʾ
     * aba�������Ӵ�Ϊa��b��a��ab��ba��aba������a�ĳ��ִ�����࣬������2�Ρ�
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            for (int j = i + 1; j <= str.length(); ++j) {
                res.add(str.substring(i, j));
            }
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < res.size(); ++i) {
            String key = res.get(i);
            if (map.containsKey(key)) {
                map.put(key, map.getOrDefault(key, 0) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);
    }
}
