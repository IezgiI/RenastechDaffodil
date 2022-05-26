package students.Mukaddes;

import code.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class lab04 {
    public static void main(String[] args) {
        //1. Open Chrome browser
//2. Go to https://demo.guru99.com/test/radio.html
//3. Verify all checkboxes are not selected (you can use findelements to store in list and use for loop to validate)
//4. Click to checkbox3
//5. Verify checkbox3 is selected

        WebDriver driver= WebDriverUtil.getDriver("chrome");
        driver.get("https://demo.guru99.com/test/radio.html");
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement each:checkBoxes){
            if(!each.isSelected()){
                System.out.println(each.getAttribute("value")+"is not selected");
            }else{
                System.out.println(each.getAttribute("value")+"is selected");

            }
        }
        WebElement box3=driver.findElement(By.id("vfb-6-2"));
        box3.click();
        if(box3.isSelected()){
            System.out.println("box3 is selected");
        }else{
            System.out.println("box 3 is not selected");

        }


    }
}
