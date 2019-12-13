/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;
import javax.swing.JOptionPane;
/**
 *
 * @author jasonshi
 */
public class Player {
    
    String name;
    int cm;
    int kg; 
    
    
    public void 輸入(){
    String nameString;
    String cmString;
    String kgString;
    double bmi;
    
    nameString=JOptionPane.showInputDialog("name");
    cmString=JOptionPane.showInputDialog("cm");
    kgString=JOptionPane.showInputDialog("kg");
  
    this.name=nameString;
    this.cm=Integer.parseInt(cmString);
    this.kg=Integer.parseInt(kgString);
    
    }
    
   
    
    
    public void 顯示(){
    
     double bmi=this.kg/Math.pow((this.cm)/100,2);
    
    
        System.out.println("姓名:"+this.name);
         System.out.println("\t");
          System.out.println("身高:"+this.cm);
           System.out.println("\t");
            System.out.println("體重:"+this.kg);
             System.out.println("\t");
              System.out.println("BMI:"+bmi);
               System.out.println("\t");
    }
    
    
}
