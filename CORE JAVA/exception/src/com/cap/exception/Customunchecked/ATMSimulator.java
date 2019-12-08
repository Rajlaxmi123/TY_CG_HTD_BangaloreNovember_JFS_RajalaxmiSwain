package com.cap.exception.Customunchecked;

public class ATMSimulator {
	void withdraw(double amount)
	{
		if(amount>40000)
		{
			throw new DayLimitException("user exceeds day limit of withdraw amount");
		}
	}

}
