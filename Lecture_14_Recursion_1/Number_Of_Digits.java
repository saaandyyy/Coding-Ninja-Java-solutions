/*Given the number 'n', find out and return the number of digits present in a number recursively.
Input Format :
Integer n
Output Format :
Count of digits
Constraints :
1 <= n <= 10^6
Sample Input 1 :
 156
Sample Output 1 :
3
Sample Input 2 :
 7
Sample Output 2 :
1
*/



public class Number_Of_Digits {
	
	public static int count(int n) {
		
		if(n == 0) {
			return 0;
		}
		int smallans = count(n/10);
		return smallans + 1;
	}
}
