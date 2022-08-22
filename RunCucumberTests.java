package runner;

import io.cucumber.testng.CucumberOptions;
import stepDefs.ProjectSpecificMethods;

@CucumberOptions(features = "src/test/java/Features/EditLead.feature", 
				 glue = {"stepDefs",
						 /*"hooks"*/},
				 monochrome = true, 
				 publish = true		 
				 
				 /*tags = "@Smoke"*/
				 )
public class RunCucumberTests extends ProjectSpecificMethods {

}
