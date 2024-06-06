package Com.nopecommerce.Registration;

import org.testng.annotations.Test;

import com.nopcommerce.ObjectRepo.ComputerPage;
import com.nopecommerce.BaseClass.BaseClassTest;

public class RegistaringAnUSer extends BaseClassTest {
	@Test
	public void regusteringAuser() throws InterruptedException {
		System.out.println("hi");
		
		hp.getComputerModule().click();
		System.out.println(hp.getAccessoriesInApparels().getText());
		System.out.println("checking");
		ComputerPage cp = new ComputerPage(driver);
		cp.getAppleInManufacturerList().getText();
		
		//cp.getViewAllInPopularTags().click();
		Thread.sleep(3000);
		
	}

}
