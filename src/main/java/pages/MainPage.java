package pages;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id = 'desktopMenuMain']//a[@class = 'type-global-nav-link-1' and contains(text(), 'Меню доставки')]")
    WebElement mainMenu;

    @FindBy(xpath = "//span[@class ='main-menu__category type-global-nav-link-1' and contains(text(), 'Меню доставки')]")
    WebElement deliveryMenu;

    @FindBy(xpath = "//*[@id = 'desktopMenuMain']//a[@href='/catalog']/..//div[@class = 'main-menu__wrap']/ul[contains(@class,'main-menu__list')]/li")
    WebElement menuItems;

    @FindBy(xpath = "//span[@class ='top-cart__total-cost desktop-only']")
    WebElement cartButton;

    @FindBy(xpath = "//div[@id = 'pw-confirm__close']")
    WebElement closeWindow;

    public void window() {
        WebElement el = BaseSteps.getDriver().findElement(By.xpath("//div[@id = 'pw-confirm__close']"));
        if(el.isDisplayed()){
            click(el);
        }

    }

    public void clickMainMenu() {
        click(mainMenu);
    }

    public void clickMenu(String text) {
        List<WebElement> href = BaseSteps.getDriver().findElements(By.xpath("//" +
                "*[@id = 'desktopMenuMain']//li[@class = 'level-2__item']/a[contains(text(), '" + text + "')]"));
        Assert.assertEquals("Menu not found", 1, href.size());
        click(href.get(0));
    }

    public void clickCart() {
        click(cartButton);
    }

}
