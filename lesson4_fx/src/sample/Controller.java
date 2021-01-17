package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;



public class Controller {

    @FXML
    private TextField textField;

    @FXML
    private TextArea textArea;

    @FXML
    public void clickBtnSend(ActionEvent actionEvent) {
        textArea.appendText(" * " + textField.getText() + "\n");
        textField.clear();
        textField.requestFocus();

    }
}