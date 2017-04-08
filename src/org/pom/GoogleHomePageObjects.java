package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePageObjects {
	
	//Initialize the objects in the page
	public GoogleHomePageObjects(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gs_htif0")
	public WebElement txtSearch;
	
	@FindBy(name = "btnG")
	public WebElement btnSearch;

}
