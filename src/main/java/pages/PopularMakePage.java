package pages;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopularMakePage {

    public WebDriver driver;
    public WebDriverWait wait;

    /**
     * Popular Make Logo
     */
    private final By _popular_make_logo = By.xpath("//img[@title='Alfa Romeo']");

    /**
     * Popular Make table locators
     */
    private final By _popular_make_table = By.xpath("//table[contains(@class, 'cars table')]");
    private final By _popular_make_ModelOnelink = By.xpath("//a[text()='Guilia Quadrifoglio']");

    /**
     * View more Popular Make page
     */
    private final By _click_vote_button = By.xpath("//button[@class='btn btn-success']");
    private final By _vote_success_message = By.xpath("//p[text()='Thank you for your vote!']");


    public PopularMakePage(WebDriver driver)
    {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, 10);
    }

    // Interaction method

    public void clickPopularMakeLogo(){

        wait.until(ExpectedConditions.elementToBeClickable(_popular_make_logo)).click();

    }

    public void clickModelOneLink(){
        wait.until(ExpectedConditions.presenceOfElementLocated(_popular_make_ModelOnelink)).click();

    }

    public void clickVoteButton(){
        wait.until(ExpectedConditions.presenceOfElementLocated(_click_vote_button)).click();

    }

    // API Or Workflow
    public void popularMake(){
        clickPopularMakeLogo();
    }

    public void voteForPopularModel(){
        clickModelOneLink();
        clickVoteButton();
    }
    

    // Verification
    public Boolean isPopularMakePresent(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(_popular_make_table)).isDisplayed();
    }

    public String getVoteSuccessMessage(){
        return wait.until(ExpectedConditions.presenceOfElementLocated(_vote_success_message)).getText().trim();
    }
}
