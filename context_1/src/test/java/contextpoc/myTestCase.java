package contextpoc;

import java.io.IOException;
import java.net.URL;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Implementations.DRFUPAI;
import Implementations.Tropo;
import Implementations.Upai;

public class myTestCase {

	protected static ExtentReports extentReports;
	protected static ExtentTest extentLogger;

	SoftAssert softas = new SoftAssert();
	WiniumDriver driver;

	@BeforeClass
	public void initializeDriver() throws Exception {
		DesktopOptions option = new DesktopOptions();

		// step1(Open Contribution Real-Time Configuration tool )
		option.setApplicationPath(
				"C:\\Program Files\\Refinitiv\\Contributions Real-Time\\bin\\ContributionsReal-TimeConfigTool.exe");
		Thread.sleep(2000);
		driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		Thread.sleep(500);
	}

	@Test(priority = 1, description = "winium")
	public void workwinium() throws InterruptedException, Exception {


		 
		// Start first tool and configure to launch second tool
// 	new Upai().configure(driver);
		
		 //Step2(Click on Create new Configuration)
driver.findElement(By.id("1040")).click();
//		 WebElement ele = driver.findElement(By.xpath("//*[@HelpText = 'New Configuration']"));
//		 System.out.println(ele.isDisplayed());
//		 System.out.println(ele);
//		 Actions act2 = new Actions(driver);
//		 act2.moveToElement(ele).click().build().perform();
//		 act2.sendKeys(Keys.CONTROL)
//		 ele.click();
		 
		  //step-3(Click on Add tab and select handler option)
		 driver.findElement(By.id("59648")).click();
		 driver.findElementByName("Add handler").click();
		 driver.findElementByName("Handler...").click();
		 /* 
		 * 
		 * 
		 * boolean ispresent=true;
		 * softas.assertTrue(ispresent,"handler option opended");
		 * 
		 * logExtentStatus(extentLogger, ispresent,issueSummary);
		 * 
		 * 
		 * //Step-4(Click on the class drop down )
		 * driver.findElement(By.name("Drop Down Button")).click(); Thread.sleep(3000);
		 * 
		 * //step-5(Select UPAI handler from the drop down)
		 * driver.findElement(By.name("UPAI - UPA Input (OMM Implementation)")).click();
		 * Thread.sleep(2000);
		 * 
		 * //step-6(Click on the Add button) driver.findElement(By.id("1")).click();
		 * Thread.sleep(2000);
		 * 
		 * //Step-7(Enter or select all the below details for configuration of the
		 * Handler in Handler configuration page)
		 * driver.findElement(By.id("9008")).click();
		 * 
		 * driver.findElement(By.id("9009")).sendKeys("QA_TESTING"); Thread.sleep(1000);
		 * driver.findElement(By.id("9011")).sendKeys("30"); Thread.sleep(1000);
		 * driver.findElement(By.id("9033")).sendKeys("14003"); Thread.sleep(1000);
		 * driver.findElement(By.id("9016")).sendKeys("pbd"); Thread.sleep(1000);
		 * driver.findElement(By.id("9019")).sendKeys("123"); Thread.sleep(1000);
		 * driver.findElement(By.id("9030")).click(); Thread.sleep(1000);
		 * 
		 * //step-8(For field dictionary , Click on browse button and navigate to the
		 * C:\Program Files\Refinitiv\Contributions
		 * Real-Time\marketdata\contributions_data_dictionary)
		 * driver.findElement(By.id("9027")).click(); Thread.sleep(1000);
		 * driver.findElement(By.name("contributions_data_dictionary")).click();
		 * Thread.sleep(1000); driver.findElement(By.name("Open")).click();
		 * Thread.sleep(1000);
		 * 
		 * //step-9(For field Enumeration dictionary , Click on browse button and
		 * navigate to the C:\Program Files\Refinitiv\Contributions
		 * Real-Time\marketdata\enumtype.def) driver.findElement(By.id("9035")).click();
		 * Thread.sleep(2000); driver.findElement(By.name("enumtype.def")).click();
		 * Thread.sleep(1000); driver.findElement(By.name("Open")).click();
		 * Thread.sleep(1000);
		 * 
		 * 
		 * //step-10(Click on the ok button) driver.findElement(By.id("1")).click();
		 * Thread.sleep(1000);
		 * 
		 * //step10.1(Click on the configuration button)
		 * driver.findElement(By.id("Item 4")).click(); Thread.sleep(1000);
		 * 
		 * //step-11(Click on the validate configuration option in tool bar)
		 * driver.findElement(By.id("Item 32815")).click();
		 * driver.findElement(By.id("Close")).click();
		 * 
		 * //step-12(Select recordset in UPAI handler and Click on Add tab)
		 * driver.findElement(By.name("Record sets")).click();
		 * driver.findElement(By.id("Item 3")).click();
		 * 
		 * 
		 * //step-13(select record set option)
		 * driver.findElement(By.id("Item 32818")).click();
		 * 
		 * //step-14(Select radio button " Static records" and clock on "Add" button in
		 * "Contribution Real-Time Configuration - Add Record Set)
		 * driver.findElement(By.id("1094")).click();
		 * driver.findElement(By.id("1")).click();
		 * 
		 * //step-15(Click on OK button) driver.findElement(By.id("1")).click();
		 * 
		 * //step-16(Click on Record tab or ADD tab in tool bar)
		 * driver.findElement(By.name("Records")).click();
		 * 
		 * //step-17(Click on the Add record)
		 * driver.findElement(By.id("Item 3")).click();
		 * 
		 * //step-18(Enter record name for example "REC1" and click on arrow)
		 * driver.findElement(By.id("Item 32839")).click();
		 * driver.findElement(By.id("1155")).sendKeys("REC1");
		 * driver.findElement(By.id("1256")).click();
		 * 
		 * //step-19(Click on Add Record button) driver.findElement(By.id("1")).click();
		 * 
		 * //step-20(Click on Field tab in tool bar)
		 * driver.findElement(By.name("Fields")).click();
		 * 
		 * //step-21(Click on standard field option in tool bar)
		 * driver.findElement(By.id("Item 3")).click();
		 * driver.findElement(By.id("Item 32840")).click();
		 * 
		 * 
		 * //step-22(Enter field name as ASK and click on the Add field Arrow button)
		 * driver.findElement(By.id("1049")).sendKeys("ASK");
		 * driver.findElement(By.id("1175")).click();
		 * 
		 * 
		 * 
		 * //step-23(Enter field name as BID and click on the Add field Arrow button)
		 * driver.findElement(By.id("1049")).sendKeys("BID");
		 * driver.findElement(By.id("1175")).click();
		 * 
		 * 
		 * //step-24(Click on the Add button) 
		 * driver.findElement(By.id("1")).click();
		 */
		new Tropo().configure(driver);    

//		// step-25(Click on the ADD option in tol bar and select handler)
//		driver.findElement(By.name("Record set")).click();   
//		driver.findElement(By.id("Item 3")).click();
//		driver.findElement(By.id("Item 32806")).click();
//
//		// step-26(Click on the handler drop down and select TROPO)
//		driver.findElement(By.id("DropDown")).click();
//
//		// step-27(Select TROPO handler from the drop down)
//		driver.findElement(By.name("TROPO - Refinitiv OMM Post Output")).click();
//
//		// step-28(Click on the Add button)
//		driver.findElement(By.id("1")).click();
//
//		// step-29(Enter the below details in the TROPO configuration window)
//		driver.findElement(By.id("11018")).sendKeys("QA_DESTINATION");
//		driver.findElement(By.id("11019")).sendKeys("127.0.0.1");
//		driver.findElement(By.id("11020")).sendKeys("14004");
//		driver.findElement(By.id("11021")).sendKeys("127.0.0.1");
//		driver.findElement(By.id("11022")).sendKeys("14004");
//		driver.findElement(By.id("11023")).sendKeys("pbd");
//		driver.findElement(By.id("11024")).sendKeys("123");
//		driver.findElement(By.id("11045")).click();
//		String val = driver.findElement(By.id("11031")).getText();
//		// convert val to integer
//		int value = Integer.parseInt(val); // val string value
//
//		if (value <= 100000) {
//			String flightmsg = driver.findElement(By.id("11033")).getText();
//			// covert fightmsg to int
//			int flightmsgVal = Integer.parseInt(flightmsg);
//			if (flightmsgVal <= 5000) {
//
//				// step-28(Click on OK button)
//				driver.findElement(By.id("1")).click();
//				System.out.println("values are valid");
//			} else {
//				System.out.println("values are invalid.");
//			}
//
//		}
//
//		// step-31(Click and select TROPO handler in the left pannel)
//		driver.findElement(By.name("TROPO")).click();
//
//		// step-32(Click on ADD tab in tool bar and select Record set option )
//		driver.findElement(By.id("Item 3")).click();
//		driver.findElement(By.id("Item 32818")).click();
//
//		// Step-33(select radio button " Static records" and click on "Add" button in
//		// "Contribution Real-Time Configuration - Add Record Set)
//		driver.findElement(By.id("1094")).click();
//		driver.findElement(By.id("1")).click();
//
//		// step-34(Click on OK button)
//		driver.findElement(By.id("1")).click();
//
//		// step-35(In right pannel , Click on Source tab and then click on Add source
//		// option)
//		driver.findElement(By.name("Sources")).click();
//
//		// step-36(Select the source handler as UPAI (example) with below details and
//		// click on Add button)
//		driver.findElement(By.id("Item 3")).click();
//		driver.findElement(By.id("Item 32838")).click();
//		driver.findElement(By.id("DropDown")).click();
//		driver.findElement(By.name("UPAI")).click();
//		driver.findElement(By.id("1154")).click(); // need to update once issue resolved
//		driver.findElement(By.id("1154")).click();
//		driver.findElement(By.name("Record set")).click();
//		driver.findElement(By.id("1148")).sendKeys("SRC_UPAI_Record set");
//
//		// step-37(Click on the recordset in TROPO handler and then click on Add tab in
//		// tool)
//		driver.findElement(By.id("1")).click();
//		driver.findElement(By.name("Record set")).click();
//
//		// boolean ele = driver.findElement(By.id("Item 32806")).isDisplayed();
//
//		// if(ele = true) {
//		// System.out.println("handler is present");
//		// } else {
//		// System.out.println("handler is missing.");
//		// }
//		//
//		// boolean record = driver.findElement(By.id("Item 32818")).isDisplayed();
//
//		// if(record = true) {
//		// System.out.println("record is present");
//		// } else {
//		// System.out.println("record is missing.");
//		// }
//		// driver.findElement(By.id("Item 32838")).isDisplayed();
//		// driver.findElement(By.id("Item 32830")).isDisplayed();
//
//		// step-38(Click on the wizards)
//		driver.findElement(By.id("Item 3")).click();
//		driver.findElement(By.id("Item 32830")).click();
//		// driver.findElement(By.name("Copy fields from source record
//		// set")).isDisplayed();
//		// driver.findElement(By.name("Copy records from source record
//		// set")).isDisplayed();
//		// driver.findElement(By.name("Remove records")).isDisplayed();
//		// driver.findElement(By.id("12324")).isDisplayed();
//		// driver.findElement(By.id("2")).isDisplayed();
//
//		// step-39(Select Copy records from source recordset and click on Next button)
//		driver.findElement(By.name("Copy records from source record set")).click();
//		driver.findElement(By.id("12324")).click();
//
//		// step-40(Select SRC_UPAI_Record set from the drop down and click on finsh
//		// button)
//		driver.findElement(By.id("DropDown")).click();
//		driver.findElement(By.name("SRC_UPAI_Record set")).click();
//		driver.findElement(By.id("12325")).click();
//
//		// step-41(Click on OK button)
//		driver.findElement(By.id("2")).click();
//
//		// step-42(Click on the Records tab in right pannel)
//		driver.findElement(By.name("Records")).click();
//
//		// step-43(Click on the recordset in TROPO handler and then click on Add tab in
//		// tool)
//		driver.findElement(By.name("Record set")).click();
//		driver.findElement(By.id("Item 3")).click();
//
//		// step-44(Click on the wizards)
//		driver.findElement(By.id("Item 32830")).click();
//
//		// step-45(Select >Copy fields from source recordset , click on Next button)
//		driver.findElement(By.name("Copy fields from source record set")).click();
//		driver.findElement(By.id("12324")).click();
//
//		// step-46(Click on finish button)
//		driver.findElement(By.id("DropDown")).click();
//		driver.findElement(By.name("SRC_UPAI_Record set")).click();
//		driver.findElement(By.id("12325")).click();
//		driver.findElement(By.id("2")).click();
//
//		// step-47(Navigate to Field tab click on the right pannel)
//		driver.findElement(By.name("Fields")).click();
//
//		// step-47.1(Click on configuration option in the top)
//		driver.findElement(By.id("Item 4")).click();
//
//		// step-48(Click on the validate configuration option in tool bar)
//		driver.findElement(By.id("Item 32815")).click();
//
//		// step-49(Click on close option of the validation screen window)
//		driver.findElement(By.id("Close")).click();
//
//		// step-49.1(Click on configuration option in the top)
//		driver.findElement(By.id("Item 4")).click();
//
//		// step-50(Click on the send configuration arrow in tool bar)
//		// availablity options has to be update
//		driver.findElement(By.id("Item 32844")).click();
//
//		// step-51(in Contribution Real-Tim Configuration - Send Configuration window)
//		driver.findElement(By.id("1011")).sendKeys("127.0.0.1");
//
//		// step-52(Enter user name as Admin ( as example))
//		driver.findElement(By.id("1026")).sendKeys("admin");
//
//		// step-53(Enter Password - password ( as example))
//		driver.findElement(By.id("1028")).sendKeys("password");
//
//		// step-54(Click on the ok button)
//		driver.findElement(By.id("1")).click();
//		Thread.sleep(2000);
		
		new DRFUPAI().configure(driver);
//
//		// step-54.1(select handler in the left panel)
//		driver.findElement(By.name("Handlers")).click();
//
		
//		// step-55(Click on Add tab and select handler option)
//		driver.findElement(By.id("Item 3")).click();
//		driver.findElement(By.id("Item 32806")).click();
//
//		// step-56(Click on the class drop down )
//		driver.findElement(By.id("DropDown")).click();
//
//		// step-57(Select UPAI handler from the drop down)
//		driver.findElement(By.name("DRFUPAI - Dynamic records and fields UPA Input")).click();
//
//		// step-58(Click on the Add button)
//		driver.findElement(By.id("1")).click();
//
//		// step-59 is reputation of step 57
//
//		// step-60(Click on the Add button) which is reputation of 58 but we have to
//		// check condtions)
//
//		// step-61(Enter or select all the below details for configuration of the
//		// Handler in Handler configuration page.)
//		driver.findElement(By.id("10000")).sendKeys("QA_DESTINATION");
//		driver.findElement(By.id("10001")).sendKeys("14004");
//		driver.findElement(By.id("10007")).click();
//
//		// step-62(For field dictionary , Click on browse button and navigate to the
//		// C:\Program Files\Refinitiv\Contributions
//		// Real-Time\marketdata\contributions_data_dictionary)
//		driver.findElement(By.id("10041")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("contributions_data_dictionary")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.name("Open")).click();
//		Thread.sleep(1000);
//
//		// step-63(For field Enumeration dictionary , Click on browse button and
//		// navigate to the C:\Program Files\Refinitiv\Contributions
//		// Real-Time\marketdata\enumtype.def)
//		driver.findElement(By.id("10042")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.name("enumtype.def")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.name("Open")).click();
//		Thread.sleep(1000);
//
//		// step-64(Click on the OK button)
//		driver.findElement(By.id("1")).click();
//		Thread.sleep(1000);
//
//		// step 64.1(Click on configuration option in the top)
//		driver.findElement(By.id("Item 4")).click();
//		Thread.sleep(1000);
//		// step-65(Click on the validate configuration option in tool bar)
//		driver.findElement(By.id("Item 32815")).click();
//		Thread.sleep(1000);
//
//		// step-66(Click on close optiomn in validation window)
//		driver.findElement(By.id("Close")).click();
//		Thread.sleep(1000);
//
//		// step-67(Select recordset in DRFUPAI handler and Click on Add tab)
//		driver.findElement(By.name("Record sets")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("Item 3")).click();
//		Thread.sleep(1000);
//		// step-68(In Add tab click on Record set option)
//		driver.findElement(By.id("Item 32818")).click();
//		Thread.sleep(1000);
//
//		// step-69(Select radio button " Static records" and clock on "Add" button in
//		// "Contribution Real-Time Configuration - Add Record Set )
//		driver.findElement(By.id("1098")).sendKeys("Record set");
//		Thread.sleep(1000);
//		driver.findElement(By.id("1094")).click();
//
//		// step-70(Click on OK button)
//		driver.findElement(By.id("1")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("1")).click();
//		Thread.sleep(1000);
//
//		// step-71(Click on Record tab or ADD tab in tool bar)
//		driver.findElement(By.name("Records")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("Item 3")).click();
//		Thread.sleep(1000);
//
//		// step-72(Click on the Add record)
//		driver.findElement(By.id("Item 32839")).click();
//		Thread.sleep(1000);
//
//		// step-73(Enter record name for example "REC1" and click on arrow)
//		driver.findElement(By.id("1155")).sendKeys("REC1");
//		Thread.sleep(1000);
//		driver.findElement(By.id("1256")).click();
//		Thread.sleep(1000);
//
//		// step-74(Click on Add Record button)
//		driver.findElement(By.id("1")).click();
//		Thread.sleep(1000);
//
//		// step-75(Click on Field tab in tool bar)
//		driver.findElement(By.name("Fields")).click();
//		Thread.sleep(1000);
//
//		// step-75.1(click on add tab)
//		driver.findElement(By.id("Item 3")).click();
//		Thread.sleep(1000);
//
//		// step-76(Click on standard field option in tool bar)
//		driver.findElement(By.id("Item 32840")).click();
//		Thread.sleep(1000);
//
//		// step-77(Enter field name as ASK and click on the Add field Arrow button)
//		driver.findElement(By.id("1049")).sendKeys("ASK");
//		Thread.sleep(1000);
//		driver.findElement(By.id("1175")).click();
//		Thread.sleep(1000);
//
//		// step-78(Enter field name as BID and click on the Add field Arrow button)
//		driver.findElement(By.id("1049")).sendKeys("BID");
//		Thread.sleep(1000);
//		driver.findElement(By.id("1175")).click();
//		Thread.sleep(1000);
//
//		// step-79(Click on the Add button)
//		driver.findElement(By.id("1")).click();
//		Thread.sleep(1000);
//
//		// step-79.1(Click on configuration option in the top)
//		driver.findElement(By.id("Item 4")).click();
//		Thread.sleep(1000);
//
//		// step-80(Click on the validate configuration option in tool bar)
//		driver.findElement(By.id("Item 32815")).click();
//		Thread.sleep(1000);
//
//		// step-81(Click on close option in the validation screen)
//		driver.findElement(By.id("Close")).click();
//		Thread.sleep(1000);
//
//		// step-81.1((Click on configuration option in the top)
//		driver.findElement(By.id("Item 4")).click();
//		Thread.sleep(1000);
//
//		// step-82(In tool bar click on Apply configuration)
//		driver.findElement(By.id("Item 32816")).click();
//		Thread.sleep(1000);
//
//		// step-83(Click on ok button)
//		driver.findElement(By.id("1061")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.id("1")).click();

		// step-84(Open Contributions Real-Time Status tool )

		DesktopOptions status = new DesktopOptions();

		status.setApplicationPath(
				"C:\\Program Files\\Refinitiv\\Contributions Real-Time\\bin\\ContributionsReal-TimeStatusTool.exe");
		Thread.sleep(3000);
		WiniumDriver driver1 = new WiniumDriver(new URL("http://localhost:9999"), status);
		Thread.sleep(5000);

		// step-85(Enter the server address as 127.0.0.1 in Contributions Real-Time
		// Status tool)
		driver1.findElement(By.id("1011")).sendKeys("127.0.0.1");

		// step-86(Enter user name as admin ( as example))
		driver1.findElement(By.id("1026")).sendKeys("admin");

		// step-87(Enter Password - password ( as example))
		driver1.findElement(By.id("1028")).sendKeys("password");

		// step-88(Click on the ok button)
		driver1.findElement(By.id("1")).click();

		// step-89(Click on Global in left panel)
		driver1.findElement(By.name("Global")).click();

		// step-89.1(double click on UPAI)
		Actions act = new Actions(driver1);
		act.moveToElement(driver1.findElement(By.name("UPAI"))).doubleClick(driver1.findElement(By.name("UPAI")))
				.build().perform();

		// step-90(Click on Record set in UPAI )
		driver1.findElement(By.name("Record set")).click();

		// step-91(Click on REC1)
		driver1.findElement(By.name("REC1")).click();

		// step-92(Click on TROPO and check TROPO status tab)
		driver1.findElement(By.name("TROPO")).click();
		driver1.findElement(By.name("TROPO Status")).click();
		String status1 = driver1.findElement(By.name("Yes")).getAttribute("Name");
		System.out.println(status1);
		// convert val to integer
		// string value = Integer.parseInt(val); //val string value

		if (status1.equalsIgnoreCase("Yes")) {

			System.out.println("TROPO status is true");
		} else {
			System.out.println("TROPO status is false");
		}

		// step-92.1(double click on tropo in left panel)
		act.moveToElement(driver1.findElement(By.name("TROPO"))).doubleClick(driver1.findElement(By.name("TROPO")))
				.build().perform();

		// step-93(Click on Record set in TROPO)
		driver1.findElement(By.name("Record set")).click();

		// step-94(Click on REC1)
		driver1.findElement(By.name("REC1")).click();

		// step-94.1(double click on DRFUPAI in left panel)
		act.moveToElement(driver1.findElement(By.name("DRFUPAI"))).doubleClick(driver1.findElement(By.name("DRFUPAI")))
				.build().perform();

		// step-95(Click on Record set in DRFUPAI)
		driver1.findElement(By.name("Record set")).click();

		// step-96(Click on REC1)
		driver1.findElement(By.name("REC1")).click();

		// step-97(Check all data will be same input handler , Output handler and
		// destination handler)
		driver1.findElement(By.name("Incoming Data")).click();
		Thread.sleep(2000);
		driver1.findElement(By.name("Outgoing Data")).click();

		// step-98(Open RFA (RFAInsertSim.exe))
		DesktopOptions last = new DesktopOptions();
		last.setApplicationPath("C:\\Insert(2)\\RFAInsertSim.exe");
		Thread.sleep(2000);
		WiniumDriver driver2 = new WiniumDriver(new URL("http://localhost:9999"), last);
		Thread.sleep(2000);

		// step-99(Click on Connect)
		driver2.findElement(By.id("1026")).click();
		Thread.sleep(3000);

		// step-100(Click on Records and Add - REC1, Click on Insert )
		driver2.findElement(By.name("Records")).click();
		driver2.findElement(By.id("1037")).sendKeys("REC1");
		driver2.findElement(By.id("1027")).click();

		// step-101(Click on Fields, insert ASK and BID)
		driver2.findElement(By.name("Fields")).click();
		driver2.findElement(By.id("1034")).sendKeys("ASK");
		driver2.findElement(By.id("1027")).click();
		driver2.findElement(By.id("1034")).sendKeys("BID");
		driver2.findElement(By.id("1027")).click();

		// step-101.1(click on static record set)
		driver2.findElement(By.name("Static record set")).click();

		// step-102(Click on Value )
		driver2.findElement(By.id("1046")).click();
		driver2.findElement(By.name("Close")).click();

		// step-103(Click on start )
		driver2.findElement(By.id("1036")).click();

		// step-104(Check UPAI, TROPO and DRFUPAI handler records in Status tool)
		driver1.findElement(By.name("DRFUPAI")).click();
		Thread.sleep(1000);
		driver1.findElement(By.name("Record set")).click();
		Thread.sleep(1000);
		driver1.findElement(By.name("REC1")).click();
		Thread.sleep(1000);

		// step-105("In status tool expand UPAI in left pannel,click on recorset, click
		// on record name REC1 and check the data in right pannel.
		// >Incoming Data
		// >Out going Data"

		act.moveToElement(driver1.findElement(By.name("DRFUPAI"))).doubleClick(driver1.findElement(By.name("DRFUPAI")))
				.build().perform();
		Thread.sleep(1000);
		act.moveToElement(driver1.findElement(By.name("TROPO"))).doubleClick(driver1.findElement(By.name("TROPO")))
				.build().perform();
		Thread.sleep(1000);
		driver1.findElement(By.name("UPAI")).click();
		Thread.sleep(1000);
		driver1.findElement(By.name("Record set")).click();
		Thread.sleep(1000);
		driver1.findElement(By.name("REC1")).click();
		Thread.sleep(1000);
		driver1.findElement(By.name("Incoming Data")).click();
		String incfield1 = "", incfield2 = "";
		if (driver1.findElement(By.name("ASK")).isDisplayed()) {
			incfield1 = driver1.findElement(By.name("ASK")).getAttribute("Name");
		}
		if (driver1.findElement(By.name("BID")).isDisplayed()) {
			incfield2 = driver1.findElement(By.name("BID")).getAttribute("Name");
		}

		driver1.findElement(By.name("Outgoing Data")).click();
		String outfield1 = "", outfield2 = "";
		if (driver1.findElement(By.name("ASK")).isDisplayed()) {
			outfield1 = driver1.findElement(By.name("ASK")).getAttribute("Name");
		}
		if (driver1.findElement(By.name("BID")).isDisplayed()) {
			outfield2 = driver1.findElement(By.name("BID")).getAttribute("Name");
		}

		if (incfield1.equals(outfield1) && incfield2.equals(outfield2)) {
			System.out.println("Values are equal");
		} else {
			System.out.println("Values are not equal");
			throw new Exception();
		}

		// driver2.quit();
		// driver1.quit();
	}

	@Test(priority = 2, description = "winium1")
	
	
	/*
	 * public void workwinium1() throws Exception {
	 * 
	 * driver.findElement(By.id("Item 1")).click(); new Upai().configure(driver);
	 * Thread.sleep(2000); new Upai().trcoHandler(driver); }
	 */

	public static void logExtentStatus(ExtentTest extentTest, boolean testResultStatus, String issueSummary)
			throws IOException {

		if (testResultStatus) {

			extentTest.log(LogStatus.PASS, issueSummary);
			// issueSummary);
		} else {
			extentTest.log(LogStatus.FAIL, issueSummary);
		}

	}

}
