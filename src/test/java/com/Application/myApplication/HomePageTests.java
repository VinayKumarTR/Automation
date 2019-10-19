package com.Application.myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests {
	HomePageObjects HP;
	BasePage BP;
	
	public HomePageTests(){
		HP=new HomePageObjects();
		BP=new BasePage();
	}
		
		@Test(priority=1)
		public void verifyAllText(){
			Assert.assertTrue(HP.WomenfromSite().isDisplayed());
			Assert.assertTrue(HP.DressesfromSite().isDisplayed());
			Assert.assertTrue(HP.TShirtsfromSite().isDisplayed());
		}
//		@Test(priority=2)
//		public void verifyDressesText(){
//			Assert.assertTrue(HP.DressesfromSite().isDisplayed());
//		}
//		@Test(priority=3)
//		public void verifyTShirtText(){
//			Assert.assertTrue(HP.TShirtsfromSite().isDisplayed());
//		}
		
		@Test(priority=2)
		public void VerifyNewsLetterData(){
			HP.DataInNewsLetter().sendKeys("vinayTR@gmail.com");
		}
		
		@Test(priority=3)
		public void verifyNewsLetterButton(){
			HP.NewsLetterClick().click();
		}
		
		@Test(priority=4)
		public void VerifySubscription(){
			HP.SubscriptionMessage().isDisplayed();
		}
		
		@Test(priority=5)
		public void verifyselectionofdresses(){
			HP.selectionofdresses().click();
		}
		
		@Test(priority=6)
		public void verifyingSize(){
			HP.SelectSizeS().isDisplayed();
			HP.SelectSizeM().isDisplayed();
			HP.SelectSizeL().isDisplayed();
		}

//		@Test(priority=7)
//		public void verifyOrangeDress(){
//			HP.SelectionOfOrangeDress1().click();
//		}	
//		
//		@Test(priority=7)
//		public void verifyTwitter(){
//			Assert.assertTrue(HP.Tweeting().isDisplayed());
//		}
//		@Test(priority=8)
//		public void verifyShare(){
//			Assert.assertTrue(HP.Sharing().isDisplayed());	
//		}
		
		@Test(priority=9)
		public void verifyAddingToCart(){
			HP.AddingToCart().click();
		}
}
