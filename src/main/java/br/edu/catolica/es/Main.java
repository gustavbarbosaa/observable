package br.edu.catolica.es;

import br.edu.catolica.es.principal.Canal;
import br.edu.catolica.es.principal.ConcreteAssinante;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var canal = new Canal();

        var listaAssinantes = new ArrayList<ConcreteAssinante>();
        listaAssinantes.add(new ConcreteAssinante("Francisco"));
        listaAssinantes.add(new ConcreteAssinante("Heitor"));
        listaAssinantes.add(new ConcreteAssinante("Carlos Cesar"));
        listaAssinantes.add(new ConcreteAssinante("Kelvin"));
        listaAssinantes.add(new ConcreteAssinante("Marcelo"));

        canal.addAssinantes(listaAssinantes);

        listaAssinantes.forEach(concreteAssinante -> {
            concreteAssinante.assinarCanal(canal);
        });

        canal.removeAssinantes(listaAssinantes.get(1));

        canal.upload("Fui estudar java e olha no deu!");
    }
}