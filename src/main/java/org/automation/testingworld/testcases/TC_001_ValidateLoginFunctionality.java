package org.automation.testingworld.testcases;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.automation.testingworld.base.DriverInstance;
import org.automation.testingworld.datagenerators.datagenerator;
import org.automation.testingworld.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TC_001_ValidateLoginFunctionality extends DriverInstance{

    @Test(dataProvider = "Excel", dataProviderClass = datagenerator.class )
    public void tc_001_login_functionality(String uname, String pass) throws Exception{
        LoginPage login = new LoginPage(driver);
        login.enterUsername(uname);
        login.enterPassword(pass);
        login.clickSignin();
    }



}
