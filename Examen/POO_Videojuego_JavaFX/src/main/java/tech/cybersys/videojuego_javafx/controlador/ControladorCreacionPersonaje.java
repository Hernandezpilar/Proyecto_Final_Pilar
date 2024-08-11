package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import tech.cybersys.videojuego_javafx.modelo.Builder.AgricultorBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.SoldadoBuilder;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;

import java.io.IOException;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;
    @FXML private TextField CampoSalud;
    @FXML private TextField CampoFuerza;
    @FXML private TextField CampoInteligencia;
    @FXML private TextField CampoDinero;
    @FXML private Button BotonCrearPersonaje;

    Personaje PersonajeGuardado;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        String historia ="Un astuto comerciante, nacido en el bullicioso puerto de Marvella. " +
                "Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. " +
                "Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de " +
                "objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, " +
                "desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento " +
                "y recursos son invaluables para cualquier aventurero que cruce su camino.";
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje comerciante = new Personaje.Builder()
                    .setClase("Comerciante")
                    .setFuerza("50")
                    .setHistoria(historia)
                    .setInteligencia("55")
                    .setSalud("200")
                    .setNombre("Carlos")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = comerciante;

            CampoHistoria.setText(comerciante.getHistoria());
            CampoSalud.setText(comerciante.getSalud());
            CampoFuerza.setText(comerciante.getFuerza());
            CampoDinero.setText(comerciante.getDinero());
            CampoInteligencia.setText(comerciante.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosAgricultor() throws IOException {
        String historia = "Un dedicado agricultor de las tierras fértiles de Verdevalle. " +
                "Desde niño, aprendió a cultivar la tierra de sus padres, quienes le enseñaron " +
                "el valor del trabajo duro y la paciencia. Conoce los secretos de la naturaleza y " +
                "sabe cómo hacer que incluso los suelos más áridos florezcan. Su vida es tranquila, " +
                "pero su conocimiento de las plantas y su habilidad para cultivar alimentos son cruciales " +
                "para la supervivencia de su comunidad.";
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje agricultor = new Personaje.Builder()
                    .setClase("Agricultor")
                    .setFuerza("60")
                    .setHistoria(historia)
                    .setInteligencia("80")
                    .setSalud("70")
                    .setNombre(CampoNombre.getText())
                    .build();
            PersonajeGuardado = agricultor;

            CampoHistoria.setText(agricultor.getHistoria());
            CampoSalud.setText(agricultor.getSalud());
            CampoFuerza.setText(agricultor.getFuerza());
            CampoInteligencia.setText(agricultor.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosSoldado() throws IOException {
        String historia = "Un valiente soldado, entrenado en las duras tierras de Rocafuerte. " +
                "Desde joven, se preparó para la batalla bajo la tutela de los mejores guerreros " +
                "del reino. Es un maestro en el manejo de la espada y un estratega nato. " +
                "A lo largo de su vida, ha participado en numerosas batallas, protegiendo a su " +
                "tierra y a su gente de innumerables amenazas. Su honor y lealtad son inquebrantables, " +
                "y su presencia en el campo de batalla inspira a sus compañeros.";
        if(CampoNombre.getText().equals("")){
            EtiquetaErrorNombre.setVisible(true);
        }else{
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje soldado = new Personaje.Builder()
                    .setClase("Soldado")
                    .setFuerza("90")
                    .setHistoria(historia)
                    .setInteligencia("60")
                    .setSalud("100")
                    .setNombre(CampoNombre.getText())
                    .build();
            PersonajeGuardado = soldado;

            CampoHistoria.setText(soldado.getHistoria());
            CampoSalud.setText(soldado.getSalud());
            CampoFuerza.setText(soldado.getFuerza());
            CampoInteligencia.setText(soldado.getInteligencia());
        }
    }

    @FXML
    public void CrearPersonaje(ActionEvent event) throws IOException {
        PersonajeDAO personajeDAO = new PersonajeDAOImpl();
        personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
    }

    @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        Personaje personaje1;
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        personaje1 = personajedao.cargarPersonaje(nombre);
    }
}
