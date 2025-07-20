package installationTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Installation {

	@Test
	public void m1() {
		boolean flag = false;
		//to get test status we have to use Assert class
		Assert.assertTrue(flag);	}
}
