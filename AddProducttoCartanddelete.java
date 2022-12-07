package Pages;

public class AddProducttoCartanddelete 
{
	public String mainmulink = "Details-menu-drawer-container";
	//Clicking on menu link displayed on left hand side on home page.
	public String catmenulink = "heading_tab2";
	//Clicking on Cat sub menu link after expanding main menu link.
	public String healthwellnesslinkproduct = "//a[@href='/collections/health-wellness-cat']";
	
	
	//Clicking on "Shop All" link displayed under Cat products.
	public String product1 = "prorep1";
	//Very first product displayed on screen is identify by id attribute.
	public String buyitnowbtn = "/html/body/main/section[1]/section/div[2]/div/div/div[2]/div/div[1]/div[9]/product-form/form/div[1]/div/div/div/div/div/button[1]";
	//Buy it now button web page is identify by xpath.
	public String returntocart = "//a[@href='https://www.wiggles.in/cart']";
	
	//Above is "Return to Cart" link on checkout page.Above is href attribute value.
	public String deleteicon = "Remove-1";
	//Above is delete icon displayed on Cart page.Delete button is on the Overview of cart page.This is identified by id element.
	public String contntocart = "//a[@href='/collections/all']";
	//On Cart page after deleting product added into basket "Continue Shopping" button appears. This is identified by using href attribute.
   
}
