package br.com.chronosAcademy.appium;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.net.MalformedURLException;



public class CalculadoraTest {

    DriverFactory driverFactory;

    @BeforeEach
    public void inicializarDriver() throws MalformedURLException{
        driverFactory = new DriverFactory();
        driverFactory.setCapabilities("Android", "ChronosMobile",
                "uiautomator2", "com.android.calculator2", "com.android.calculator2.Calculator");
        driverFactory.setDriver();
    }
    @AfterEach
    public void finalizaDriver() {
        driverFactory.getDriver().quit();
    }

    public void clickId(String id) {
        driverFactory.getDriver().findElement(MobileBy.id(id)).click();
    }



    @Test
    public void validarMultiplicacao() {

        //driverFactory.getDriver().findElement(MobileBy.id("digit_7")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("op_mul")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
        clickId("digit_7");
        clickId("op_mul");
        clickId("digit_9");
        clickId("eq");
        String resultado1 = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();
        assertEquals("63", resultado1);
    }



    @Test
    public void validarSoma(){

        //driverFactory.getDriver().findElement(MobileBy.id("digit_7")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("op_add")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
            clickId("digit_7");
            clickId("op_add");
            clickId("digit_9");
            clickId("eq");
        String resultado2 = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();
        assertEquals("16", resultado2);

    }

    @Test
    public void validarDivisao(){


        //driverFactory.getDriver().findElement(MobileBy.id("digit_7")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("op_div")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("digit_9")).click();
        //driverFactory.getDriver().findElement(MobileBy.id("eq")).click();
            clickId("digit_7");
            clickId("op_div");
            clickId("digit_9");
            clickId("eq");
        String resultado3 = driverFactory.getDriver().findElement(MobileBy.id("result")).getText();
        assertEquals("0.777777777777", resultado3);

    }

}
