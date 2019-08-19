package programmerinterviewbook;

/**
 * @author Aayers-ghw
 * @date 2019/8/19 14:18
 */
public class CrossLine {

    /**
     * 给定直角坐标系上的两条直线，确定这两条直线会不会相交。
     * <p>
     * 线段以斜率和截距的形式给出，即double s1，double s2，double y1，double y2，
     * 分别代表直线1和2的斜率(即s1,s2)和截距(即y1,y2)，请返回一个bool，
     * 代表给定的两条直线是否相交。这里两直线重合也认为相交。
     *
     * @param s1
     * @param s2
     * @param y1
     * @param y2
     * @return
     */
    public boolean checkCrossLine(double s1, double s2, double y1, double y2) {
        // write code here
        boolean flag = Math.abs(s1 - s2) < 1e-6 && Math.abs(y1 - y2) > 1e-6;
        if (flag) {
            return false;
        }
        return true;
    }
}
