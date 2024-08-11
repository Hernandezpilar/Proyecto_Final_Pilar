package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class AgricultorBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public AgricultorBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un dedicado agricultor de las tierras fértiles de Verdevalle. " +
                "Desde niño, aprendió a cultivar la tierra de sus padres, quienes le enseñaron " +
                "el valor del trabajo duro y la paciencia. Conoce los secretos de la naturaleza y " +
                "sabe cómo hacer que incluso los suelos más áridos florezcan. Su vida es tranquila, " +
                "pero su conocimiento de las plantas y su habilidad para cultivar alimentos son cruciales " +
                "para la supervivencia de su comunidad.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("70");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("60");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("80");
    }

    @Override
    public void buildClase() {
        builder.setClase("Agricultor");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
