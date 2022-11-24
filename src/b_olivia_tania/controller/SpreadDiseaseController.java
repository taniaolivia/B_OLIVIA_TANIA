/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_olivia_tania.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import b_olivia_tania.model.Disease;
import java.util.Timer;
import java.util.TimerTask;
import javafx.application.Platform;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import b_olivia_tania.model.Person;
import javafx.scene.control.Button;

/**
 *
 * @author taniaolivia
 */
public class SpreadDiseaseController implements Initializable {
    
    @FXML
    private int itsDate;
    private Timer itsTimer;
    private boolean itsTriggerTime;
    private Person person;
    
    @FXML
    private AnchorPane apAnchor;
    
    @FXML
    private Rectangle rectangle;
    
    @FXML
    private Label ITransmissionRate;
    private Label IDaysIncubation;
    private Label IDaysWithSymptoms;
    private Slider sTransmissionRate;
    private Slider sDaysIncubation;
    private Slider sDaysWithSymptoms;
    private Disease disease;
    private Button demarrer;
    private Button arreter;
    private Button pasAPas;      
    
    
    @FXML
    public void stepByStep(ActionEvent event) {
      if(pasAPas.isPressed())
      {
        
      }
    }
    
    @FXML
    private void start(ActionEvent event) {
      if(demarrer.isPressed())
      {
          
      }
    }
    
    @FXML
    private void stop(ActionEvent event) {
      if(arreter.isPressed())
      {
        itsTimer.cancel();
      }
    }
    
    @FXML
    private void stop() {
      itsTimer.cancel();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        disease.getDaysInIncubation();
                        disease.draw();
                    }
                });
            };
        };
        
        itsTimer = new Timer();
        itsTimer.schedule(timerTask, 0, 10);
        
       
    }    
    
}
