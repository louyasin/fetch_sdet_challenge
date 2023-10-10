package goldBarChallenge;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class goldBar {
    public static void main(String[] args) {
        fakeBar();
    }
    public static WebDriver driver;

    public static void fakeBar(){

        // instantiate driver
        driver = Driver.getDriver();

        //get challenge website
        driver.get("http://sdetchallenge.fetch.com/");

        //create an object of goldBarPage
        goldBarPage goldBarPage = new goldBarPage();

        //send 0,1,2 in left box
        goldBarPage.left0.sendKeys("0");
        goldBarPage.left1.sendKeys("1");
        goldBarPage.left2.sendKeys("2");


        //send 3,4,5 in right box
        goldBarPage.right0.sendKeys("3");
        goldBarPage.right1.sendKeys("4");
        goldBarPage.right2.sendKeys("5");

        goldBarPage.weigh.click();

        //waiter necessary, otherwise runs too fast and resets before weighing
        Waiter.pause(3);

        goldBarPage.reset.click();

        Waiter.pause(3);

        /**
        fake bar weighs less than the others.
        logic checks the first 2 sets of bars against each other
        if < check first two numbers in first set
        if > check first two numbers in second set
        if = check first two numbers in third set
         */

        if(goldBarPage.initialWeight.getText().contains("[0,1,2] < [3,4,5]")){
            goldBarPage.left0.sendKeys("0");
            goldBarPage.right0.sendKeys("1");
            goldBarPage.weigh.click();

            if(goldBarPage.secondWeight.getText().contains("<")){
                goldBarPage.coin0.click();
            }
            else if(goldBarPage.secondWeight.getText().contains(">")){
                goldBarPage.coin1.click();
            }
            else goldBarPage.coin2.click();

        } else if (goldBarPage.initialWeight.getText().contains("[0,1,2] > [3,4,5]")) {
                goldBarPage.left0.sendKeys("3");
                goldBarPage.right0.sendKeys("4");
                goldBarPage.weigh.click();
                if(goldBarPage.secondWeight.getText().contains("<")){
                    goldBarPage.coin3.click();
                }
                else if(goldBarPage.secondWeight.getText().contains(">")){
                    goldBarPage.coin4.click();
                }
                else goldBarPage.coin5.click();

            }
        else {
            goldBarPage.left0.sendKeys("6");
            goldBarPage.right0.sendKeys("7");
            goldBarPage.weigh.click();
            if(goldBarPage.secondWeight.getText().contains("<")){
                goldBarPage.coin6.click();
            }
            else if(goldBarPage.secondWeight.getText().contains(">")){
                goldBarPage.coin7.click();
            }
            else goldBarPage.coin8.click();

        }

        Waiter.pause(5);

    }

}
