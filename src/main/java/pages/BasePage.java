package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public abstract class BasePage {

    public void scroll(WebElement element) {
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void click(WebElement element) {
        new WebDriverWait(BaseSteps.getDriver(), 5).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public String getText(WebElement element) {
        //new WebDriverWait(BaseSteps.getDriver(), 5).until(ExpectedConditions.elementT);
        return element.getText();
    }

    public void clickConer(WebElement element) {
        new WebDriverWait(BaseSteps.getDriver(), 5).until(ExpectedConditions.elementToBeClickable(element));
        Actions action = new Actions(BaseSteps.getDriver());
        action.moveToElement(element, element.getSize().getWidth()/2 - 1, element.getSize().getHeight()/2 - 1).click().build().perform();

    }

}
