package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.winium.WiniumDriver;

public class Upai {
	
	

	public void configure(WiniumDriver driver) throws Exception {

		//Step2(Click on Create new Configuration)
	driver.findElement(By.id("1040")).click();		
		//driver.findElement(By.name("configuration")).click();
				//step-3(Click on  Add tab and select handler option)
				driver.findElement(By.name("Add")).click();
			    driver.findElement(By.name("Handler...")).click();
			

				/*
				 * boolean ispresent=true;
				 * softas.assertTrue(ispresent,"handler option opended");
				 * 
				 * logExtentStatus(extentLogger, ispresent,issueSummary);
				 */
				
				//Step-4(Click on the class drop down )
				driver.findElement(By.name("Drop Down Button")).click();
				Thread.sleep(3000);
				
				//step-5(Select UPAI handler from the drop down)
				driver.findElement(By.name("UPAI - UPA Input (OMM Implementation)")).click();
				Thread.sleep(2000);
				
				//step- 6(Click on the Add button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(2000);
				
				//inputMode41010101
				new Upai().inputMode41010101(driver);
				Thread.sleep(2000);
				
				
				
				//inputMode41010103
				new Upai().inputMode41010103(driver);
				Thread.sleep(2000);
				
				//Step-7(Enter or select all the below details for  configuration of the Handler in Handler configuration  page)
				
				//inputMode41020101
				new Upai().inputMode41020101(driver);
				Thread.sleep(2000);
				
				
				driver.findElement(By.id("9008")).click();
				
				//driver.findElement(By.id("9009")).sendKeys("QA_TESTING");
				Thread.sleep(1000);
				
				
				
				//inputMode41020103 
				new Upai().inputMode41020103(driver);
				Thread.sleep(2000);
				
				
				
				
				//inputMode41020104 
				new Upai().inputMode41020104(driver);
				Thread.sleep(2000);
				
				//step10.1(Click on the configuration button)
				driver.findElement(By.id("Item 4")).click();
				Thread.sleep(1000);
				
				//step-11(Click on the validate configuration option in tool bar)
				driver.findElement(By.id("Item 32815")).click();
				driver.findElement(By.id("Close")).click();
				
				//step-12(Select recordset in UPAI handler and Click on Add tab)
				driver.findElement(By.name("Record sets")).click();
				driver.findElement(By.id("Item 3")).click();
				
				
				//step-13(select record set option)
				driver.findElement(By.id("Item 32818")).click();
				
				//step-14(Select radio button " Static records" and clock on "Add" button in "Contribution Real-Time Configuration - Add Record Set)
				driver.findElement(By.id("1094")).click();
				driver.findElement(By.id("1")).click();
				
				//step-15(Click on OK button)
				driver.findElement(By.id("1")).click();
				
				//step-16(Click on Record tab or ADD tab in tool bar)
				driver.findElement(By.name("Records")).click();
				
				//step-17(Click on the Add record)
				driver.findElement(By.id("Item 3")).click();
				
				//step-18(Enter record name  for example "REC1" and click on arrow)
				driver.findElement(By.id("Item 32839")).click();
				driver.findElement(By.id("1155")).sendKeys("REC1");
				driver.findElement(By.id("1256")).click();
				
				//step-19(Click on Add Record button)
				driver.findElement(By.id("1")).click();
				
				//step-20(Click on Field tab in tool bar)
				driver.findElement(By.name("Fields")).click();
				
				//step-21(Click on standard field option in tool bar)
				driver.findElement(By.id("Item 3")).click();
				driver.findElement(By.id("Item 32840")).click();
				
				
				//step-22(Enter field name as ASK and click on the Add field Arrow button)
				driver.findElement(By.id("1049")).sendKeys("ASK");
				driver.findElement(By.id("1175")).click();
				
				
				
				//step-23(Enter field name as BID and click on the Add field Arrow button)
				driver.findElement(By.id("1049")).sendKeys("BID");
				driver.findElement(By.id("1175")).click();
				
				
				//step-24(Click on the Add button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(3000);

	}
	public void inputMode41020101(WebDriver driver) {
		driver.findElement(By.id("9008")).click();
		boolean mode = driver.findElement(By.id("9029")).isDisplayed()&&
				driver.findElement(By.id("9055")).isDisplayed()&&
				driver.findElement(By.id("9056")).isDisplayed()&&
				driver.findElement(By.id("9057")).isDisplayed();
		if(mode == true) {
			 System.out.println("RSSL provider is present");
			} else {
			 System.out.println("RSSL consumer is present");
			}
		
	}
	
