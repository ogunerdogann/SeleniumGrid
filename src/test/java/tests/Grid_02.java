package tests;

import org.testng.annotations.*;

import static manager.DriveManager.*;

public class Grid_02 {

    @Parameters("browser")
    @BeforeTest
    void beforeTest(@Optional("browser") String browser){

        setDriver("grid_chrome");
    }
    @Test
    void test01(){
        driver.get("https://www.wisequarter.com");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

    }
    @AfterTest
    void afterTest(){
        closeDriver();
    }
}
