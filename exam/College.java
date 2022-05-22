package exam.com;
import java.util.Scanner;
public class College {
	public static void main(String[] args) {
		Student studentList[]=new Student[5];
		Scanner scan=new Scanner(System.in);
		String name;
		String address;
		String email;
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the name of the student");
			name=scan.next();
			System.out.println("Enter the address of the student");
			address=scan.next();
			System.out.println("Enter the email of the student");
			email=scan.next();
			Student obj= new Student(name,address,email);
			studentList[i]=obj;
		}
		
		for(int i=0;i<studentList.length;i++) {
			System.out.println("The name of the student is "+ studentList[i].getName());
			System.out.println("The address of the student is "+ studentList[i].getAddress());
			System.out.println("The email of the student is "+ studentList[i].getEmail());
		}
		scan.close();
		
		
	}
}
