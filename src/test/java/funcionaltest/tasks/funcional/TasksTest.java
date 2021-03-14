package funcionaltest.tasks.funcional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TasksTest {

	WebDriver driver; 
	@Before
	public void iniciarAplicacao() {
		driver = new ChromeDriver();
		driver.navigate().to("http://localhost:8001/tasks/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void salvarTarefaComSucesso() {
		driver.findElement(By.id("addTodo")).click();
		driver.findElement(By.id("task")).sendKeys("teste 1");
		driver.findElement(By.id("dueDate")).sendKeys("15/03/2025");
		driver.findElement(By.id("saveButton")).click();
		;
	}
	
	@After
	public void conclusao() {
		driver.quit();
	}
	
}