	public void inputMode41010101(WebDriver driver) {
		driver.findElement(By.id("9004")).click();
		boolean mode = driver.findElement(By.id("9029")).isDisplayed()&&
		 		driver.findElement(By.id("9055")).isDisplayed()&&
				driver.findElement(By.id("9056")).isDisplayed()&&
				driver.findElement(By.id("9057")).isDisplayed();
		if(mode == true) {
			 System.out.println("RSSL provider is present");
			} else {
			 System.out.println("RSSL consumer is present");
			}
		
	}
	public void inputMode41020105(WebDriver driver) throws Exception {
		driver.findElement(By.id("9033")).sendKeys("14003");
		Thread.sleep(1000);
		
		driver.findElement(By.id("9030")).click();
		Thread.sleep(1000);
		
		//step-8(For field dictionary , Click on browse button and navigate to the C:\Program Files\Refinitiv\Contributions Real-Time\marketdata\contributions_data_dictionary)
		driver.findElement(By.id("9027")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("contributions_data_dictionary")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Open")).click();
		Thread.sleep(1000);
		
		//step-9(For field Enumeration dictionary , Click on browse button and navigate to the C:\Program Files\Refinitiv\Contributions Real-Time\marketdata\enumtype.def)
		driver.findElement(By.id("9035")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("enumtype.def")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Open")).click();
		Thread.sleep(1000);
		
		String location1 = driver.findElement(By.id("9037")).getAttribute("Text");
				String location2 = driver.findElement(By.id("9040")).getAttribute("Text");
				if(location1!="" && location2!="")
				{
					System.out.println("Configure database is completed");
				}else {
					System.out.println("values are not selected");
				}
		
	
		//System.out.println("Configure database is completed");	
	}
	
	public void inputMode41010103(WebDriver driver) throws Exception {
		driver.findElement(By.id("9011")).sendKeys("-30");
		driver.findElement(By.id("1")).click();
		Thread.sleep(1000);
		if(driver.findElement(By.id("2")).isDisplayed()) {
			System.out.println("input is negative and error shown");
			driver.findElement(By.id("2")).click();
		}
	}
		
		public void inputMode41020103(WebDriver driver) throws Exception {
			driver.findElement(By.id("9011")).sendKeys("-30");
			driver.findElement(By.id("1")).click();
			Thread.sleep(1000);
			if(driver.findElement(By.id("2")).isDisplayed()) {
				System.out.println("input is negative and error shown");
				driver.findElement(By.id("2")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("9011")).sendKeys("30");
				Thread.sleep(1000);
			}
		}
		public void inputMode41020104(WebDriver driver) throws Exception {
			driver.findElement(By.id("9016")).sendKeys("pbd");
			Thread.sleep(1000);
			driver.findElement(By.id("9019")).sendKeys("123");
			Thread.sleep(1000);
			//step-10(Click on the ok button)
			driver.findElement(By.id("1")).click();
			Thread.sleep(1000);
			System.out.println("user name and password are valid");
			
	}

	public void trcoHandler(WebDriver driver) throws InterruptedException {
		
		
		//Click on the handler in the dropdown and  ADD option in tool bar and select handler
		driver.findElement(By.name("Handlers")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Item 3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("Item 32806")).click();
		Thread.sleep(1000);
		
		//Click on the handler drop down and select TRCO
		driver.findElement(By.id("1055")).click();
		//Select TRCO handler from the drop down
		driver.findElement(By.name("TRCO - Refinitiv Contribution Output")).click();
		//Click on the Add button
		driver.findElement(By.id("1")).click();
		Thread.sleep(1000);
		//"Enter the below details in the TRCO configuration window
		//Session Configuration:
		//	>Host Name - 127.0.0.1
		//	>CSLN - UK12345
		//	>IP security Key -  pe2ehpesmceukd
		//	>CSLN(Secondary)  - UK12345
		//	>>IP security Key (Secondary) -  pe2ehpesmceukd
		driver.findElement(By.id("4041")).sendKeys("127.0.0.1");
		Thread.sleep(500);
		driver.findElement(By.id("4009")).sendKeys("UK12345");
		Thread.sleep(500);
		driver.findElement(By.id("4010")).sendKeys("pe2ehpesmceukd");
		Thread.sleep(500);
		driver.findElement(By.id("4011")).sendKeys("UK12345");
		Thread.sleep(500);
		driver.findElement(By.id("4012")).sendKeys("pe2ehpesmceukd");
		Thread.sleep(500);
		
		//Click on OK button
		driver.findElement(By.id("1")).click();
		Thread.sleep(500);
		//Click and select TRCO handler in the left panel
		driver.findElement(By.name("TRCO")).click();
		Thread.sleep(500);

		//Click on ADD tab in tool bar and select Record set option 
		driver.findElement(By.id("Item 3")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Item 32818")).click();
		Thread.sleep(500);
		driver.findElement(By.id("1094")).click();
		Thread.sleep(500);
		
		//Select radio button " Static records" and click on "Add" button in "Contribution Real-Time Configuration - Add Record Set 
		driver.findElement(By.id("1")).click();
		Thread.sleep(500);
		
		//Click on OK button
		driver.findElement(By.id("1")).click();
		Thread.sleep(500);
		
		//In right panel , Click on Source tab and then click on Add source option
		driver.findElement(By.name("Sources")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Item 3")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Item 32838")).click();
		Thread.sleep(500);
		
		//"Select the source handler as UPAI (example) with below details and click on Add button
		//>Source recordset as Recordset ()
		//>Name will be auto displayed as  - SRC_UPAI_Record set"
		driver.findElement(By.id("1152")).click();
		Thread.sleep(500);
		driver.findElement(By.name("UPAI")).click();
		Thread.sleep(500);
		driver.findElement(By.id("1154")).click();
		Thread.sleep(500);
		driver.findElement(By.name("Record set")).click();
		driver.findElement(By.id("1148")).sendKeys("SRC_UPAI_Record set");
		Thread.sleep(500);
		driver.findElement(By.id("1")).click();
		Thread.sleep(500);
		
		//Click on the recordset in TRCO handler and then click on Add tab in tool
		driver.findElement(By.name("Record set")).click();
		Thread.sleep(500);
		driver.findElement(By.id("Item 3")).click();
		Thread.sleep(500);
		
		
		//Click on the wizards
		driver.findElement(By.id("Item 32830")).click();
		
		//Select >Copy records from source recordset , click on Next button
		driver.findElement(By.name("Copy records from source record set")).click();
		driver.findElement(By.id("12324")).click();
		
		//Select SRC_UPAI_Record set from the drop down and click on finish button
		driver.findElement(By.id("1105")).click();
		Thread.sleep(500);
		driver.findElement(By.name("SRC_UPAI_Record set")).click();
		driver.findElement(By.id("12325")).click();
		
		//Click on OK button
		driver.findElement(By.id("2")).click();

		
		
		
		
		}
	
}