package com.hcl;
	public class FixedAccount extends SavingsAccount{
		private int lockingperiod;
		

		  public int getLockingPeriod() {
		    return lockingperiod;
		  }

		  public void setLockingPeriod(int lockingPeriod) {
		    this.lockingperiod= lockingPeriod;
		  }
		}


