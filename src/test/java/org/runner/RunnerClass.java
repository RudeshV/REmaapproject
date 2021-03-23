package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefenition.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue="org.stepdefenition",
dryRun = false,strict=true,monochrome=true,plugin= {"pretty",
"html:src\\test\\resources\\Reports","junit:src\\test\\resources\\Reports\\output.xml",
"json:src\\test\\resources\\Reports\\REmaap.json"})
public class RunnerClass {
@AfterClass
public static void jvmGen() {
JVMReport.generateJVMReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\REmaap.json");

}
}
