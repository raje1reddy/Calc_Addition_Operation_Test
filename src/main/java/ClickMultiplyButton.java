import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMultiplyButton {

    public void MultiplyButton(WebDriver driver) {
        //WebDriver driver = new ChromeDriver();
        // open the browser and go to open www.calculator.net'
        //driver.get("https://www.calculator.net/");

       // CalculatorSeleniumTest calc = new CalculatorSeleniumTest();

        WebElement multiply =  driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[4]"));
        multiply.click();
    }

    public void oneButton(WebDriver driver){
        WebElement textBox1 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[1]"));
        textBox1.click();

    }

    public void twoButton(WebDriver driver){
        WebElement textBox2 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[2]"));
        textBox2.click();
    }

    public void threeButton(WebDriver driver){
        WebElement textBox3 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[3]/span[3]"));
        textBox3.click();
    }
    public void fourButton(WebDriver driver){
        WebElement textBox4 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[1]"));
        textBox4.click();
    }
    public void fiveButton(WebDriver driver){
        WebElement textBox5 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[2]"));
        textBox5.click();
    }
    public void sixButton(WebDriver driver){
        WebElement textBox6 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[2]/span[3]"));
        textBox6.click();
    }
    public void sevenButton(WebDriver driver){
        WebElement textBox7 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[1]"));
        textBox7.click();
    }
    public void eightButton(WebDriver driver){
        WebElement textBox8 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[2]"));
        textBox8.click();
    }
    public void nineButton(WebDriver driver){
        WebElement textBox9 = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/span[3]"));
        textBox9.click();
    }

    public  void printText(WebDriver driver) {
        WebElement calculateButton = driver.findElement(By.xpath("//div[@id='sciOutPut']"));
        //calculateButton.click();
        System.out.println(calculateButton.getText());
    }
}
