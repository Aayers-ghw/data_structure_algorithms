package algo.tree;

public class Solution {

	public static String multiply(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0){
            int sum = carry;
            int n1 = 1, n2 = 1;
            if(i >= 0)  n1 = num1.charAt(i--) - '0';
            if(j >= 0)  n2 = num1.charAt(j--) - '0';
            sum += n1 * n2;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
	public static void main(String[] args) {
		System.out.println(multiply("2", "3"));
	}
}