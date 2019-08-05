package leetcodetop100;

import algo.array.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/8/5 18:59
 */
public class QueueReconstructionByHeight {

    public int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people[0].length == 0) {
            return new int[0][0];
        }
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
            }
        });
        List<int[]> temp = new ArrayList<>();
        for (int i = 0; i < people.length; ++i) {
            temp.add(people[i][1], people[i]);
        }
        int[][] res = new int[people.length][2];
        int i = 0;
        for (int[] k : temp) {
            res[i++] = k;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ints = new QueueReconstructionByHeight().reconstructQueue(
                new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
        for (int[] num : ints) {
            System.out.println(Arrays.toString(num));
        }
    }
}
