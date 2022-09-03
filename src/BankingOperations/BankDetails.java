package BankingOperations;

import java.util.ArrayList;
import java.util.List;

public class BankDetails 
{
	private String name;
	private String ifscCode;
	private String nickName;
	private final static String BANK_NAME = "SBI";
	private double totalAccountBalance;
	private static int noOfAccounts;
	private static List<String> ifscList = new ArrayList<>();
	private String accountNumber;
	
	public BankDetails()
	{
		noOfAccounts++;
	}
	
	public BankDetails(String name,String nickName,String ifscCode,long amountToBeSubmitted)
	{
		this.name = name;
		this.nickName = nickName;
		this.ifscCode = ifscCode;
//		this.amountToBeSubmitted = amountToBeSubmitted;
		noOfAccounts++;
		accountNumber = "SBI100000"+noOfAccounts;
		ifscList.add(this.ifscCode);
		getBalance(amountToBeSubmitted);
	}
	
	public double getBalance(long amountToBeSubmitted)
	{
		
		totalAccountBalance = totalAccountBalance + amountToBeSubmitted;
		return totalAccountBalance;
	}
	
	public String getCustDetails()
	{
		String details = "CUSTOMER NAME   "+name+"\n"+"CUSTOMER NICK NAME   "+nickName+"\n"+"CUSTOMER IFSC CODE"+ifscCode+"\n"+"CUSTOMER BALANCE   "+totalAccountBalance
				+"\n"+"ACCOUNT NUMBER  "+accountNumber+"\n"+"\n";
		return details;
	}
	
	public static String getBankInfo()
	{
		String info = "BANK NAME "+BANK_NAME+"\n"+"NO OF ACCOUNTS "+noOfAccounts+"\n"+"IFSC CODES "+ifscList;
		return info;
	}
}
