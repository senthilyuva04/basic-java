package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * @author hp
 *
 */
public class ELPalindromicNumber{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();
		String num = getELPalindromeNum(n);
		getCharCount(num);
	}

	private static void getCharCount(String num) {
		char[] palindromeChar = num.toCharArray();
		int maxCount = 0;
		Arrays.sort(palindromeChar);
		char maxChar=palindromeChar[0];
		for (int i = 0; i < palindromeChar.length; i++) {
			int count = 0;
			for (int j = i; j < palindromeChar.length; j++) {
				if (palindromeChar[i] == palindromeChar[j]) {
					count++;
				}
				if (count > maxCount) {
					maxChar = palindromeChar[i];
					maxCount = count;
				}
			}
		}
		System.out.println(maxChar);
	}

	private static String getELPalindromeNum(String n) {
		String value = n;
		for (int j = n.length() - 1; j >= 0; j--) {
			value += n.charAt(j);
		}
		return value;
	}
}
