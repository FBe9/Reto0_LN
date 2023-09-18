/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.View;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * This class is an implementation from the View interface using a window.
 *
 * @author Nerea
 */
public class JavaFXViewImplementation implements View {

    private Stage stage;
    private static final Logger LOGGER = Logger.getLogger("package view.JavaFXViewImplementation");

    /**
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {

    }

    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("view/HelloWorldWindow.fxml"));
            Parent root = (Parent) loader.load();
            LOGGER.info("Initializing SignIn window");
            //Creates an scene
            Scene scene = new Scene(root);
            //Establishes an scene
            stage.setScene(scene);
            //Window title
            stage.setTitle("HelloWorldWindow");
            //Not resizable window
            stage.setResizable(false);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXViewImplementation.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
