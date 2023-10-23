package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Jenkins_Web_Page extends Base_page implements Jenkins_Web_Page1{

	public Jenkins_Web_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
private By text_affiche1 = By.xpath("/html/body/main/div/h1");
private By text_affiche2 = By.xpath("/html/body/main/div/p");


	
@Override
public void verification_affichage_text1()
{
	
	
	
	String text1 = base_page_driver.findElement(text_affiche1).getText();
	
	
	Assert.assertEquals(text1, "I have successfuly built a sprint boot application using Maven");
	
	
	
}

@Override
public void verification_affichage_texte2()
{
	String text2 = base_page_driver.findElement(text_affiche2).getText();
	Assert.assertEquals(text2, "This application is deployed on to Kubernetes using Argo CD");
	
	
}

}
