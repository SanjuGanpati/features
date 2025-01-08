package api.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
   @Before
    public void setUp(){
       System.out.println("---Before Hooks---");
   }
   @After
    public void tearDown(){
       System.out.println("---After Hooks---");
   }

}
