package tech.cybersys.videojuego_javafx.modelo;

import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.AgricultorBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.SoldadoBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;

public class Director {
    private PersonajeBuilder builder;

    public void setBuilder(PersonajeBuilder builder) {
        this.builder = builder;
    }

    public Personaje construirComerciante(String nombre) {
        setBuilder(new ComercianteBuilder());
        builder.buildNombre(nombre);
        builder.buildHistoria();
        builder.buildSalud();
        builder.buildFuerza();
        builder.buildInteligencia();
        builder.buildClase();
        return builder.getPersonaje();
    }

    public Personaje construirAgricultor(String nombre) {
        setBuilder(new AgricultorBuilder());
        builder.buildNombre(nombre);
        builder.buildHistoria();
        builder.buildSalud();
        builder.buildFuerza();
        builder.buildInteligencia();
        builder.buildClase();
        return builder.getPersonaje();
    }

    public Personaje construirSoldado(String nombre) {
        setBuilder(new SoldadoBuilder());
        builder.buildNombre(nombre);
        builder.buildHistoria();
        builder.buildSalud();
        builder.buildFuerza();
        builder.buildInteligencia();
        builder.buildClase();
        return builder.getPersonaje();
    }
}
