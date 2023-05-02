package com.example;
import java.security.InvalidAlgorithmParameterException;
public class FahrenheitCelsiusConverter{

    public double toFahrenheit(double num) throws InvalidAlgorithmParameterException{
        if (num<(-273.15)){
            throw new InvalidAlgorithmParameterException("Entrada Inválida");
        }
        num = num*1.8;
        num += 32;
        return num;
    }

    public double toCelsius(double num) throws InvalidAlgorithmParameterException{
        if(num<(-459.67)){
            throw new InvalidAlgorithmParameterException("Entrada inválida");
        }
        num = num-32;
        num = num/1.8;
        return num;
    }

}
