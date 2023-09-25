/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import interfaces.View;
import java.io.IOException;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
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

    private static final Logger LOGGER = Logger.getLogger("package view.JavaFXViewImplementation");
    private static String greeting;

    /**
     * Makes the greeting static and lunchs the class to do the start method.
     *
     * @param greeting the message from the factory
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
            stage.setTitle("Hello World Window");
            //Not resizable window
            stage.setResizable(false);
            controller.text.setText(greeting);
            stage.setOnCloseRequest(this::handleOnActionExit);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXViewImplementation.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    /**
     * Exit button event handler.
     *
     * @param event An ActionEvent object.
     */
    public void handleOnActionExit(Event event) {
        try {
            //Ask user for confirmation on exit
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "¿Are you sure you want to exit?",
                    ButtonType.OK, ButtonType.CANCEL);
            Optional<ButtonType> result = alert.showAndWait();
            //If OK to exit
            if (result.isPresent() && result.get() == ButtonType.OK) {
                Platform.exit();
            } else {
                event.consume();
            }
        } catch (Exception e) {
            String errorMsg = "Error exiting application:" + e.getMessage();
            Alert alert = new Alert(Alert.AlertType.ERROR, errorMsg, ButtonType.OK);
            alert.showAndWait();
            LOGGER.log(Level.SEVERE, errorMsg);
        }
    }

}
