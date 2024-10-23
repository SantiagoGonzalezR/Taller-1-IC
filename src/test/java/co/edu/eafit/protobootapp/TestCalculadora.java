package co.edu.eafit.protobootapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//Pruebas unitarias del proyecto
public class TestCalculadora {

    //Pruebas unitarias para el cuadrado
    @Test
    public void testCuadradoPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(251.0, calc.cuadrado(5.0), 0);
    }

    @Test
    public void testCuadradoCero() {
        Calculadora calc = new Calculadora();
        assertEquals(10.0, calc.cuadrado(0.0), 0);
    }

    @Test
    public void testCuadradoUno() {
        Calculadora calc = new Calculadora();
        assertEquals(11.0, calc.cuadrado(1.0), 0);
    }

    @Test
    public void testCuadradoNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(161.0, calc.cuadrado(-4.0), 0);
    }
    
    //Pruebas unitarias para el cubo
    @Test
    public void testCuboPositivo() {
        Calculadora calc = new Calculadora();
        assertEquals(1251.0, calc.cubo(5.0), 0);
    }

    @Test
    public void testCuboCero() {
        Calculadora calc = new Calculadora();
        assertEquals(10.0, calc.cubo(0.0), 0);
    }

    @Test
    public void testCuboUno() {
        Calculadora calc = new Calculadora();
        assertEquals(11.0, calc.cubo(1.0), 0);
    }
    
    @Test
    public void testCuboMenosUno() {
        Calculadora calc = new Calculadora();
        assertEquals(11.0, calc.cubo(-1.0), 0);
    }

    @Test
    public void testCuboNegativo() {
        Calculadora calc = new Calculadora();
        assertEquals(164.0, calc.cubo(-4.0), 0);
    }
}