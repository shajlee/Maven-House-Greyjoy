package house_greyjoy_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.BalonGreyjoy();
		Methods_Classes_Url_Title_Validations.TheonGreyjoy();
		
		Methods_Classes_Url_Title_Validations HouseGreyjoy = new Methods_Classes_Url_Title_Validations();
		HouseGreyjoy.AshaGreyjoy();
		HouseGreyjoy.EuronGreyjoy();
		
		Methods_Classes_Url_Title_Validations HouseGreyjoy1 = new Methods_Classes_Url_Title_Validations();
		HouseGreyjoy1.QuellonGreyjoy();
	
		
			
	}
	public static void BalonGreyjoy() {
		System.out.println("Leech of the Iron Islands");
	}
	public static void TheonGreyjoy() {
		System.out.println("Prince of Fools");
	}
	public static void AshaGreyjoy() {
		System.out.println("The Kraken's Daughter");
	}
	public static void EuronGreyjoy() {
		System.out.println("Lord Reaper of Pyke");
	}
	public static void QuellonGreyjoy() {
		System.out.println("Wise Reaper");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Greyjoy");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Greyjoy";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Greyjoy - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
		
	
		

	}


