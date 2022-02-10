package br.com.ebac.hz.annotation;


import java.lang.annotation.RetentionPolicy;

@ExemploAnotacao(value = 1, nomes = {"Felipe"},
                 value2 = {RetentionPolicy.RUNTIME},
                 value3 = RetentionPolicy.RUNTIME)
public class UsandoAnotacao {


}
