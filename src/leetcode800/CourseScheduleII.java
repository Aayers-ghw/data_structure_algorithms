package leetcode800;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Aayers-ghw
 * @date 2019/9/2 15:05
 */
public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] degree = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;
        int[] res = new int[numCourses];

        for (int i = 0; i < numCourses; ++i) {
            graph[i] = new ArrayList();
        }
        for (int i = 0; i < prerequisites.length; ++i) {
            degree[prerequisites[i][0]]++;
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        for (int i = 0; i < numCourses; ++i) {
            if (degree[i] == 0) {
                queue.add(i);
                count++;
            }
        }
        int k = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            res[k++] = course;
            for (int i = 0; i < graph[course].size(); ++i) {
                int pointer = (int) graph[course].get(i);
                degree[pointer]--;
                if (degree[pointer] == 0) {
                    count++;
                    queue.add(pointer);
                }
            }
        }
        if (count != numCourses) {
            return new int[]{};
        }
        return res;
    }
}
