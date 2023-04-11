package githubpractice;

import org.testng.Assert;
import org.testng.Reporter;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClass {
	public static RequestSpecification httpRequest;
	public static Response response;
	String Print_Pass_Cases = "true";

	public void Assertion(String Trait_Name, int Actual_Value, int Expected_Value)
	{
		if(Actual_Value == Expected_Value)
		{
			if(Print_Pass_Cases.equals("true"))
			{
				Assert.assertEquals(Actual_Value, Expected_Value);
				
				Reporter.log(Trait_Name+" - Test Passed",true);
				
				Reporter.log("Actual "+Trait_Name+" : "+Actual_Value, true);
				
				Reporter.log("Expected "+Trait_Name+" : "+Expected_Value, true);
				
				Reporter.log("", true);
			}
		}	
		
		else
		{			
			Reporter.log(Trait_Name+" - Test Failed",true);
			
			Reporter.log("Actual "+Trait_Name+" : "+Actual_Value, true);
			
			Reporter.log("Expected "+Trait_Name+" : "+Expected_Value, true);
			
			Reporter.log("", true);
			
			Assert.assertEquals(Actual_Value, Expected_Value);
			
		}
		
	}
	

}
