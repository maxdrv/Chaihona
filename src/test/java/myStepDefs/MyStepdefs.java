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
    public void deletePopupWindow(){
        steps.window();
    }

    @When("^Нажать на кнопку меню$")
    public void clickMenuButtom(){
        steps.clickMainMenu();
    }

    @Then("^Перейти в меню доставки \"(.+)\"$")
    public void moveToSubMenu(String text){
        steps.clickMenuItem(text);
    }

    @And("^Добавить в корзину \"(.+)\"$")
    public void addToCart(String text){
        steps.addToCart(text);
    }

    @When("^Перейти в корзину$")
    public void moveToCart(){
        steps.moveToCart();

    }

    @Then("^Проверить корзину$")
    public void checkCartForItems(){
        steps.checkCart();

    }

    @And("^Удалить из корзины$")
    public void deleteItemsFromCart(){
        steps.deleteCartItems();

    }

    @And("^Проверить пустая ли корзина$")
    public void checkCartForEmpty(){
        steps.checkForEmpty();
    }
}
