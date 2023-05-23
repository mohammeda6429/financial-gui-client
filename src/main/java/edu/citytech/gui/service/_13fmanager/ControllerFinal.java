package edu.citytech.gui.service._13fmanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;
import static edu.citytech.gui.service._13fmanager._CProjectService.*;


public class ControllerFinal implements Initializable {
    @FXML
    private TextField tfSalary;
    @FXML
    private ToggleGroup clickButtonC;
    @FXML
    private ToggleGroup buttonClickC;
    @FXML
    private Text finalText;
    String title2;

    static final String title = "The entire tax liability for this individual would be 29,835.50.";
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void submitButton(ActionEvent event) {
        String first = clickButtonC.getSelectedToggle().getUserData().toString();
        String second = buttonClickC.getSelectedToggle().getUserData().toString();
        int secondConvert = Integer.parseInt(second);
        double three = Double.parseDouble(tfSalary.getText());
        String result = String.valueOf(getReturn(first,three, secondConvert));
        title2 = title.replace("29,835.50",result);
        finalText.setText(title2);
    }
}
