package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    @Test
    void testConverterDataNas(){
        Funcionario funcionario = new Funcionario(); 
        assertEquals(20, funcionario.converterDataNas(28, 8, 2002));
        assertEquals(21, funcionario.converterDataNas(24, 4, 2002));
        assertEquals(22, funcionario.converterDataNas(28, 8, 2000));
        
    }

    @Test
    void testGetBonificacao(){
        Funcionario funcionario = new Funcionario();
        assertEquals(240, funcionario.getBonificacao(1000));
        assertEquals(1248, funcionario.getBonificacao(5200));
        assertEquals(1679.76, funcionario.getBonificacao(6999));
    }   
    

    
    @Test
    void testConverterDataNasAll() {
        Funcionario f = new Funcionario();
        assertEquals(21, f.converterDataNas(1, 1, 2002));
    }
    
    @Test
    void testCalcSalario() {
        Funcionario f = new Funcionario();
        assertAll("salario",
            () -> {
                f.calcSalario(2000.0);
                assertEquals(1660.0, f.getSalarioBruto(), 0.01);
            },
            () -> {
                f.calcSalario(4000.0);
                assertEquals(2920.0, f.getSalarioBruto(), 0.01);
            }
        );
    }
}
