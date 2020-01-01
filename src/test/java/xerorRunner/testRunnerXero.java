package xerorRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		format = { "pretty", "html:target/cucumber", "json:target/cucumber-report.json" },features = "C:\\Users\\auhum\\eclipse-workspace\\xeroApp\\src\\test\\java\\Feature"
 ,glue={"stepDefinitionXero"},tags= {"@Smoke"},dryRun=false)
public class testRunnerXero {
	public static WebDriver driver;
	 private TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass//(alwaysRun = true)
    public void setUpClass() throws Exception {    	
//    	System.setProperty("webdriver.chrome.driver","C:\\jar\\chromedriver.exe");
//    	driver = new ChromeDriver();
    	//testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    	testNGCucumberRunner = new TestNGCucumberRunner(testRunnerXero.class);
    }

    @Test(dataProvider = "features")    
    public void feature(CucumberFeatureWrapper cucumberFeature) throws Throwable {
    	//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    	testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
    
    @DataProvider//(parallel=true)
    public Object[][] features() {
       // return testNGCucumberRunner.provideFeatures();    	
    	 return testNGCucumberRunner.provideFeatures();
    }
    
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {    	
        testNGCucumberRunner.finish();        
    }
}

