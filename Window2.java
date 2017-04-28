import javax.swing.*;
import java.awt.event.*;

public class Window2 extends JFrame 
{
   private final int WINDOW_WIDTH = 300;  
   private final int WINDOW_HEIGHT = 200;
   private JPanel panel;
   private JLabel tm;
   private JTextField tmField;
   private JLabel Vo;
   private JTextField VoField;
   private JButton calcButton;

   
   public Window2()
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
      
      Vo = new JLabel("Enter Vo              ");
      VoField = new JTextField(10);
      
      calcButton = new JButton("Calculate");
      
      calcButton.addActionListener(new CalcButtonL());
      
      panel = new JPanel();
      
      panel.add(tm);
      panel.add(tmField);
      panel.add(Vo);
      panel.add(VoField);
      panel.add(calcButton);

   }
   
   private class CalcButtonL implements ActionListener
   {
       
      public void actionPerformed(ActionEvent e)
      {
         String t, v;  
         double d, vTotal, tTotal; 
         
         t = tmField.getText();
         v = VoField.getText();
         vTotal = Double.parseDouble(v)*Double.parseDouble(t);     
         tTotal = 16*Double.parseDouble(t)*Double.parseDouble(t);
         d = vTotal - tTotal;      
         JOptionPane.showMessageDialog(null, vTotal +" - " +tTotal+" = " + d + " distance.");
      }
   } 
   
   public static void main(String[] args)
   {   
       Window2 wind = new Window2();
   }
}