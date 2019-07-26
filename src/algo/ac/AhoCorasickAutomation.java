package algo.ac;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class AhoCorasickAutomation {

	/*��ʾ���е�AC�Զ���ֻ����Ӣ�����͵��ַ�������������ĳ�����128*/
    private static final int ASCII = 128;
     
    /*AC�Զ����ĸ���㣬����㲻�洢�κ��ַ���Ϣ*/
    private Node root;
     
    /*�����ҵ�Ŀ���ַ�������*/
    private List<String> target;
     
    /*��ʾ���ı��ַ����в��ҵĽ����key��ʾĿ���ַ����� value��ʾĿ���ַ������ı������ֵ�λ��*/
    private HashMap<String, List<Integer>> result;
     
    /*�ڲ���̬�࣬���ڱ�ʾAC�Զ�����ÿ����㣬��ÿ����������ǲ�û�д洢�ý���Ӧ���ַ�*/
    private static class Node{
         
        /*����ý����һ���յ㣬�����Ӹ���㵽�˽���ʾ��һ��Ŀ���ַ�������str != null, ��str�ͱ�ʾ���ַ���*/
        String str;
         
        /*ASCII == 128, ���������൱��128����*/
        Node[] table = new Node[ASCII];
         
        /*��ǰ���ĺ��ӽ�㲻��ƥ���ı����е�ĳ���ַ�ʱ����һ��Ӧ�ò��ҵĽ��*/
        Node fail;
         
        public boolean isWord(){
            return str != null;
        }
         
    }
     
    /*target��ʾ�����ҵ�Ŀ���ַ�������*/
    public AhoCorasickAutomation(List<String> target){
        root = new Node();
        this.target = target;
        buildTrieTree();
        build_AC_FromTrie();
    }
     
    /*��Ŀ���ַ�������Trie��*/
    private void buildTrieTree(){
        for(String targetStr : target){
            Node curr = root;
            for(int i = 0; i < targetStr.length(); i++){
                char ch = targetStr.charAt(i);
                if(curr.table[ch] == null){
                    curr.table[ch] = new Node();
                }
                curr = curr.table[ch];
            }
            /*��ÿ��Ŀ���ַ��������һ���ַ���Ӧ�Ľ�����յ�*/
            curr.str = targetStr;
        }
    }
     
    /*��Trie������AC�Զ�����������һ���Զ������൱�ڹ���KMP�㷨��next����*/
    private void build_AC_FromTrie(){
        /*������ȱ�����ʹ�õĶ���*/
        LinkedList<Node> queue = new LinkedList<Node>();
         
        /*����������������к��ӽ��*/
        for(Node x : root.table){
            if(x != null){
                /*���������к��ӽ���fail��ָ������*/
                x.fail = root;
                queue.addLast(x);/*���и����ĺ��ӽ������*/
            }
        }
         
        while(!queue.isEmpty()){
            /*ȷ�����н������к��ӽ���fail��ָ��*/
            Node p = queue.removeFirst();
            for(int i = 0; i < p.table.length; i++){
                if(p.table[i] != null){
                    /*���ӽ������*/
                    queue.addLast(p.table[i]);
                    /*��p.fail��ʼ����*/
                    Node failTo = p.fail;
                    while(true){
                        /*˵���ҵ��˸���㻹û���ҵ�*/
                        if(failTo == null){
                            p.table[i].fail = root;
                            break;
                        }
                         
                        /*˵���й���ǰ׺*/
                        if(failTo.table[i] != null){
                            p.table[i].fail = failTo.table[i];
                            break;
                        }else{/*��������Ѱ��*/
                            failTo = failTo.fail;
                        }
                    }
                }
            }
        }
    }
     
    /*���ı����в������е�Ŀ���ַ���*/
    public HashMap<String, List<Integer>> find(String text){
        /*����һ����ʾ�洢����Ķ���*/
        result = new HashMap<String, List<Integer>>();
        for(String s : target){
            result.put(s, new LinkedList<Integer>());
        }
         
        Node curr = root;
        int i = 0;
        while(i < text.length()){
            /*�ı����е��ַ�*/
            char ch = text.charAt(i);
             
            /*�ı����е��ַ���AC�Զ����е��ַ����бȽ�*/
            if(curr.table[ch] != null){
                /*����ȣ��Զ���������һ״̬*/
                curr = curr.table[ch];
                 
                if(curr.isWord()){
                    result.get(curr.str).add(i - curr.str.length()+1);
                }
                 
                /*��������ױ����ӣ���Ϊһ��Ŀ�괮���м�ĳ�����ַ����������ð�����һ��Ŀ���ַ�����
                 * ��ʹ��ǰ��㲻��ʾһ��Ŀ���ַ������յ㣬������ǰ���Ϊֹ����ǡ�ð�����һ���ַ���*/
                if(curr.fail != null && curr.fail.isWord()){
                    result.get(curr.fail.str).add(i - curr.fail.str.length()+1);
                }
                 
                /*����������ָ����һ���ı����е��ַ�*/
                i++;
            }else{
                /*�����ȣ��ҵ���һ��Ӧ�ñȽϵ�״̬*/
                curr = curr.fail;
                 
                /*������㻹δ�ҵ���˵���ı�������ch��Ϊ�������ַ�Ƭ�β����κ�Ŀ���ַ�����ǰ׺��
                 * ״̬�����ã��Ƚ���һ���ַ�*/
                if(curr == null){
                    curr = root;
                    i++;
                }
            }
        }
        return result;
    }
     
     
    public static void main(String[] args){
        List<String> target = new ArrayList<String>();
        target.add("abcdef");
        target.add("abhab");
        target.add("bcd");
        target.add("cde");
        target.add("cdfkcdf");
         
        String text = "bcabcdebcedfabcdefababkabhabk";
         
        AhoCorasickAutomation aca = new AhoCorasickAutomation(target);
        HashMap<String, List<Integer>> result = aca.find(text);
         
        System.out.println(text);
        for(Entry<String, List<Integer>> entry : result.entrySet()){
            System.out.println(entry.getKey()+" : " + entry.getValue());
        }
         
    }
}
