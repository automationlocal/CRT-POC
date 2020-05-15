   package Implementations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Tropo {

	public void configure(WebDriver driver) throws Exception  {
		// step-25(Click on the ADD option in tol bar and select handler)
				driver.findElement(By.name("Record set")).click();
				driver.findElement(By.id("Item 3")).click();
				driver.findElement(By.id("Item 32806")).click();

				// step-26(Click on the handler drop down and select TROPO)
				driver.findElement(By.id("DropDown")).click();

				// step-27(Select TROPO handler from the drop down)
				driver.findElement(By.name("TROPO - Refinitiv OMM Post Output")).click();

				// step-28(Click on the Add button)
				driver.findElement(By.id("1")).click();

				// step-29(Enter the below details in the TROPO configuration window)
				driver.findElement(By.id("11018")).sendKeys("QA_DESTINATION");
				driver.findElement(By.id("11019")).sendKeys("127.0.0.1");
				driver.findElement(By.id("11020")).sendKeys("14004");
				driver.findElement(By.id("11021")).sendKeys("127.0.0.1");
				driver.findElement(By.id("11022")).sendKeys("14004");
				driver.findElement(By.id("11023")).sendKeys("pbd");
				driver.findElement(By.id("11024")).sendKeys("123");
				driver.findElement(By.id("11045")).click();
				String val = driver.findElement(By.id("11031")).getText();
				// convert val to integer
				int value = Integer.parseInt(val); // val string value

				if (value <= 100000) {
					String flightmsg = driver.findElement(By.id("11033")).getText();
					// covert fightmsg to int
					int flightmsgVal = Integer.parseInt(flightmsg);
					if (flightmsgVal <= 5000) {

						// step-28(Click on OK button)
						driver.findElement(By.id("1")).click();
						System.out.println("values are valid");
					} else {
						System.out.println("values are invalid.");
					}

				}

				// step-31(Click and select TROPO handler in the left pannel)
				driver.findElement(By.name("TROPO")).click();

				// step-32(Click on ADD tab in tool bar and select Record set option )
				driver.findElement(By.id("Item 3")).click();
				driver.findElement(By.id("Item 32818")).click();

				// Step-33(select radio button " Static records" and click on "Add" button in
				// "Contribution Real-Time Configuration - Add Record Set)
				driver.findElement(By.id("1094")).click();
				driver.findElement(By.id("1")).click();

				// step-34(Click on OK button)
				driver.findElement(By.id("1")).click();

				// step-35(In right pannel , Click on Source tab and then click on Add source
				// option)
				driver.findElement(By.name("Sources")).click();

				// step-36(Select the source handler as UPAI (example) with below details and
				// click on Add button)
				driver.findElement(By.id("Item 3")).click();
				driver.findElement(By.id("Item 32838")).click();
				driver.findElement(By.id("DropDown")).click();
				driver.findElement(By.name("UPAI")).click();
				driver.findElement(By.id("1154")).click(); // need to update once issue resolved
				driver.findElement(By.id("1154")).click();
				driver.findElement(By.name("Record set")).click();
				driver.findElement(By.id("1148")).sendKeys("SRC_UPAI_Record set");

				// step-37(Click on the recordset in TROPO handler and then click on Add tab in
				// tool)
				driver.findElement(By.id("1")).click();
				driver.findElement(By.name("Record set")).click();

				// boolean ele = driver.findElement(By.id("Item 32806")).isDisplayed();

				// if(ele = true) {
				// System.out.println("handler is present");
				// } else {
				// System.out.println("handler is missing.");
				// }
				//
				// boolean record = driver.findElement(By.id("Item 32818")).isDisplayed();

				// if(record = true) {
				// System.out.println("record is present");
				// } else {
				// System.out.println("record is missing.");
				// }
				// driver.findElement(By.id("Item 32838")).isDisplayed();
				// driver.findElement(By.id("Item 32830")).isDisplayed();

				// step-38(Click on the wizards)
				driver.findElement(By.id("Item 3")).click();
				driver.findElement(By.id("Item 32830")).click();
				// driver.findElement(By.name("Copy fields from source record
				// set")).isDisplayed();
				// driver.findElement(By.name("Copy records from source record
				// set")).isDisplayed();
				// driver.findElement(By.name("Remove records")).isDisplayed();
				// driver.findElement(By.id("12324")).isDisplayed();
				// driver.findElement(By.id("2")).isDisplayed();

				// step-39(Select Copy records from source recordset and click on Next button)
				driver.findElement(By.name("Copy records from source record set")).click();
				driver.findElement(By.id("12324")).click();

				// step-40(Select SRC_UPAI_Record set from the drop down and click on finsh
				// button)
				driver.findElement(By.id("DropDown")).click();
				driver.findElement(By.name("SRC_UPAI_Record set")).click();
				driver.findElement(By.id("12325")).click();

				// step-41(Click on OK button)
				driver.findElement(By.id("2")).click();

				// step-42(Click on the Records tab in right pannel)
				driver.findElement(By.name("Records")).click();

				// step-43(Click on the recordset in TROPO handler and then click on Add tab in
				// tool)
				driver.findElement(By.name("Record set")).click();
				driver.findElement(By.id("Item 3")).click();

				// step-44(Click on the wizards)
				driver.findElement(By.id("Item 32830")).click();

				// step-45(Select >Copy fields from source recordset , click on Next button)
				driver.findElement(By.name("Copy fields from source record set")).click();
				driver.findElement(By.id("12324")).click();

				// step-46(Click on finish button)
				driver.findElement(By.id("DropDown")).click();
				driver.findElement(By.name("SRC_UPAI_Record set")).click();
				driver.findElement(By.id("12325")).click();
				driver.findElement(By.id("2")).click();

				// step-47(Navigate to Field tab click on the right pannel)
				driver.findElement(By.name("Fields")).click();

				// step-47.1(Click on configuration option in the top)
				driver.findElement(By.id("Item 4")).click();

				// step-48(Click on the validate configuration option in tool bar)
				driver.findElement(By.id("Item 32815")).click();

				// step-49(Click on close option of the validation screen window)
				driver.findElement(By.id("Close")).click();

				// step-49.1(Click on configuration option in the top)
				driver.findElement(By.id("Item 4")).click();

				// step-50(Click on the send configuration arrow in tool bar)
				// availablity options has to be update
				driver.findElement(By.id("Item 32844")).click();

				// step-51(in Contribution Real-Tim Configuration - Send Configuration window)
				driver.findElement(By.id("1011")).sendKeys("127.0.0.1");

				// step-52(Enter user name as Admin ( as example))
				driver.findElement(By.id("1026")).sendKeys("admin");

				// step-53(Enter Password - password ( as example))
				driver.findElement(By.id("1028")).sendKeys("password");

				// step-54(Click on the ok button)
				driver.findElement(By.id("1")).click();
				Thread.sleep(2000);



	}

}
