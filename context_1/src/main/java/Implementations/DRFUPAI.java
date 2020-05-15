package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DRFUPAI {
	
	public void configure(WebDriver driver) throws Exception  {
		// step-54.1(select handler in the left panel)
				driver.findElement(By.name("Handlers")).click();

				// step-55(Click on Add tab and select handler option)
				driver.findElement(By.id("Item 3")).click();
				driver.findElement(By.id("Item 32806")).click();

				// step-56(Click on the class drop down )
				driver.findElement(By.id("DropDown")).click();

				// step-57(Select UPAI handler from the drop down)
				driver.findElement(By.name("DRFUPAI - Dynamic records and fields UPA Input")).click();

				// step-58(Click on the Add button)
				driver.findElement(By.id("1")).click();

				// step-59 is reputation of step 57

				// step-60(Click on the Add button) which is reputation of 58 but we have to
				// check condtions)

				// step-61(Enter or select all the below details for configuration of the
				// Handler in Handler configuration page.)
				driver.findElement(By.id("10000")).sendKeys("QA_DESTINATION");
				driver.findElement(By.id("10001")).sendKeys("14004");
				driver.findElement(By.id("10007")).click();

				// step-62(For field dictionary , Click on browse button and navigate to the
				// C:\Program Files\Refinitiv\Contributions
				// Real-Time\marketdata\contributions_data_dictionary)
				driver.findElement(By.id("10041")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("contributions_data_dictionary")).click();
				Thread.sleep(2000);
				driver.findElement(By.name("Open")).click();
				Thread.sleep(1000);

				// step-63(For field Enumeration dictionary , Click on browse button and
				// navigate to the C:\Program Files\Refinitiv\Contributions
				// Real-Time\marketdata\enumtype.def)
				driver.findElement(By.id("10042")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("enumtype.def")).click();
				Thread.sleep(1000);
				driver.findElement(By.name("Open")).click();
				Thread.sleep(1000);

				// step-64(Click on the OK button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(1000);

				// step 64.1(Click on configuration option in the top)
				driver.findElement(By.id("Item 4")).click();
				Thread.sleep(1000);
				// step-65(Click on the validate configuration option in tool bar)
				driver.findElement(By.id("Item 32815")).click();
				Thread.sleep(1000);

				// step-66(Click on close optiomn in validation window)
				driver.findElement(By.id("Close")).click();
				Thread.sleep(1000);

				// step-67(Select recordset in DRFUPAI handler and Click on Add tab)
				driver.findElement(By.name("Record sets")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("Item 3")).click();
				Thread.sleep(1000);
				// step-68(In Add tab click on Record set option)
				driver.findElement(By.id("Item 32818")).click();
				Thread.sleep(1000);

				// step-69(Select radio button " Static records" and clock on "Add" button in
				// "Contribution Real-Time Configuration - Add Record Set )
				driver.findElement(By.id("1098")).sendKeys("Record set");
				Thread.sleep(1000);
				driver.findElement(By.id("1094")).click();

				// step-70(Click on OK button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("1")).click();
				Thread.sleep(1000);

				// step-71(Click on Record tab or ADD tab in tool bar)
				driver.findElement(By.name("Records")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("Item 3")).click();
				Thread.sleep(1000);

				// step-72(Click on the Add record)
				driver.findElement(By.id("Item 32839")).click();
				Thread.sleep(1000);

				// step-73(Enter record name for example "REC1" and click on arrow)
				driver.findElement(By.id("1155")).sendKeys("REC1");
				Thread.sleep(1000);
				driver.findElement(By.id("1256")).click();
				Thread.sleep(1000);

				// step-74(Click on Add Record button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(1000);

				// step-75(Click on Field tab in tool bar)
				driver.findElement(By.name("Fields")).click();
				Thread.sleep(1000);

				// step-75.1(click on add tab)
				driver.findElement(By.id("Item 3")).click();
				Thread.sleep(1000);

				// step-76(Click on standard field option in tool bar)
				driver.findElement(By.id("Item 32840")).click();
				Thread.sleep(1000);

				// step-77(Enter field name as ASK and click on the Add field Arrow button)
				driver.findElement(By.id("1049")).sendKeys("ASK");
				Thread.sleep(1000);
				driver.findElement(By.id("1175")).click();
				Thread.sleep(1000);

				// step-78(Enter field name as BID and click on the Add field Arrow button)
				driver.findElement(By.id("1049")).sendKeys("BID");
				Thread.sleep(1000);
				driver.findElement(By.id("1175")).click();
				Thread.sleep(1000);

				// step-79(Click on the Add button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(1000);

				// step-79.1(Click on configuration option in the top)
				driver.findElement(By.id("Item 4")).click();
				Thread.sleep(1000);

				// step-80(Click on the validate configuration option in tool bar)
				driver.findElement(By.id("Item 32815")).click();
				Thread.sleep(1000);

				// step-81(Click on close option in the validation screen)
				driver.findElement(By.id("Close")).click();
				Thread.sleep(1000);

				// step-81.1((Click on configuration option in the top)
				driver.findElement(By.id("Item 4")).click();
				Thread.sleep(1000);

				// step-82(In tool bar click on Apply configuration)
				driver.findElement(By.id("Item 32816")).click();
				Thread.sleep(1000);

				// step-83(Click on ok button)
				driver.findElement(By.id("1061")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("1")).click();

		
	}

}
