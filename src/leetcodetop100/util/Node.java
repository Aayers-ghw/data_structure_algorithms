package leetcodetop100.util;

/**
 * @author Aayers-ghw
 * @date 2019/8/4 10:20
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}
