package leetCode;
/**
 * �ж��Ƿ��ǻ�������12321�� 3223--> 10-->3 100-->23-->2 1000-->223-->2 ------------>3
 * 
 * @author Han 1.��ѧ�����ж� 2.ת�����ַ����ж�
 *
 */
public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0 || (x != 0 && x % 10 == 0))
			return false;
		int rev = 0;
		while (x > rev) {
			rev = rev * 10 + x % 10;
			x = x / 10;
		}
		return (x == rev || x == rev / 10);
	}
}