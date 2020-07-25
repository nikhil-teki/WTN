package com.wipro.ccbill.entity;

import java.util.Date;

import com.wipro.ccbill.exception.InputValidationException;

public class CreditCardBill {
	private String creditCardNo;
	private String customerId;
	@SuppressWarnings("unused")
	private Date billDate;
	private Transaction monthTransactions[];
	public CreditCardBill()
	{
		
	}
	public CreditCardBill(String creditCardNo,String customerId,Date billDate,Transaction monthTransactions[])
	{
		this.creditCardNo=creditCardNo;
		this.customerId=customerId;
		this.billDate=billDate;
		this.monthTransactions=monthTransactions;
	}
	public double getTotalAmount(String transactionType)
	{
		double totalAmount=0;
		int monthTransactionsLength=monthTransactions.length;
		if((transactionType.equals("DB"))||(transactionType.equals("CR")))
		{
			for(int i=0;i<monthTransactionsLength;i++)
			{
				if(monthTransactions[i].getTransactionType().equals(transactionType))
				{
					double transactionAmount=monthTransactions[i].getTransactionAmount();
					totalAmount+=transactionAmount;
				}
			}
		}
		return totalAmount;
	}
	public double calculateBillAmount()
	{
		try
		{
			validateData();
			if((monthTransactions!=null)&&(monthTransactions.length>0))
			{
				double totalAmountSpend=getTotalAmount("DB");
				double totalAmountPaid=getTotalAmount("CR");
				double outstandingAmount=Math.abs(totalAmountPaid-totalAmountSpend);
				double interest=(outstandingAmount*(19.9/100)/12);
				double billAmount=outstandingAmount+interest;
				return billAmount;
			}
			else
				return 0.0;
		}
		catch(InputValidationException e)
		{
			//System.out.println(e);
			return 0.0;
		}
	}
	public String validateData()throws InputValidationException
	{
		int creditCardNoLength=creditCardNo.length();
		int customerIdLength=customerId.length();
		if(creditCardNo.equals(null))
			throw new InputValidationException();
		else if(creditCardNoLength!=16)
			throw new InputValidationException();
		else if(customerId.equals(null))
			throw new InputValidationException();
		else if(customerIdLength<6)
			throw new InputValidationException();
		else
			return "valid";
	}
}
