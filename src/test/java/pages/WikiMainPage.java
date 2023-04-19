package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikiMainPage extends BasePage {

    @FindBy(name = "search")
    private WebElement searchField;

    public WikiMainPage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword){
        searchField.sendKeys(keyword);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[role=option]")));
        driver.findElement(By.cssSelector(".cdx-search-input__end-button")).click();
    }
}
