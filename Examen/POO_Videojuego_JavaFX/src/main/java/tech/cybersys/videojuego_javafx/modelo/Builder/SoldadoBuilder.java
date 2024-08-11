package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class SoldadoBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public SoldadoBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un valiente soldado, entrenado en las duras tierras de Rocafuerte. " +
                "Desde joven, se preparó para la batalla bajo la tutela de los mejores guerreros " +
                "del reino. Es un maestro en el manejo de la espada y un estratega nato. " +
                "A lo largo de su vida, ha participado en numerosas batallas, protegiendo a su " +
                "tierra y a su gente de innumerables amenazas. Su honor y lealtad son inquebrantables, " +
                "y su presencia en el campo de batalla inspira a sus compañeros.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("100");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("90");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("60");
    }

    @Override
    public void buildClase() {
        builder.setClase("Soldado");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
