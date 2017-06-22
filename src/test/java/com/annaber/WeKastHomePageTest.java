package com.annaber;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

public class WeKastHomePageTest {

    private WebDriver driver;

    @BeforeClass // Runs this method before the first test method in the current class is invoked
    public void setUp() {
        // Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
    }

    @Test // Marking this method as part of the test
    public void gotoWeKastPage() {
        driver.get("http://wekast.com/"); // Go to the WeKast home page
        driver.findElement(By.xpath("//*[@class=\"header-info_btn\"]")).click();
        System.out.println("Page title is: " + driver.getTitle());

    }

    @AfterClass // Runs this method after all the test methods in the current class have been run
    public void tearDown() {
        // Close all browser windows and safely end the session
        driver.quit();
    }

}
