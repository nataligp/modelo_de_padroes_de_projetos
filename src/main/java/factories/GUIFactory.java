/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import button.Button;
import checkbox.Checkbox;
        
public interface GUIFactory {
    Button createButton();    
    Checkbox createCheckbox();    
}
//criação da interface GUIFactory com os métodos create
