package pages;


import wrappers.GenericWrappers;


public class AddressPage extends  GenericWrappers{
	
	

		public AuditPage clickUpdate() {
			
			getElementByXpath("//span[contains(text(),'Update')]").click();
			return new AuditPage();
			}
		
		
		public AddressPage varifyStateName() {
			
			String State = getTextByXpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[1]");
			System.out.println("City of the Address verified as: "+State);
			return this;
			
		}
		public AddressPage varifycityName() {
			
			String city = getTextByXpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[2]");
			System.out.println("City of the Address verified as: "+city);
			return this;
			
		}
		
		public LoginPage clickSignOut(){
			clickByXpath("//a[@class='logout']");
			return new LoginPage(); 
			
		
		
			
			
			
			
			
			
			
			
			
		

}
}
