package runnberdemo;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/Resources/Features",
        glue = {"Steps"})

public class RunnberClass extends AbstractTestNGCucumberTests {



}
