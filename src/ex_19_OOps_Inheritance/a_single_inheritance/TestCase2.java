package ex_19_OOps_Inheritance.a_single_inheritance;

public class TestCase2 extends CommonToAll {

    void runningTC2(){
        startBrowser();
        System.out.println("Running TC2");
        readExcelFile();
        readDataBaseFile();
        closeBrowser();
    }
}