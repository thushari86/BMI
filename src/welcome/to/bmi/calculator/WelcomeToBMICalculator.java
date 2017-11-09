/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package welcome.to.bmi.calculator;

import javax.swing.JOptionPane;

/**
 *
 * @author anuradha
 */
public class WelcomeToBMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Weight;       
        String Height;
        double W;
        double H;
        
        
        
        JOptionPane.showMessageDialog(null,"Welcome to BMI Calculator" );
        Weight = JOptionPane.showInputDialog(null, "Enter Your Weight(kg)" );
        Height = JOptionPane.showInputDialog(null, "Enter Your Height(m)" );
        W = Double.valueOf(Weight);
        H = Double.valueOf(Height);
        
        double BMI = W /(H*H);
         JOptionPane.showMessageDialog(null,"Your BMI :"+ BMI +  " kg/m2");
         
        int x = (int)Math.round(BMI);
        
        JOptionPane.showMessageDialog(null,"Your BMI :"+ x +  " kg/m2");
        
        
       
}
}
