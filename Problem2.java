//Shanika Seales 5/2/17

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Problem2 extends JFrame 
{
   private final int WINDOW_WIDTH = 400;  
   private final int WINDOW_HEIGHT = 600;
   private static Random rand = new Random();
   private JPanel bottompanel;
   private JPanel toppanel;
   private JLabel user;
   private JTextField userField;
   private JButton calcButton;
   private int num1 = 1 + rand.nextInt(20);
   private int num2 = 1 + rand.nextInt(20);
   private ImageIcon pic1;
   private ImageIcon pic2;
   private int count = 0;
   private ImageIcon pic3;
   private ImageIcon pic4;
   private int score = 0;
   
   public Problem2()
   {
      setTitle("The Quadratic Equation");
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
      P();
      setLayout(new GridLayout(2, 1));
      add(toppanel);
      add(bottompanel);
      setVisible(true);     
   }
   
   public void P()
   { 
      user = new JLabel(num1+" + " +num2+ " = ");
      userField = new JTextField(10);
      
      calcButton = new JButton("Solve");
      
      calcButton.addActionListener(new CalcButtonL());
     
      toppanel = new JPanel();
      bottompanel = new JPanel();
      
      toppanel.add(user);
      toppanel.add(userField);
      toppanel.add(calcButton);
      
      pic1 = new ImageIcon("x mark.png");
      pic2 = new ImageIcon("check mark.png");
      pic3 = new ImageIcon("sad-face.png");
      pic4 = new ImageIcon("th.jpeg");
   }
   
   private class CalcButtonL implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String u1str;  
         int u1, ans; 
         
         count++;
         
         u1str = userField.getText();
         u1 = Integer.parseInt(u1str);
         
         ans = num1 +num2;

         if(ans == u1)
         {
            bottompanel.add(new JLabel(pic2));
            score++;
         }
         else
         {
            bottompanel.add(new JLabel(pic1));
         } 

         num1 = 1 + rand.nextInt(20);
         num2 = 1 + rand.nextInt(20);
         user.setText(num1+" + " +num2+ " = ");
         
         if(count >= 10)
         {
            if(score >=6)
            {
               bottompanel.add(new JLabel(pic4));
            }
            else
            {
               bottompanel.add(new JLabel(pic3));
            }
         }
      }
   } 
   
   public static void main(String[] args)
   {   
       Problem2 p2 = new Problem2();
   }
}