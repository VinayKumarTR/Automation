package com.Application.myApplication;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects extends BasePage {
	@FindBy(xpath="//*[@class='sf-with-ul' and @title='Women']")
	WebElement Women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement Dresses;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[3]/a")
	WebElement TShirts;
	
	@FindBy(xpath="//*[@id='newsletter-input']")
	WebElement NewsLetter;
	
	@FindBy(xpath="//*[@id='newsletter_block_left']/div/form/div/button")
	WebElement NewsLetterButton;
	
	@FindBy(xpath="//*[@id='columns']/p")
	WebElement Subscription;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
	WebElement Select_Dresses;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[1]/label/a")
	WebElement S_Size;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[2]/label/a")
	WebElement M_Size;
	
	@FindBy(xpath="//*[@id='ul_layered_id_attribute_group_1']/li[3]/label/a")
	WebElement L_Size;
	
//	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img")
//	WebElement OrangeDress;
	
	@FindBy(xpath="//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
	WebElement AddToCart;
	
//	@FindBy(xpath="//*[@id='product']/div/div/div[2]/p[7]/button[1]")
//	WebElement Tweet;
//	
//	@FindBy(xpath="//*[@id='product']/div/div/div[2]/p[7]/button[2]")
//	WebElement Share;
//	
//	@FindBy(xpath="//*[@id='add_to_cart']/button/span")
//	WebElement AddToCart;
	
	public HomePageObjects(){
	
	  	PageFactory.initElements(driver, this);
	}
	
	public WebElement WomenfromSite(){
		return Women;
	}
	
	public WebElement DressesfromSite(){
		return Dresses;
	}
	
	public WebElement TShirtsfromSite(){
		return TShirts;
	}
	
	public WebElement DataInNewsLetter(){
		return NewsLetter;
	}
	
	public WebElement NewsLetterClick(){
		return NewsLetterButton;
	}
	
	public WebElement SubscriptionMessage(){
		return Subscription;
	}
	
	public WebElement selectionofdresses(){
		return Select_Dresses;
	}
	
	public WebElement SelectSizeS(){
		return S_Size;
	}
	
	public WebElement SelectSizeM(){
		return M_Size;
	}
	public WebElement SelectSizeL(){
		return L_Size;
	}
//	public WebElement SelectionOfOrangeDress1(){
//		return OrangeDress;
//	}
	
//	public WebElement Tweeting(){
//		return Tweet;
//	}
	
//	public WebElement Sharing(){
//		return Share;
//	}
	
	public WebElement AddingToCart(){
		return AddToCart;
	}

}
