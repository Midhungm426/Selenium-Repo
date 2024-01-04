package test;

public class BrowserCommands extends Base
{
	public void navigationCommands()
	{
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
	}
	public void browserCommands()
	{
		String tittle = driver.getTitle();
		String url = driver.getCurrentUrl();
		String pageSource = driver.getPageSource();
	}
	public static void main(String[] args) 
	{
		BrowserCommands browsercommands = new BrowserCommands();
		browsercommands.initializeBrowser();
		browsercommands.navigationCommands();
		browsercommands.browserQuit();
	}
}
