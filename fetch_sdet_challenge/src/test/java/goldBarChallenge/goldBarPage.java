package goldBarChallenge;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class goldBarPage {
    public goldBarPage(){
      PageFactory.initElements(Driver.getDriver(), this);
}

    @FindBy(id = "coin_0")
    WebElement coin0;

    @FindBy(id = "coin_1")
    WebElement coin1;

    @FindBy(id = "coin_2")
    WebElement coin2;

    @FindBy(id = "coin_3")
    WebElement coin3;

    @FindBy(id = "coin_4")
    WebElement coin4;

    @FindBy(id = "coin_5")
    WebElement coin5;

    @FindBy(id = "coin_6")
    WebElement coin6;

    @FindBy(id = "coin_7")
    WebElement coin7;

    @FindBy(id = "coin_8")
    WebElement coin8;

    @FindBy(id = "left_0")
    WebElement left0;

    @FindBy(id = "left_1")
    WebElement left1;

    @FindBy(id = "left_2")
    WebElement left2;

    @FindBy(id = "right_0")
    WebElement right0;

    @FindBy(id = "right_1")
    WebElement right1;

    @FindBy(id = "right_2")
    WebElement right2;


    @FindBy(id = "weigh")
    WebElement weigh;


    @FindBy(xpath = "//div[@class='game-info']/descendant::li[1]")
    WebElement initialWeight;

    @FindBy(xpath = "//div[@class='game-info']/descendant::li[2]")
    WebElement secondWeight;

    @FindBy(xpath = "//*[@id='weigh']/preceding-sibling::button[@id='reset']")
    WebElement reset;


}
