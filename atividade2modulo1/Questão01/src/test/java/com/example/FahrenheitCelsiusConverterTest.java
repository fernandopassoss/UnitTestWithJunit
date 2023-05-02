package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.security.InvalidAlgorithmParameterException;

import org.junit.jupiter.api.Test;

public class FahrenheitCelsiusConverterTest {

    FahrenheitCelsiusConverter FahrenheitCelsiusConverter = new FahrenheitCelsiusConverter ();
   
    @Test
    public void shouldConvertCelciusToFahrenheit() throws InvalidAlgorithmParameterException {
    assertEquals(32, FahrenheitCelsiusConverter.toFahrenheit(0));
    assertEquals(98, FahrenheitCelsiusConverter.toFahrenheit(37));
    assertEquals(212, FahrenheitCelsiusConverter.toFahrenheit(100));

    }
    @Test
    public void shouldConvertFahrenheitToCelcius() throws InvalidAlgorithmParameterException {
    assertEquals(0, FahrenheitCelsiusConverter.toCelsius(32));
    assertEquals(37, FahrenheitCelsiusConverter.toCelsius(100));
    assertEquals(100, FahrenheitCelsiusConverter.toCelsius(212));
    }
}
