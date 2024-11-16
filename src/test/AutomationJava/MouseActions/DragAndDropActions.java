package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		Thread.sleep(500);
		//Drag and Drop 1
		
		WebElement rome = driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy = driver.findElement(By.xpath("//div[@id='box106']"));
		act.dragAndDrop(rome, italy).perform();
		
		Thread.sleep(500);
		//Drag and Drop 2
		WebElement washingTone = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement unitedStates = driver.findElement(By.xpath("//div[@id='box103']"));
		act.dragAndDrop(washingTone, unitedStates).perform();
		
		Thread.sleep(500);
		//Drag and Drop 3
		WebElement Copenhagen = driver.findElement(By.xpath("//div[@id='box4']"));
		WebElement Denmark = driver.findElement(By.xpath("//div[@id='box104']"));
		act.dragAndDrop(Copenhagen, Denmark).perform();
		
		//Drag and Drop 4
		WebElement Oslo = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement Norway = driver.findElement(By.xpath("//div[@id='box101']"));
		act.dragAndDrop(Oslo, Norway).perform();
		
		//Drag and Drop 5
		WebElement Madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		WebElement Spain = driver.findElement(By.xpath("//div[@id='box107']"));
		act.dragAndDrop(Madrid, Spain).perform();
		
		//Drag and Drop 6
		WebElement Seoul = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement SouthKorea = driver.findElement(By.xpath("//div[@id='box105']"));
		act.dragAndDrop(Seoul, SouthKorea).perform();
		
		//Drag and Drop 5
		WebElement Stockholm = driver.findElement(By.xpath("//div[@id='box2']"));
		WebElement Sweden = driver.findElement(By.xpath("//div[@id='box102']"));
		act.dragAndDrop(Stockholm, Sweden).perform();
	}

}
