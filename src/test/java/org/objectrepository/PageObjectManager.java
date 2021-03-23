package org.objectrepository;

public class PageObjectManager {

	private static PageObjectManager pom;
	private AddRecordPojo arj;
	private LoginPojo lp;
	public static PageObjectManager getPom() {
		return (pom==null) ? pom=new PageObjectManager(): pom;
	}
	public AddRecordPojo getArj() {
		return (arj==null) ? arj=new AddRecordPojo():arj;
	}
	public LoginPojo getLp() {
		return (lp==null) ? lp=new LoginPojo():lp;
	}
	
}
