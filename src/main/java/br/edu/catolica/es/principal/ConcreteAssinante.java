package br.edu.catolica.es.principal;

import br.edu.catolica.es.interfaces.Assinante;

public class ConcreteAssinante implements Assinante {

    private String nome;
    private Canal canal;

    public ConcreteAssinante(String nome) {
        this.nome = nome;
    }

    public void assinarCanal(Canal canal) {
        this.canal = canal;
    }

    @Override
    public void update() {
        System.out.println(nome + ", um novo video foi postado no canal! " + canal.getTitulo());
    }
}
