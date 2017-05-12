//Shanika Seales 5/2/17

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Bonus extends JFrame 
{
   private final int WINDOW_WIDTH = 300;  
   private final int WINDOW_HEIGHT = 150;
   private static DecimalFormat df2 = new DecimalFormat(".####");
   private JPanel panel;
   private JLabel quadA;
   private JLabel quadB;
   private JLabel quadC;
   private JTextField quadAField;
   private JTextField quadBField;
   private JTextField quadCField;
   private JButton calcButton;

   
   public Bonus()
   {
      setTitle("The Quadratic Equation");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      Quad();
      add(panel);
      setLayout(new GridLayout(1, 7));
      setVisible(true);     
   }
   
   public void Quad()
   {
      quadA = new JLabel("Enter a number for A    ");
      quadAField = new JTextField(10);

      quadB = new JLabel("Enter a number for B    ");
      quadBField = new JTextField(10);
      
      quadC = new JLabel("Enter a number for C    ");
      quadCField = new JTextField(10);
      
      calcButton = new JButton("Calculate");
      
      calcButton.addActionListener(new CalcButtonL());
      
      panel = new JPanel();
      
      panel.add(quadA);
      panel.add(quadAField);
      panel.add(quadB);
      panel.add(quadBField);
      panel.add(quadC);     
      panel.add(quadCField);
      panel.add(calcButton);

   }
   
   private class CalcButtonL implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String Astr, Bstr, Cstr;  
         double disc, TotalX1, TotalX2;
         int a, b, c; 
         
         Astr = quadAField.getText();
         Bstr = quadBField.getText();
         Cstr = quadCField.getText();
         
         a = Integer.parseInt(Astr);
         b = Integer.parseInt(Bstr);
         c = Integer.parseInt(Cstr);
         
         disc = Math.sqrt(b*b-4*a*c);
         
         TotalX1 = (-(b)+disc/(2*a));
         TotalX2 = (-(b)-disc/(2*a));
         
         if(disc >= 0)
         {
            JOptionPane.showMessageDialog(null, a+"x^2 + "+b+"x + "+c+" = "+disc+"\nX1 = "+df2.format(TotalX1)+"\nX2 = "+df2.format(TotalX2));
         }
         else
         {
            JOptionPane.showMessageDialog(null, a+"x^2 + "+b+"x + "+c+" = "+disc+"\nX1 = "+TotalX1+"i\nX2 = "+TotalX2+"i");
         }
      }
   } 
   
   public static void main(String[] args)
   {   
       Bonus wind = new Bonus();
   }
}