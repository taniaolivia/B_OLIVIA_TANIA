/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b_olivia_tania.model;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author rchampag
 */
public class Person {
    private PersonState itsState;
    private int itsUpdate;
    private Rectangle itsAvatar;
    public Person(){
        itsState = PersonState.SUSCEPTIBLE;
        itsUpdate = 0;
    }
    public void updateState(PersonState aNewState, int aDate){
        itsState = aNewState;
        itsUpdate = aDate;
    }
    public int getUpdate(){
        return itsUpdate;
    }
    public PersonState getState(){
        return itsState;
    }
    public void draw(){
        // TODO add your code here
        if (itsState== PersonState.SUSCEPTIBLE)
        {
            itsAvatar.setFill(Color.WHITE);
            
        }
        if (itsState == PersonState.INCUBATION)
        {
            itsAvatar.setFill(Color.ORANGE);
                   
        }
        if (itsState == PersonState.INFECTED)
        {
            itsAvatar.setFill(Color.RED);
                   
        }
        if (itsState == PersonState.RECOVER)
        {
            itsAvatar.setFill(Color.GREEN);   
            
        }
    }
    public void setAvatar(Rectangle anAvatar){
        // TODO add your code here
        if (itsState== PersonState.SUSCEPTIBLE)
        {
            anAvatar.setFill(Color.WHITE);
            anAvatar.setWidth(6);
            anAvatar.setHeight(6);
        }
        if (itsState == PersonState.INCUBATION)
        {
            anAvatar.setFill(Color.ORANGE);
            anAvatar.setWidth(6);
            anAvatar.setHeight(6);        
        }
        if (itsState == PersonState.INFECTED)
        {
            anAvatar.setFill(Color.RED);
            anAvatar.setWidth(6);
            anAvatar.setHeight(6);        
        }
        if (itsState == PersonState.RECOVER)
        {
            anAvatar.setFill(Color.GREEN);   
            anAvatar.setWidth(6);
            anAvatar.setHeight(6);
        }
    }
    
    public boolean isInIncubation(){
        return itsState == PersonState.INCUBATION;
    }
}
