package edu.citytech.gui.service._13fmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Date;

public class _13FManagersPieChartMain extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/_13fManagerPieChartView.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("13F Managers, by Mohammed Amin" + new Date());
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }
}

//edu.citytech.gui.service._13fmanager._13FManagersPieChartController
