import javax.swing.*;
import java.awt.event.*;

public class Window extends JFrame 
{
   private final int WINDOW_WIDTH = 300;  
   private final int WINDOW_HEIGHT = 150;
   private JPanel panel;             // To reference a panel
   private JLabel tm;      // To reference a label
   private JTextField tmField; // To reference a text field
   private JButton calcButton;       // To reference a button

   
   public Window()
   {
      setTitle("Time");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      time();
      add(panel);
      setVisible(true);     
   }
   
   public void time()
   {
      tm = new JLabel("Enter time in seconds");
      tmField = new JTextField(10);
      calcButton = new JButton("Calculate");
      calcButton.addActionListener(new CalcButtonL());
      panel = new JPanel();
      panel.add(tm);
       
      panel.add(tmField);
      panel.add(calcButton);

   }
   
   private class CalcButtonL implements ActionListener
   {
       
      public void actionPerformed(ActionEvent e)
      {
         String t;  
         double miles; 
         
         t = tmField.getText();        
         miles = 16*Double.parseDouble(t)*Double.parseDouble(t);      
         JOptionPane.showMessageDialog(null, t +" seconds converted into " + miles + " distance.");
      }
   } 
   
   public static void main(String[] args)
   {   
       Window wind = new Window();
   }
}