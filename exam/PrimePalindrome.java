package exam.com;
public class PrimePalindrome {
	
	public static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome(int num) {
		int copyNum=num;
		int digit;
		int reverse=0;
		while(num>0) {
			digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		if(copyNum==reverse) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		//Prime Numbers;
		System.out.println("The prime numbers are");
		for(int i=100;i<1100;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		System.out.println(" ");
		System.out.println("The palindrome numbers are");
		//Palindrome Numbers;
		for(int i=100;i<1100;i++) {
			if(isPalindrome(i)) {
				System.out.print(i+" ");
			}
		}
		
	}
}
