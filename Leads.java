package vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Leads {

	
	public static void main(String[] args)
{
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		driver.findElement(By.id("appnavigator")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//span[text()=' Leads']")).click();

		driver.findElement(By.id("Leads_listView_basicAction_LBL_ADD_RECORD")).click();
		driver.findElement(By.id("s2id_autogen1")).click();
		WebElement ele1 = driver.findElement(By.id("s2id_autogen2_search"));
		ele1.sendKeys("Ms.");
		ele1.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Leads_editView_fieldName_firstname")).sendKeys("Asha");
		driver.findElement(By.id("Leads_editView_fieldName_lastname")).sendKeys("Kodape");
		driver.findElement(By.id("Leads_editView_fieldName_phone")).sendKeys("420255");
		driver.findElement(By.id("Leads_editView_fieldName_company")).sendKeys("Asha Ecommerce company");
		driver.findElement(By.id("Leads_editView_fieldName_mobile")).sendKeys("9970738898");
		driver.findElement(By.id("Leads_editView_fieldName_designation")).sendKeys("CEO");
		driver.findElement(By.id("Leads_editView_fieldName_fax")).sendKeys("45586523");

		driver.findElement(By.id("select2-chosen-4")).click();
		WebElement ele2 = driver.findElement(By.id("s2id_autogen4_search"));
		ele2.click();
		ele2.sendKeys("Partner");
		ele2.sendKeys(Keys.ENTER);

		driver.findElement(By.id("Leads_editView_fieldName_email")).sendKeys("asha@gmail.com");
		driver.findElement(By.id("select2-chosen-6")).click();
		
		WebElement ele3 = driver.findElement(By.id("s2id_autogen6_search"));
		ele3.sendKeys("Food & Beverage");
		ele3.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("Leads_editView_fieldName_website")).sendKeys("www.xyzs.com");
		driver.findElement(By.id("Leads_editView_fieldName_annualrevenue")).sendKeys("60000");
		driver.findElement(By.id("select2-chosen-8")).click();
		
		
		WebElement ele4 = driver.findElement(By.id("s2id_autogen8_search"));
		ele4.sendKeys("Cold");
		ele4.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("Leads_editView_fieldName_noofemployees")).sendKeys("20");
		driver.findElement(By.id("select2-chosen-10")).click();
		
		
		WebElement ele5  = driver.findElement(By.id("s2id_autogen10_search"));
		ele5.sendKeys("Active");
		ele5.sendKeys(Keys.ENTER);
		driver.findElement(By.id("Leads_editView_fieldName_secondaryemail")).sendKeys("sonirathod2000@gmail.com");

		driver.findElement(By.id("select2-chosen-12")).click();
		WebElement ele6  = driver.findElement(By.id("s2id_autogen12_search"));
		ele6.sendKeys("Marketing Group");
		ele6.sendKeys(Keys.ENTER);

		driver.findElement(By.id("Leads_editView_fieldName_emailoptout")).click();
		driver.findElement(By.xpath("//textarea[@id='Leads_editView_fieldName_lane']")).sendKeys("Ambika nagar");

		driver.findElement(By.id("Leads_editView_fieldName_pobox")).sendKeys("Karvenagar");
		driver.findElement(By.id("Leads_editView_fieldName_code")).sendKeys("411057");

		driver.findElement(By.id("Leads_editView_fieldName_city")).sendKeys("Pune");
		driver.findElement(By.id("Leads_editView_fieldName_country")).sendKeys("India");
		driver.findElement(By.id("Leads_editView_fieldName_state")).sendKeys("Maharashtra");
		driver.findElement(By.id("Leads_editView_fieldName_description")).sendKeys("Leads module for mock");
		driver.findElement(By.xpath("//button[text()='Save']")).click();





		}

		}

