public class Fibonacci{
	
	public static void main (String [] args) { 
		
		int n=7;
		System.out.println(findFib(n));
	}
	public static int findFib(int n) {
		
		if (n==1) {
			return 1;
		}
		if (n==2) {
			return 1;
			}
		
		return findFib(n-1)+findFib(n-2);
		
	}
}