package programmerinterviewbook;

import java.util.ArrayList;

/**
 * @author Aayers-ghw
 * @date 2019/8/18 15:03
 */
public class CatDogAsylum {

    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        if (ope == null || ope.length == 0) {
            return res;
        }
        for (int i = 0; i < ope.length; ++i) {
            if (ope[i][0] == 1) {
                list.add(ope[i][1]);
            } else if (ope[i][0] == 2) {
                if (ope[i][1] == 1) {
                    for (int j = 0; j < list.size(); ++j) {
                        if (list.get(j) > 0) {
                            res.add(list.remove(j));
                            break;
                        }
                    }
                } else if (ope[i][1] == -1) {
                    for (int j = 0; j < list.size(); ++j) {
                        if (list.get(j) < 0) {
                            res.add(list.remove(j));
                            break;
                        }
                    }
                } else if (ope[i][1] == 0) {
                    if (!list.isEmpty()) {
                        res.add(list.remove(0));
                    }
                }
            }
        }
        return res;
    }
}
