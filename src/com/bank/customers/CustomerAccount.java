package com.bank.customers;

public class CustomerAccount {
  private int customerId;
  private String customerName;
  private String email;
  private String phoneNumber;
  private String address;
  private String accountType;
  private int balance;
  private boolean kycStatus;
  
  public CustomerAccount() {
	  this.kycStatus=false;
	  System.out.println("Customer Profile Initialized — Status: Pending KYC");
  }
  public CustomerAccount(String Name,String Number) {
	  this();
	  setcustomerName(Name);
	  setphoneNumber(Number);
  }
  public CustomerAccount(String Name,String Number,String Type) {
	  this(Name,Number);
	  setaccountType(Type);
  }
  public CustomerAccount(int customerId, String Name, String email, String Number, String address,
		String Type, int balance, boolean kycStatus) {
	this(Name,Number,Type);
	this.customerId = customerId;
	setemail(email);
	setaddress(address);
	setbalance(balance);
	setkycStatus(kycStatus);
  }
  public void setcustomerName(String name) {
	  if(name!=null && !name.trim().isEmpty()) {
		  this.customerName=name;
	  }
	  else {
		  System.out.println("Invalid Name");
	  }
  }
  public void setemail(String email) {
	  if(email!=null && email.contains("@")) {
		  this.email=email;
	  }
	  else {
		  System.out.println("Invalid Name");
	  }
  }
  public void setphoneNumber(String Number) {
	  if(Number!=null && Number.matches("\\d{10}")) {
	  this.phoneNumber=Number;}
  }
  public void setaddress(String address) {
	  if(address !=null && !address.equals(this.address)) {
		  this.address=address;
	  }else {
		  System.out.println("invalid address");
	  }
  }
  public void setaccountType(String Type) {
	  if(Type.equalsIgnoreCase("SAVING")||
		 Type.equalsIgnoreCase("CURRENT")||
		 Type.equalsIgnoreCase("SALARY")||
		 Type.equalsIgnoreCase("PREMIUM"))
	  {
	  this.accountType=Type.toUpperCase();
		 }
		 else {
			 System.out.println("Invalid account");
		 }
  }
  public void setbalance(int bal) {
	  if(bal!=null && bal>0) {
		  this.balance=bal;
	  }
	  else {
		  System.out.println("invalid balance");
	  }
  }
  
  
}
