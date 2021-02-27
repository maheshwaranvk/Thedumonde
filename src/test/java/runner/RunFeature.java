package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/Thedumonde.feature",glue="step",monochrome=true, publish = true)
public class RunFeature extends AbstractTestNGCucumberTests{

}
