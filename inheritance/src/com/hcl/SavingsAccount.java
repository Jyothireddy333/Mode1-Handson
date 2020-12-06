package com.hcl;

public class SavingsAccount extends Account{
		String orgname;

		public SavingsAccount() {
			super();
		}

		public SavingsAccount(String accNo, String accName, String bankname, String orgname) {
			super(accNo, accName, bankname);
			this.orgname = orgname;
		}

		public String getOrgname() {
			return orgname;
		}

		public void setOrgname(String orgname) {
			this.orgname = orgname;
		}
		public void display()
		{
			super.display();
			System.out.println(orgname);
		}


}
