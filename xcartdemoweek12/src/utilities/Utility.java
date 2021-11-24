package utilities;

import browsertesting.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest {
    /**
     * This method will click on element
     * @param by
     */
    public void clickOnElement(By by){
        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     * @param by
     * @return
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     * @param by
     * @param text
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }
    public String getTextFromAlert(By by){
        return  driver.findElement(by).getText();

    }
    public  void selectValueFromdropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public void selectVisibleTextFromDropDown(By by, String visibletext) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(visibletext);

    }
    public void selectByIndexFromDropDown(By by, int index) {
        Select select = new Select(driver.findElement(by));
        select.deselectByIndex(index);
    }
    public void mouseHoverToElement(By by) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).perform();
    }
    public void mouseHoverToClickElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(by)).click().build().perform();
    }
    public void rightClickToElement(By by) {
        Actions actions1 = new Actions(driver);
        actions1.contextClick(driver.findElement(by)).perform();
    }
    public void drangAndDrop(By by , By by1) {
        Actions actions2 = new Actions(driver);
        actions2.dragAndDrop(driver.findElement(by),driver.findElement(by)).perform();
    }
    public void keyBoardEvent(By by ) {
        Actions actions3 = new Actions(driver);
        actions3.keyDown(Keys.CONTROL).sendKeys().keyUp(Keys.CONTROL).build().perform();
    }
}
