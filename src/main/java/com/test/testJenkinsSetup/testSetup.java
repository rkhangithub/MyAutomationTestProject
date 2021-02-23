package com.test.testJenkinsSetup;
import org.jetbrains.annotations.TestOnly;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSetup {


        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","/Users/rizwan/Users/rizwan/Desktop/TestSetupJenkinsProject/src/main/resources/browserdrivers/chromedriver");    // <-- Change this path
            WebDriver driver = new ChromeDriver();
            String baseUrl = "https://experitest.com/free-trial/";
            String expectedTitle = "Free trial";
            String actualTitle = "";
            driver.get(baseUrl);
            actualTitle = driver.getTitle();
            if (actualTitle.contentEquals(expectedTitle)){
                System.out.println("TEST PASSED!");
            } else {
                System.out.println("TEST FAILED");
            }
            driver.close();
        }
    }

