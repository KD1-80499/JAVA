import java.util.Scanner;

public class CreditLimitCalculator {
	
	private int accno;
	private int begbalance;
	private int totalitemscharged;
	private int totalcredits;
	private int allowedcreditlimit;
	private int newbalance;
	
	public CreditLimitCalculator() {
		this.accno = 0;
		this.begbalance = 0;
		this.totalitemscharged = 0;
		this.totalcredits = 0;
		this.allowedcreditlimit = 0;
		
	}

	public CreditLimitCalculator(int accno, int balance, int totalitemscharged, int totalcredits,
			int allowedcreditlimit, int begbalance) {
		this.accno = accno;
		this.begbalance = begbalance;
		this.totalitemscharged = totalitemscharged;
		this.totalcredits = totalcredits;
		this.allowedcreditlimit = allowedcreditlimit;
	}
	
	public int getAccno() {
		return accno;
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public int getBegbalance() {
		return begbalance;
	}

	public void setBegbalance(int begbalance) {
		this.begbalance = begbalance;
	}

	public int getTotalitemscharged() {
		return totalitemscharged;
	}

	public void setTotalitemscharged(int totalitemscharged) {
		this.totalitemscharged = totalitemscharged;
	}

	public int getTotalcredits() {
		return totalcredits;
	}

	public void setTotalcredits(int totalcredits) {
		this.totalcredits = totalcredits;
	}

	public int getAllowedcreditlimit() {
		return allowedcreditlimit;
	}

	public void setAllowedcreditlimit(int allowedcreditlimit) {
		this.allowedcreditlimit = allowedcreditlimit;
	}

	public int getNewbalance() {
		return newbalance;
	}

	public void setNewbalance(int newbalance) {
		this.newbalance = newbalance;
	}

	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Accno:");
	    this.accno=sc.nextInt();
	    System.out.println("Enter BegBalance:");
	    this.begbalance=sc.nextInt();
	    System.out.println("Enter totalitemscharged:");
	    this.totalitemscharged=sc.nextInt();
	    System.out.println("Enter totalcredits:");
	    this.totalcredits=sc.nextInt();
	    System.out.println("Enter allowedcreditlimit:");
	    this.allowedcreditlimit=sc.nextInt();
	 
	    
	}
	public void displayData()
	{
		System.out.println("Enter Accno:"+this.accno);
	    System.out.println("Enter Begbalance:"+this.begbalance);
	    System.out.println("Enter totalitemscharged:"+this.totalitemscharged);
	    System.out.println("Enter totalcredits:"+this.totalcredits);
	    System.out.println("Enter allowedcreditlimit:"+this.allowedcreditlimit);
	    calculateBalance() ;
	    
	}
	
	public void calculateBalance()
	{
		this.newbalance=(this.begbalance+this.totalitemscharged-this.totalcredits);
		if(this.newbalance>=this.totalcredits)
		{
			System.out.println("Credit Limit Exceeded");
		}
		else
		{
			System.out.println("NewBalance="+this.newbalance);
		}
	}
	
	public static void main(String[] args) {
		
		CreditLimitCalculator c1=new CreditLimitCalculator();
		System.out.println("********");
		c1.acceptData();
//		System.out.println("********");
//		c1.calculateBalance();	
		System.out.println("********");
		c1.displayData();
		System.out.println("********");
		
	}

}
 