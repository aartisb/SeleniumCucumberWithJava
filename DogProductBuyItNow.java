package Pages;

public class DogProductBuyItNow
{
	public String menulink = "Details-menu-drawer-container";
	//On Home page on left hand side menu symbol as three lines are display. Above is the xpath as id locator is used for finding web element.
	public String dogsubmenulink ="heading_tab1";
	//Dog sub menu link web element path . Here we have used id as a locator for finding web element on webpage.
	public String dogprdctcategory1 = "//a[@href='/collections/dog-food-treats']";
	//Above is Food Category of Dog product. Here we are choosing "Food & Treats" product type and finding out web element using href tag(this will be used in xpath)
	public String product = "prorep1";
	//Above is click on product displayed on screen.Here we are locating web element by using id locator.
	public String buyitnowbtn = "/html/body/main/section[1]/section/div[2]/div/div/div[2]/div/div[1]/div[9]/product-form/form/div[1]/div/div";
	//On Product details page. We have "Buy it Now" button. We are finding web element by using full xpath of button.
	
	public String addbth = "/html/body/main/section[1]/section/div[2]/div/div/div[2]/div/div[1]/div[8]/quantity-input/button[2]";
	//Above is xpath of plus icon that displayed on product details page. By clicking on it will increase quantity of product.


}




