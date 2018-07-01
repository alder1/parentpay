package resources;

import DriverInstance.driverInstance;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;

public class hooks {
    driverInstance di=new driverInstance();
    @Before()
    public void setUpTest() throws IOException {
        di.openBrowser();


    }

    @After
    public void tearDown(){
        di.closeBrowser();


    }

}
