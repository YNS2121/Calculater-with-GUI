
package Gui_project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculaterCode extends JFrame {
    
    private JButton b1,b2;
    JTextField tf1,tf2;
    JLabel l;
    int s1,s2;
    
    public CalculaterCode(){
    b1=new JButton("Addition");
    b1=new JButton("Subtraction");
    tf1= new JTextField(10);
    tf1= new JTextField(10);
    l= new JLabel("Result");
    setLayout(new GridLayout(3,2));
    add(tf1);add(tf2);add(b1);add(b2);add(l);
    b1.addActionListener(new b1listen());
    b2.addActionListener(new b2listen());
    }
    
    public static void main(String[] args) {
        CalculaterCode c = new CalculaterCode();
        c.setVisible(true);
        c.setDefaultCloseOperation(EXIT_ON_CLOSE);
        c.setSize(200,200);
        
    }
    private class b1listen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
        s1=Integer.parseInt(tf1.getText());
        s2=Integer.parseInt(tf2.getText());
        l.setText("RESULT:" + (s1+s2));
        }
    }
    private class b2listen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
        s1=Integer.parseInt(tf1.getText());
        s2=Integer.parseInt(tf2.getText());
        l.setText("RESULT:" + (s1-s2));
        }
    }
}


