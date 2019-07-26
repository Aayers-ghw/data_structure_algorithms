package leetcode;

import algo.tree.Solution;

/**
 * @author Aayers-ghw
 * @date 2019/7/22 11:28
 */
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.search(new int[]{4,5,6,7,0,1,2}, 0);
        new MoveZeroes().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
