/*Given input consists of n numbers. Check whether those n numbers form 
 * an arithmetic progression or not. Print true or false.
Input format :
Line 1 : n
Line 2 : n numbers
Sample Input 1 :
6
2 6 10 14 18 22
Sample Output 1 :
true
Sample Input 2 :
6
2 6 10 15 19 23
Sample Output 2 :
false
*/



import java.util.*;
public class CheckAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int prev=sc.nextInt();
		int curr=sc.nextInt();
		int count=3;
		int diff=curr-prev;
		prev=curr;
		
		while(count<=N) {
			curr=sc.nextInt();
			int tempDiff=curr-prev;
			
			if(tempDiff!=diff) {
				System.out.println("false");
				return;
			}
			count++;
			prev=curr;
		}
		System.out.println("true");

	}

}
