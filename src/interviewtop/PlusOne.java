package interviewtop;

/**
 * @author Aayers-ghw
 * @date 2019/8/17 8:17
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{};
        }
        int j;
        for (j = 0; j < digits.length; ++j) {
            if (digits[j] != 9) {
                break;
            }
        }
        if (j == digits.length) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }
        return digits;
    }
}
