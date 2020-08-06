package runnerclasspkg;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Akash\\git\\online-shopping-web\\shpping_on_web\\samplefeturefilefolder\\Buyproduct.feature",
		 glue={"stepDefinitionbuyproduct"},
		 monochrome=true,
		 plugin={"pretty", "html:onlineweb"},
		 dryRun=false
		
)

public class Runnerwebclass
{
}
