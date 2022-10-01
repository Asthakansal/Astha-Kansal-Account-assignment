package day4;

public class Account {
	long accountNumber;
	String userName;
	String password;
	int balance;
	KYCVerification kycdetails;
	ContactDetails contactdetails;
	int cashback;
	private KYCVerification kv;
	private ContactDetails cd;
	
	public Account(long accountNumber, String userName, String password ,int balance,KYCVerification kycdetails,ContactDetails contactdetails,int cashback) {
		super();
		this.accountNumber = accountNumber;
		this.userName = userName;
		this.password = password;
		this.balance = balance;
		this.kycdetails = kycdetails;
		this.contactdetails = contactdetails;
		this.cashback=cashback;
	}
	public Account(){
		super();
		
	}

	public KYCVerification getkyc()
	{
		return kv;
	}
	public void setkyc(KYCVerification kv)
	{
		this.kv=kv;
		
	}
	public ContactDetails getdetails()
	{
		return cd;
	}
public void setdetails(ContactDetails cd)
{
	this.cd=cd;
}
public long getaccountNumber()
{
	return accountNumber;
}
public void setaccountNumber(long accountNumber)
{
	this.accountNumber=accountNumber;
	
}
public String getuserName()
{
	return userName;
}
public void setuserName(String userName)
{
	this.userName=userName;
	
}
public String getpassword()
{
	return password;
}
public void setpassword(String password)
{
	this.password=password;
	
}
public int getbalance()
{
	return balance;
}
public void setbalance(int balance)
{
	this.balance=balance;
	
}
public int getcashback()
{
	return cashback;
}
public void setcashback(int cashback)
{
	this.cashback=cashback;
	
}
public String toString() {
	return "Account [accountNumber=" + accountNumber + ", userName=" + userName + ", password=" + password + ",balance=" + balance+",kycdetails="+kycdetails+",contactdetails="+contactdetails + "]";
}
}
