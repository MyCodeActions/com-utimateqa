package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Project-5 - ProjectName: com-utimateqa
 * BaseUrl = https://courses.ultimateqa.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Click on the ‘Sign In’ link
 * 7. Print the current URL
 * 8. Enter the email in the email field.
 * 9. Enter the password in the password field.
 * 10. Click on the Login Button.
 * 11. Navigate to baseUrl.
 * 12. Navigate forward to the Homepage.
 * 13. Navigate back to baseUrl.
 * 14. Refresh the page.
 * 15. Close the browser.
 */
public class ChromeBrowserTesting {

    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/";

        // 1. Launch the chrome browswer
        WebDriver driver = new ChromeDriver();

        // 2. open url
        driver.get(baseUrl);

        // 3.Print title of the page
        System.out.println("The title of page is : " + driver.getTitle());

        // 4.Get current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 5.Get page source code
        System.out.println("The page source is below: \n" + driver.getPageSource());

        // 6. Click on the ‘Sign In’ link
        driver.findElement(By.xpath("/html/body/header/div[2]/div/nav/ul/li/a")).click();

        // 7. Print the current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 8. Enter the email in the email field.
        driver.findElement(By.id("user[email]")).sendKeys("pras@gmail.com");

        // 9. Enter the password in the password field.
        driver.findElement(By.id("user[password]")).sendKeys("123456");

        // 10. Click on the Login Button.
        driver.findElement(By.className("button")).click();

        //  11. Navigate to baseUrl
        driver.navigate().back();

        // 12. Navigate forward to the Homepage
        driver.navigate().forward();

        //  13. Navigate back to baseUrl
        driver.navigate().back();

        // 14. Refresh the page
        driver.navigate().refresh();

        // 15. Close the browser
        driver.close();
    }
}
