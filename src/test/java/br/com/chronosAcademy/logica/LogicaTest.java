package br.com.chronosAcademy.logica;

import br.com.chronosAcademy.appium.DriverFactory;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {

    @Test
    public void validaTerrenoGrande(){
        Logica logica = new Logica();
        assertEquals("Terreno grande",logica.getTipoTerreno(101));

    }

    @Test
    public void validaTerrenoPequeno(){
        Logica logica = new Logica();
        assertEquals("Terreno pequeno",logica.getTipoTerreno(100));
        

    }



}