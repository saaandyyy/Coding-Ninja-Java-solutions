/*Given an integer array A of size n. Find and print all the leaders present in the input array. 
 An array element A[i] is called Leader, if all the elements following it (i.e. present at its right) are less than or equal to A[i].
 
Print all the leader elements separated by space and in the reverse order. That means whichever leader comes at last should be printed first.
Input Format :
Line 1 : Integer n, size of array
Line 2 : Array A elements (separated by space)
Output Format :
 leaders of array (separated by space)
Constraints :
1 <= n <= 10^6
Sample Input 1 :
6
3 12 34 2 0 -1
Sample Output 1 :
-1 0 2 34
Sample Input 2 :
5
13 17 5 4 6
Sample Output 2 :
6 17
*/



public class FindLeaders_In_Array {
	
	public static void leadres(int[] input) {
		int n = input.length;
		int max = Integer.MIN_VALUE;
		
		for(int i=n-1; i>=0; i--) {
			if(input[i] >= max) {
				System.out.print(input[i] + " ");
				max = input[i];
			}
		}
	}
}
