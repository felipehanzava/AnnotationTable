package br.com.ebac.hz.annotation;

import java.lang.annotation.Annotation;

public class AppReflection {

    public static void main(String args[]) {

    lerAnnotation();

    }

    private static void lerAnnotation() {
        System.out.println("** Annotation **");
        Anotacao anotacao = new Anotacao();
        Annotation [] annotations = anotacao.getClass().getAnnotations();
        for (Annotation an: annotations){
            System.out.println("Annotation   " + an.annotationType());

        }

        if (anotacao.getClass().isAnnotationPresent(Tabela.class)){
            Tabela tabela = anotacao.getClass().getAnnotation(Tabela.class);
            System.out.println("Nome da Anotação: " + tabela.getClass().getName());
            System.out.println("Valor da Anotação:  " + tabela.value());
        }

    }
}
