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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;

import javafx.stage.Stage;

/**
 * This class is an implementation from the View interface using a window.
 *
 * @author Nerea
 */
public class JavaFXViewImplementation extends javafx.application.Application implements View {

    @FXML
    private Text text;

    private Stage stage;
    private static final Logger LOGGER = Logger.getLogger("package view.JavaFXViewImplementation");
    private static String greeting;

    /**
     *
     * @param greeting
     */
    @Override
    public void showGreeting(String greeting) {
        this.greeting = greeting;
        launch(greeting);
    }

    /**
     * This method initialize the Hello Word Window and shows the window.
     *
     * @param stage The stage that the window use to be shown.
     */
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("HelloWorldWindow.fxml"));
            Parent root = (Parent) loader.load();
            //Get the controller from the window
            JavaFXViewImplementation controller = (JavaFXViewImplementation) loader.getController();
            LOGGER.info("Initializing hello world window");
            //Creates an scene
            Scene scene = new Scene(root);
            //Establishes an scene
            stage.setScene(scene);
            //Window title
            stage.setTitle("HelloWorldWindow");
            //Not resizable window
            stage.setResizable(false);
            controller.text.setText(greeting);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXViewImplementation.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
