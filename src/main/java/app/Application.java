/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class Application {
    private Button button;
    private Checkbox checkbox;
    
    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
;