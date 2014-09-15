/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package orchard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author seaadmin
 */
public class MyActionListener implements ActionListener{
    private final String panel;
    
    public MyActionListener(String frame){
        panel = frame;
    }
    
    
    public void actionPerformed(ActionEvent e) {
        
        if(panel.equals("MainFrame")){
            
        }
        
        else if(panel.equals("NewTransformation")){
            
        }
        
        else if(panel.equals("TransformationInfo")){
            
        }
        
        else if(panel.equals("GeneInfo")){
            
        }
        
        else{
            System.out.println("Not supported");
        }
        
    
    }
    
}
