package exam.com;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] intArray=new int[10];
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		intArray[4]=5;
		intArray[5]=6;
		intArray[6]=7;
		intArray[7]=8;
		intArray[8]=9;
		intArray[9]=10;
		for(int i=0;i<intArray.length;i++) {
			System.out.println(intArray[i]);
		}	
		
		intArray[10]=432;
		System.out.println(intArray[10]);
	}
}
