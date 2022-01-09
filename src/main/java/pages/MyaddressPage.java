package pages;


import wrappers.GenericWrappers;


public class MyaddressPage extends  GenericWrappers{

		public AddressPage clickMyAddress() {
			
			clickByXpath("//span[contains(text(),'My addresses')]");
			return new AddressPage();	
		 
		}
		
		public TshirtPage clickWomen() {
			mouseOverByXpath("//a[@title='Women']");
			clickByXpath("//a[@title='T-shirts']");
			return new TshirtPage();
			
		}
	


}
