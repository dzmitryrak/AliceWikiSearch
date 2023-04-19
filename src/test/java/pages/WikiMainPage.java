package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WikiMainPage extends BasePage {

    @FindBy(id = "searchInput")
    private WebElement searchField;

    public WikiMainPage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(String keyword){
        searchField.sendKeys(keyword);
        driver.findElement(By.cssSelector(".cdx-search-input__end-button")).click();
    }
}
