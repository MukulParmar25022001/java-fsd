package runnerPackage;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\Vipul Parmar\\eclipse-workspace\\Lesson-5-cucumber\\src\\test\\java\\features\\wikipage.feature",
	glue = {"Steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/TestreportToday.html"}, 
	monochrome = true, // console output will be in more readable format
	tags = "@login"
		
		)


public class TestRunner1 {

}