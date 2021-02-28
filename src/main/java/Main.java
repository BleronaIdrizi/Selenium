import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.text.DateFormat;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static JavascriptExecutor jsExecutor;
    public static WebDriver webDriver;

    private static By ddlLlojiAutoLocator;
    private static By markatipiLocator;
    private static By nrShasisLocator;
    private static By tabelatLocator;
    private static By ngjyraLocator;
    private static By isiguruari_EmriMbiemriLocator;
    private static By isiguruari_vendiLocator;
    private static By isiguruari_rrugaLocator;
    private static By isiguruari_telLocator;
    private static By emailLocator;
    private static By emailConfirmLocator;
    private static By ddlShtetiLocator;
    private static By ddldata1Locator;
    private static By btnKushtetLocator;
    private static By termsAndConditionsLocator;
    private static By btnVazhdoLocator;
    private static By btnRuaniPolicenLocator;

    public static void main(String[] args) throws InterruptedException {
        String url = "https://api.bks-ks.org/policaonline";

        //String chromeDrivePath = Main.class.getResource("chromedriver-86.exe").getPath();
        System.setProperty("webdriver.chrome.driver", "");
        System.setProperty("webdriver.chrome.whitelistedIps", "C://Users//Lenovo//.config//Desktop//PolicaeSigurimitKufitar//target//classes");
        webDriver = new ChromeDriver();
        jsExecutor = (JavascriptExecutor) webDriver;

        webDriver.manage().window().setSize(new Dimension(600, 100));
        webDriver.manage().window().maximize();
        webDriver.get(url);


        WebDriverWait wait = new WebDriverWait(webDriver, 5);

//        Thread.sleep(1000);
//        ddlLlojiAutoLocator = By.id("ddlLlojiAuto");
//        wait.until(ExpectedConditions.visibilityOfElementLocated(ddlLlojiAutoLocator));
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
//        webDriver.findElement(ddlLlojiAutoLocator).sendKeys("AUTOVETURAT");

        Random rand = new Random();
        int nrShasisRandom = rand.nextInt(10000000);
        Thread.sleep(1000);
        nrShasisLocator = By.id("nrshasis");
        wait.until(ExpectedConditions.visibilityOfElementLocated(nrShasisLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(nrShasisLocator).sendKeys(nrShasisRandom + "");

        Thread.sleep(1000);
        markatipiLocator = By.id("markatipi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(markatipiLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(markatipiLocator).sendKeys("VW Golf 6 Comfort");

        Thread.sleep(1000);
        tabelatLocator = By.id("tabelat");
        wait.until(ExpectedConditions.visibilityOfElementLocated(tabelatLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(tabelatLocator).sendKeys("02 817 12");

        Thread.sleep(1000);
        ngjyraLocator = By.id("ngjyra");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ngjyraLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(ngjyraLocator).sendKeys("Gray");

        Thread.sleep(1000);
        isiguruari_EmriMbiemriLocator = By.id("isiguruari_EmriMbiemri");
        wait.until(ExpectedConditions.visibilityOfElementLocated(isiguruari_EmriMbiemriLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(isiguruari_EmriMbiemriLocator).sendKeys("Blerona Idrizi");

        Thread.sleep(1000);
        isiguruari_vendiLocator = By.id("isiguruari_vendi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(isiguruari_vendiLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(isiguruari_vendiLocator).sendKeys("Skenderaj");

        Thread.sleep(1000);
        markatipiLocator = By.id("markatipi");
        wait.until(ExpectedConditions.visibilityOfElementLocated(markatipiLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(markatipiLocator).sendKeys("VW Golf 6 Comfort");

        Thread.sleep(1000);
        isiguruari_rrugaLocator = By.id("isiguruari_rruga");
        wait.until(ExpectedConditions.visibilityOfElementLocated(isiguruari_rrugaLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(isiguruari_rrugaLocator).sendKeys("Turiqevc");

        Thread.sleep(1000);
        isiguruari_telLocator = By.id("isiguruari_tel");
        wait.until(ExpectedConditions.visibilityOfElementLocated(isiguruari_telLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(isiguruari_telLocator).sendKeys("049 123 456");

        Thread.sleep(1000);
        emailLocator = By.id("email");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(emailLocator).sendKeys("blerona.idrizi@student.uni-pr.edu");

        Thread.sleep(1000);
        emailConfirmLocator = By.id("emailConfirm");
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailConfirmLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(emailConfirmLocator).sendKeys("blerona.idrizi@student.uni-pr.edu");

        Thread.sleep(1000);
        ddlShtetiLocator = By.id("ddlShteti");
        wait.until(ExpectedConditions.visibilityOfElementLocated(ddlShtetiLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(ddlShtetiLocator).sendKeys("GJERMANIA");

        Thread.sleep(5000);
        btnKushtetLocator = By.id("btnKushtet");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnKushtetLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(btnKushtetLocator).click();

        Thread.sleep(1000);
        termsAndConditionsLocator = By.id("TermsAndConditions");
        wait.until(ExpectedConditions.visibilityOfElementLocated(termsAndConditionsLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(termsAndConditionsLocator));
        webDriver.findElement(termsAndConditionsLocator).click();

        Thread.sleep(3000);
        btnRuaniPolicenLocator = By.id("btnSubmit1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(btnRuaniPolicenLocator));
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", webDriver.findElement(btnRuaniPolicenLocator));
        webDriver.findElement(btnRuaniPolicenLocator).click();

       try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //webDriver.quit();
    }
}
