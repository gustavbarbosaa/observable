package br.edu.catolica.es.principal;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Canal {
    private List<ConcreteAssinante> assinantes;
    private String titulo;

    public Canal() {
        this.assinantes = new ArrayList<>();
    }

    public void addAssinantes(List<ConcreteAssinante> assinantes) {
        this.assinantes = assinantes;
    }

    public void removeAssinantes(ConcreteAssinante concreteAssinante) {
        this.assinantes.remove(concreteAssinante);
    }

    public void notificationAssinantes() {
        this.assinantes.forEach(ConcreteAssinante::update);
    }

    public void upload(String titulo) {
        this.titulo = titulo;
        notificationAssinantes();
    }
}
