package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 10:56
 */
public class BinDecimal {
    /**
     * 有一个介于0和1之间的实数，类型为double，返回它的二进制表示。
     * 如果该数字无法精确地用32位以内的二进制表示，返回“Error”。
     * <p>
     * 给定一个double num，表示0到1的实数，请返回一个string，代表该数的二进制表示或者“Error”。
     *
     * @param num
     * @return
     */
    public String printBin(double num) {
        // write code here
        StringBuilder sb = new StringBuilder("0.");
        for (int i = 0; i < 32; ++i) {
            num = num * 2;
            if (num >= 1) {
                sb.append(1);
                num -= 1;
            } else {
                sb.append(0);
            }
            if (num == 0) {
                return sb.toString();
            }
        }
        return "Error";
    }
}
