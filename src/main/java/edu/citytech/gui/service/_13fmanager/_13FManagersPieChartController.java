package edu.citytech.gui.service._13fmanager;

import javafx.beans.property.DoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ResourceBundle;

public class _13FManagersPieChartController implements Initializable {

    @FXML
    private Slider slLimit;

    @FXML
    private ToggleGroup tgDisplayGroup;

    @FXML
    private TextField txtLimit;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setupSlider();
    }

    private void setupSlider(){
        slLimit.valueProperty().addListener(e -> {
            var db = (DoubleProperty)e;
            txtLimit.setText((int)db.getValue().doubleValue() + "");

            System.out.println("Developer: Amin" + db.getValue());
        });
    }
}
