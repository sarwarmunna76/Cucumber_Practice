package pages;



import wrappers.GenericWrappers;


public class TshirtPage extends GenericWrappers{
	
	
	public OrderPage scrollToElement() throws InterruptedException {
		
		 mouseOverByXpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img");
		
		clickByXpath("//a[@title='Add to cart']");
		Thread.sleep(3000);
		
		String message = getTextByXpath("//a[@title='Proceed to checkout']");
		System.out.println("Verified the pop-up message as: "+message);
		if (message.equals("Product successfully added to your shopping cart")) {
			System.out.println("Message verified same as actual and expected");
		}
		else {
			System.out.println("Failed to verify the message");
		}
		clickByXpath("//a[@title='Proceed to checkout']");
		return new OrderPage();
		
	}
	
}