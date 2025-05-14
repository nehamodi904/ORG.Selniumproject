package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features= {"C:\\Users\\modit\\eclipse-workspace\\com.cucumber2\\src\\main\\resources\\Feature\\Datatable1.feature"},    
        glue= {"Stepdefinitions"},
        monochrome=true,
        tags="@smoketest",
    plugin= {"pretty","html:target\\resultsOn09052025.html"}
        ) 
public class testrundatatable extends AbstractTestNGCucumberTests

{

}
