package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:31
 */
public class AddSubstitution {

    /**
     * 请编写一个方法，实现整数的乘法、减法和除法运算(这里的除指整除)。只允许使用加号。
     * <p>
     * 给定两个正整数int a,int b,同时给定一个int type代表运算的类型，1为求a ＊ b，0为求a ／ b，-1为求a － b。
     * 请返回计算的结果，保证数据合法且结果一定在int范围内。
     *
     * @param a
     * @param b
     * @param type
     * @return
     */
    public int calc(int a, int b, int type) {
        // write code here
        int res = 0;
        switch (type) {
            case 1: {
                res = mult(a, b);
                break;
            }
            case 0: {
                res = div(a, b);
                break;
            }
            case -1: {
                res = sub(a, b);
                break;
            }
            default:
        }
        return res;
    }

    public int mult(int a, int b) {
        int r = 0;
        for (int i = 0; i < a; i++) {
            r += b;
        }
        return r;
    }

    public int div(int a, int b) {
        for (int i = 1; i <= a; ++i) {
            if (mult(i, b) <= a && mult(i + 1, b) > a) {
                return i;
            }
        }
        return 0;
    }

    public int sub(int a, int b) {
        if (a >= b) {
            for (int i = 1; i <= a; ++i) {
                if (a == b + i) {
                    return i;
                }
            }
        }
        return mult(sub(b, a), -1);
    }
}
