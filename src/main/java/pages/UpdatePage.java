package pages;

import wrappers.GenericWrappers;

public class UpdatePage extends  GenericWrappers{
	
	public AuditPage ClickUpdate() {
		getElementByXpath("//a[@title='Update']").click();
		return new AuditPage();
	}

}
