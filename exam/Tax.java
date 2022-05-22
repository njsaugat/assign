package exam.com;

public class Tax {

	public  double taxCalculator(double income) {
		double tax;
		if(income>350000) {
			tax=25000+0.28d*(income-350000);
		}else if(income>250000) {
			tax=5000+0.18d*(income-250000);
		}else if(income>200000) {
			tax=0.09d*(income-200000);
		}else {
			tax=0;
		}
		return tax;
	}
	public static void main(String[] args) {
		Tax taxAmount=new Tax();
		System.out.println("the tax is Rs."+ taxAmount.taxCalculator(89000));
		System.out.println("the tax is Rs."+ taxAmount.taxCalculator(310000));
		System.out.println("the tax is Rs."+ taxAmount.taxCalculator(900000));
		System.out.println("the tax is Rs."+ taxAmount.taxCalculator(2500000));
	}
}

