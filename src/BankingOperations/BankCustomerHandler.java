package BankingOperations;

public class BankCustomerHandler {
	public static void main(String[] args) 
	{
		BankDetails bankDetailsP1 = new BankDetails("HARSH","GOLU","SBIN101",10000);
		BankDetails bankDetailsP2= new BankDetails("AMIT","AMU","SBIN102",20000);
		BankDetails bankDetailsP3= new BankDetails("MOHIT","MUU","SBIN103",30000);
		BankDetails bankDetailsP4= new BankDetails("NIGAN","NIGGA","SBIN104",40000);
		BankDetails bankDetailsP5= new BankDetails("SANJAY","SANJU","SBIN105",50000);
		
		System.out.print(bankDetailsP1.getCustDetails());
		System.out.print(bankDetailsP2.getCustDetails());
		System.out.print(bankDetailsP3.getCustDetails());
		System.out.print(bankDetailsP4.getCustDetails());
		System.out.print(bankDetailsP5.getCustDetails());
		
		System.out.println(BankDetails.getBankInfo());
		
	}

}
