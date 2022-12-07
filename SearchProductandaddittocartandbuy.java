package Pages;

public class SearchProductandaddittocartandbuy 
{
	public String searchicon="search-desktop";
	//Search icon is identified on Home page by using id attribute.
	//public String dogfirstproduct="//a[@href='https://www.wiggles.in/products/everydawg™-dry-food-for-mother-and-starter-pup']";
	//In above lines of code we have search very first product on search result page 
	public String firstproduct= "//div[contains(@class,'st-btn-product')]";
	
	//User added product. Clicked on "Add to Cart" button on search result page.
	public String checkut = "//div[contains(@class,'cart-actions')]";
	//Checkout button is identified by using class name attribute
	public String emailid = "email";
	//In above lines of code , email id web element is identified using id attribute.
	
}


/////html/body/div[3]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[1]/div/div/div[7]/div
///html/body/div[15]/form/div[3]/div/div[3]
///html/body/div[15]/form/div[3]/div/div[3]/button