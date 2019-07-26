package leetcode;

import leetcode.util.Interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Aayers-ghw
 * @date 2019/7/26 18:36
 */
public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        if (intervals == null || intervals.size() < 1) {
            return intervals;
        }
        intervals.sort((o1, o2) -> (o1.start - o2.start));
        List<Interval> result = new ArrayList<>();
        Interval tmp = null;
        for (Interval interval : intervals) {
            if (tmp == null || interval.start > tmp.end) {
                result.add(interval);
                tmp = interval;
            } else {
                tmp.end = interval.end;
            }
        }
        return result;
    }

    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return intervals;
        }
        Arrays.sort(intervals, (o1, o2) -> (o1[0] - o2[0]));
        List<int[]> result = new ArrayList<>();
        int[] newInterval = intervals[0];
        result.add(newInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                newInterval = interval;
                result.add(newInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
