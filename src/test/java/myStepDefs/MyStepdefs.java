package myStepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ru.Дано;
import steps.Steps;

/**
 * Created by student on 05.11.2018.
 */
public class MyStepdefs {

    Steps steps = new Steps();

    @When("^Убрать всплыващие окна$")
    public void deletePopupWindow() throws Throwable{
        steps.window();
    }

    @When("^Нажать на кнопку меню$")
    public void clickMenuButtom() throws Throwable{
        steps.clickMainMenu();
    }

    @Then("^Перейти в меню доставки \"(.+)\"$")
    public void moveToSubMenu(String text) throws Throwable{
        steps.clickMenuItem(text);
    }

    @And("^Добавить в корзину \"(.+)\"$")
    public void addToCart(String text) throws Throwable{
        steps.addToCart(text);
    }

    @When("^Перейти в корзину$")
    public void moveToCart() throws Throwable{
        steps.moveToCart();

    }

    @Then("^Проверить корзину$")
    public void checkCartForItems() throws Throwable{
        steps.checkCart();

    }

    @And("^Удалить из корзины$")
    public void deleteItemsFromCart() throws Throwable{
        steps.deleteCartItems();

    }

    @And("^Проверить пустая ли корзина$")
    public void checkCartForEmpty() throws Throwable{
        steps.checkForEmpty();
    }
}
