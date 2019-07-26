package algo.ac;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AC {

    private AcNode root = new AcNode('/');

    class AcNode {
        public char data;
        public AcNode[] children = new AcNode[26];    //�ַ���ֻ����a~z��26���ַ�
        public boolean isEndingChar = false;    //��β�ַ�Ϊtrue
        public int length = -1;    //��isEndingChar = trueʱ����¼ģʽ������
        public AcNode fail;    //ʧ��ָ��

        public AcNode(char data) {
            this.data = data;
        }
    }

    public void buildTrieTree(List<String> words) {
        for (String word : words) {
            AcNode p = root;
            for (int i = 0; i < word.length(); ++i) {
                int index = word.charAt(i) - 'a';
                if (p.children[index] == null) {
                    AcNode newNode = new AcNode(word.charAt(i));
                    p.children[index] = newNode;
                }
                p = p.children[index];
            }
            p.isEndingChar = true;
        }
    }

    public void buildFailurePointer() {
        Queue<AcNode> queue = new LinkedList<>();
        root.fail = null;
        queue.add(root);
        while (queue.isEmpty()) {
            AcNode p = queue.remove();
            for (int i = 0; i < 26; ++i) {
                AcNode pc = p.children[i];
                if (pc == null) {
                    continue;
                }
                if (p == root) {
                    pc.fail = root;
                } else {
                    AcNode q = p.fail;
                    while (q != null) {
                        AcNode qc = q.children[pc.data - 'a'];
                        if (qc != null) {
                            pc.fail = qc;
                            break;
                        }
                        q = q.fail;
                    }
                    if (q == null) {
                        pc.fail = root;
                    }
                }
                queue.add(pc);
            }
        }
    }

    public void match(char[] text) { // text ������
        int n = text.length;
        AcNode p = root;
        for (int i = 0; i < n; ++i) {
            int idx = text[i] - 'a';
            while (p.children[idx] == null && p != root) {
                p = p.fail; // ʧ��ָ�뷢�����õĵط�
            }
            p = p.children[idx];
            if (p == null) p = root; // ���û��ƥ��ģ��� root ��ʼ����ƥ��
            AcNode tmp = p;
            while (tmp != root) { // ��ӡ������ƥ���ģʽ��
                if (tmp.isEndingChar == true) {
                    int pos = i - tmp.length + 1;
                    System.out.println(" ƥ����ʼ�±� " + pos + "; ���� " + tmp.length);
                }
                tmp = tmp.fail;
            }
        }
    }

}
