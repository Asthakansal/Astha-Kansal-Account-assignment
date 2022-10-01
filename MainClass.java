package day4;

import java.util.Scanner;

public class MainClass
{
	Account allAccount[] = new Account[67895999];
	int noofAccounts = 0;
    Scanner sc = new Scanner(System.in);
	Scanner scStr = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass accapp = new MainClass();

		while (true) {
			System.out.println(" -- Account Menu ---");
			System.out.println("1. add Account");
			System.out.println("2. Edit Contact Details ");
			System.out.println("3. View Contact Details ");
			System.out.println("4. Edit KYCVerification Details ");
			System.out.println("5. View KYCVerification Details ");
		    System.out.println("6. View Account Details ");
			System.out.println("7. Deposit Amount ");
			System.out.println("8. Withdraw Amount ");
			
			System.out.println("9. Exit ");

			System.out.println("Enter ur choice :- ");

			switch (accapp.sc.nextInt()) {

			case 1:
				accapp.addAccount();
				break;
				
			
				
			case 2:
				accapp.editContactDetails();
				break;
		
			case 3:
				accapp.viewContactDetails();
				break;
				
			case 4:
				accapp.editKYCVerificationDetails();
				break;
				
			case 5:
				accapp.viewKYCVerificationDetails();
				break;
				
			case 6:
				accapp.viewAccountDetails();
				break;
				
			case 7:
				accapp.depositAmount();
				break;
				
			case 8:
			accapp.withdrawAmount();
			break;
			
			
			default:
				System.out.println("Exit ");
				System.exit(0);
			}//end of switch

		}//end of while

	}//end of main
	
	

	public void addAccount() {
		
		
		
		System.out.println("Enter Account Number ");
		long accountNumber = sc.nextInt();
		
		System.out.println("Enter user name ");
		String userName = scStr.nextLine();
		
		System.out.println("Enter password ");
		String password = scStr.nextLine(); 
		
		System.out.println("Enter account initial balance ");
		int balance=sc.nextInt();
		
		System.out.println("Enter KYC Verification Details: ");
		System.out.println("Enter pan Number ");
		String panNumber=scStr.nextLine();

		System.out.println("Enter adhar Number ");
		long adharNumber=sc.nextInt();
		
		System.out.println("Enter Document Type ");
		String documentType=scStr.nextLine();
		
		System.out.println("Enter Document Number ");
		String documentNumber=scStr.nextLine();
		
		System.out.println("Enter Contact Details: ");
	    System.out.println("Enter House Number ");
		String houseNumber=scStr.nextLine();
		
		System.out.println("Enter Locality Name ");
		String localityName=scStr.nextLine();
		
		System.out.println("Enter Street Name ");
		String streetName=scStr.nextLine();
		
		System.out.println("Enter City Name ");
		String cityName=scStr.nextLine();
		
		System.out.println("Enter Country Name ");
		String countryName=scStr.nextLine();
		
		System.out.println("Enter pincode of your city ");
		long pincode=sc.nextInt();
		
		
		KYCVerification kv=new KYCVerification(panNumber,adharNumber,documentType,documentNumber);
		ContactDetails cd=new ContactDetails(houseNumber,localityName,streetName,cityName,countryName,pincode);
		Account a = new Account(accountNumber,userName,password,balance,kv,cd,balance);
         a.setdetails(cd);
         a.setkyc(kv);
		
		
		
		allAccount[noofAccounts++] = a;
		System.out.println(" "+a);
		System.out.println(" Added in the List ");
		
		
	}
	
	public Account getAccountById(int searchAccountNumber)
	{
		{
			for(int i=0;i<noofAccounts;i++)
			{  Account a=allAccount[i];
			boolean isFound=(a.getaccountNumber()==searchAccountNumber)?true:false;
			if(isFound)
		return a;	
		}
		}
		return null;
	}
	

	
	public void viewKYCVerificationDetails() {
		System.out.println("Enter Searched Account Number  ");
		int searchAccountNumber = sc.nextInt();
		
		Account a= getAccountById(searchAccountNumber);
		
		System.out.println(a.getkyc());

	}
	public void viewContactDetails() {
		System.out.println("Enter Searched Account Number  ");
		int searchAccountNumber = sc.nextInt();
		
		Account a= getAccountById(searchAccountNumber);
		
		System.out.println(a.getdetails());

	}

	public void viewAccountDetails()
	{
		System.out.println("Enter searched Account Number");
		int searchAccountNumber=sc.nextInt();
		   
		Account a=getAccountById(searchAccountNumber);
		System.out.println(a);
	}
	
	public void editContactDetails() {
		System.out.println("Enter Searched Account Number");
		int searchAccountNumber=sc.nextInt();
		
		Account a=getAccountById(searchAccountNumber);
		
		System.out.println(" --- Store Details ---");
		System.out.println(a.getdetails());
	
		System.out.println(" ---- Enter New Contact Details ---- ");
		
		System.out.println("Enter Changed House Number ");
		String hN=scStr.nextLine();
		
		System.out.println("Enter Changed Locality Name ");
		String lN=scStr.nextLine();
		
		System.out.println("Enter Changed Street Name  ");
		String sN=scStr.nextLine();
		
		System.out.println("Enter Changed city Name ");
		String cityN=scStr.nextLine();
		
		System.out.println("Enter Changed Country Name ");
		String cN=scStr.nextLine();
		
		System.out.println("Enter Changed Pincode ");
		int pC = sc.nextInt(); // 
		
		
		/*  code to update the details */
		// 1st get the details of the car
		// 2nd enter (set) new values
		a.getdetails().sethouseNumber(hN);
		a.getdetails().setlocalityName(lN);
		a.getdetails().setstreetName(sN);
		a.getdetails().setcityName(cityN);
		a.getdetails().setcountryName(cN);
		a.getdetails().setpincode(pC);
		
		
		System.out.println(" --->> New Contact Details after updation :- ");
		System.out.println(a);
		
				
	}
	
	public void editKYCVerificationDetails() {
		System.out.println("Enter Searched Account Number");
		int searchAccountNumber=sc.nextInt();
		
		Account a=getAccountById(searchAccountNumber);
		
		System.out.println(" --- Store Details ---");
		System.out.println(a.getkyc());
	
		System.out.println(" ---- Enter New Contact Details ---- ");
		
		System.out.println("Enter Changed Pan Number ");
		String pN=scStr.nextLine();
		
		System.out.println("Enter Changed Adhar Number ");
		int aN=sc.nextInt();
		
		
		System.out.println("Enter Changed Document Type  ");
		String dT=scStr.nextLine();
		
		System.out.println("Enter Changed Document Number ");
		String dN=scStr.nextLine();//
		
        /*  code to update the details */
		// 1st get the details of the car
		// 2nd enter (set) new values
		a.getkyc().setpanNumber(pN);
		a.getkyc().setadharNumber(aN);
		a.getkyc().setdocumentType(dT);
		a.getkyc().setdocumentNumber(dN);
		
		
		
		
		
		System.out.println(" --->> New KYC Verification Details after updation :- ");
		System.out.println(a);
		
				
	}


	public void depositAmount()
	{
		System.out.println("Enter the Deposit Amount");
		int amount=sc.nextInt();
		System.out.println("Enter the Account number in which you want to deposit");
        int searchAccountNumber=sc.nextInt();
		for(int i=0;i<noofAccounts;i++)
		{  Account a=allAccount[i];
		boolean isFound=(a.getaccountNumber()==searchAccountNumber)?true:false;
		if(isFound)	
		{
			a.setbalance(a.getbalance()+amount);
			System.out.println("Amount Tranfer Done");
			System.out.println(a.getaccountNumber()+"-"+a.getbalance());
			
			}
	}
	
	}

	public void withdrawAmount()
	{
		System.out.println("Enter the Withdraw Amount");
		int amount=sc.nextInt();
		System.out.println("Enter the Account number from which you want to withdraw");
        int searchAccountNumber=sc.nextInt();
		for(int i=0;i<noofAccounts;i++)
		{  Account a=allAccount[i];
		boolean isFound=(a.getaccountNumber()==searchAccountNumber)?true:false;
		if(isFound)	
		{
			a.setbalance(a.getbalance()-amount);
			System.out.println("Amount Withdraw Done");
			System.out.println(a.getaccountNumber()+"-"+a.getbalance());
			
	}
				
		}
	}
}
	
	
	
	


	



