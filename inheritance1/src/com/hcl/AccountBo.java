package com.hcl;

public class AccountBo {
	public FixedAccount getAccountDetails(String detail) {
		String[] temp1 = detail.split(",");
		FixedAccount fa = new FixedAccount();
	    
		fa.setAccNo(temp1[0]);
	    fa.setBalance(Double.parseDouble(temp1[1]));
	    fa.setAccholdername(temp1[2]);
	    fa.setMinimumBalance(Double.parseDouble(temp1[3]));
	    fa.setLockingPeriod(Integer.parseInt(temp1[4]));
	    return fa;
	}
}

