/*Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
Sample Input 1 :
121
Sample Output 1 :
true
Sample Input 2 :
1032
Sample Output 2 :
false
*/



import java.util.*;
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Num=sc.nextInt();
		int rem, sum=0;
		int temp=Num;
		
		while(Num>0) {
			rem=Num%10;
			sum=(sum*10)+rem;
			Num=Num/10;
		}
		if(temp==sum) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
