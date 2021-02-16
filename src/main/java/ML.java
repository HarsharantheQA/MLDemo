

import com.twilio.Twilio;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.Message;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.stream.*;



public class ML {
    static String CloseBox = "close-button";
    static String FirstName = "inputFirstName";
    static String LastName = "inputLastName";
    static String Mobile = "inputMobile";
    static String Email = "inputMailId";
    static String SaveContinue = "stepcta_1";
    static String Age   = "inputAge";
    static  String PAN  ="inputPan";
    static  String Address1 = "inputAddress1";
    static  String City =   "inputCity";
    static  String PIN = "inputPin";
    static  String State = "inputState";
    static String Country = "inputCountry";
    static String SaveContinue2="stepcta_2" ;
    static String SaveContinue3="stepcta_3" ;
    static  String DatePicker = "start_date";
    static  String TotalDuration = "total_duration";
    static String Amount = "SlabAmount";
    static  String Deposit = "deposit";
    static String DepositDate   = "deposit_date";
    static  String BuildingName = "building_name";
    static  String FlatUnit = "unit_no";
    static String FloorNumber = "floor_number";
    static String CarpetArea = "carpet_area";
    static  String RevenueLimit = "revenuelimit_area";
    static  String RevenueLimitDistrict = "revenuelimit_district";
    static  String RevenueLimitCorporation = "revenuelimit_corporation";
    static  String SaveContinue4 = "stepcta_4";
    static String Submit = "stepcta_5";

    //    static String OTP = "//input[@name='otp']";
//    static String Login = "//button[@class='buttoncta']";
//    public static String ACCOUNT_SID = "AC281897df13300173da696fa1a9e8057f";
//    public static String AUTH_TOKEN = "006206f5329982f9fe75cfd2a6943376";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        JavascriptExecutor js4 = (JavascriptExecutor) driver;

        driver.manage().window().maximize();

        driver.get("https://www.multiliving.co.in/online-rental-agreement");

        Thread.sleep(10000);

        action.sendKeys(Keys.ESCAPE).perform();

        String parent = driver.getWindowHandle();
        driver.switchTo().window(parent);

        //      basic details page
        driver.findElement(By.id(FirstName)).sendKeys("Test");
        driver.findElement(By.id(LastName)).sendKeys("Test1");
        driver.findElement(By.id(Mobile)).sendKeys("9664630757");
        driver.findElement(By.id(Email)).sendKeys("Test@test.com");
        driver.findElement(By.id(SaveContinue)).click();
        Thread.sleep(30000);
        driver.findElement(By.id(SaveContinue)).click();

        //  Landlord details
        driver.findElement(By.id(Age)).sendKeys("25");
        driver.findElement(By.id(PAN)).sendKeys("11456THUA");
        driver.findElement(By.id(Address1)).sendKeys("test");
        driver.findElement(By.id(City)).sendKeys("Mumbai");
        driver.findElement(By.id(PIN)).sendKeys("400078");
        driver.findElement(By.id(State)).sendKeys("Maharashtra");
        driver.findElement(By.id(Country)).sendKeys("India");
        js2.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.id(SaveContinue2)).click();
        Thread.sleep(2000);


       //tenant Details
        driver.findElement(By.id(FirstName)).sendKeys("Rambo");
        driver.findElement(By.id(LastName)).sendKeys("Fernandes");
        driver.findElement(By.id(Age)).sendKeys("30");
        driver.findElement(By.id(PAN)).sendKeys("1145YU90A");
        driver.findElement(By.id(Mobile)).sendKeys("1234567701");
        driver.findElement(By.id(Email)).sendKeys("Test1@test1.com");
        driver.findElement(By.id(Address1)).sendKeys("Marol");
        driver.findElement(By.id(City)).sendKeys("Pune");
        driver.findElement(By.id(PIN)).sendKeys("500078");
        driver.findElement(By.id(State)).sendKeys("Maharashtra");
        driver.findElement(By.id(Country)).sendKeys("India");
        js3.executeScript("window.scrollBy(0,300)");
        driver.findElement(By.id(SaveContinue3)).click();
        Thread.sleep(2000);


       //Apartment details
        driver.findElement(By.id(DatePicker)).sendKeys("02172021");
        driver.findElement(By.id(TotalDuration)).sendKeys("6");
        driver.findElement(By.id(Amount)).sendKeys("5000");
        driver.findElement(By.id(Deposit)).sendKeys("2000");
        driver.findElement(By.id(DepositDate)).sendKeys("02172021");
        driver.findElement(By.id(BuildingName)).sendKeys("We_Work");
        driver.findElement(By.id(FlatUnit)).sendKeys("301");
        driver.findElement(By.id(FloorNumber)).sendKeys("3");
        driver.findElement(By.id(CarpetArea)).sendKeys("500");
        driver.findElement(By.id(RevenueLimit)).sendKeys("3000");
        driver.findElement(By.id(RevenueLimitDistrict)).sendKeys("mumbai");
        driver.findElement(By.id(RevenueLimitCorporation)).sendKeys("5000");
        driver.findElement(By.id(SaveContinue4)).click();
        Thread.sleep(2000);

        //Apartment Details
        js4.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id(Submit)).click();

//         OTP automation process failed , as it only accept US +1 code.
//        Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
//        String smsBody = getMessage();
//        System.out.println(smsBody);
//        String OTPNumber = smsBody.replaceAll("[^-?0-9]+", " ");
//        System.out.println(OTPNumber);
////        driver.findElement(By.xpath(OTP)).sendKeys(OTPNumber);
////        driver.findElement(By.xpath(Login)).click();

//         OTP automation process
//        public static String getMessage() {
//            return getMessages().filter(m -> m.getDirection().compareTo(Message.Direction.INBOUND) == 0)
//                    .filter(m -> m.getTo().equals("+12018775801")).map(Message::getBody).findFirst()
//                    .orElseThrow(IllegalStateException::new);
//        }
//
//        private static Stream<Message> getMessages() {
//            ResourceSet<Message> messages = Message.reader(ACCOUNT_SID).read();
//            return StreamSupport.stream(messages.spliterator(), false);
//        }





//        if (CLoseModal==true){
//
//        }
}}
