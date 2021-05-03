import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="Calculator.class" width="350" height="400">
</applet>
*/
public class Calculator extends Applet implements ActionListener
{ 
    int i;
    float a,b,c;
    String s="";
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    TextField tf;
    Font f1;
    public void init()
    {
        f1=new Font("Arial",Font.BOLD,25); 
        tf=new TextField();
        tf.setBounds(40,20,260,50);
        b1=new Button("1");
        b1.setBounds(40,280,50,50);
        b1.setBackground(Color.LIGHT_GRAY);
        b2=new Button("2");
        b2.setBounds(110,280,50,50);
        b2.setBackground(Color.LIGHT_GRAY);
        b3=new Button("3");
        b3.setBounds(180,280,50,50);
        b3.setBackground(Color.LIGHT_GRAY);
        b4=new Button("4");
        b4.setBounds(40,220,50,50);
        b4.setBackground(Color.LIGHT_GRAY);
        b5=new Button("5");
        b5.setBounds(110,220,50,50);
        b5.setBackground(Color.LIGHT_GRAY);
        b6=new Button("6");
        b6.setBounds(180,220,50,50);
        b6.setBackground(Color.LIGHT_GRAY);
        b7=new Button("7");
        b7.setBounds(40,160,50,50);
        b7.setBackground(Color.LIGHT_GRAY);
        b8=new Button("8");
        b8.setBounds(110,160,50,50);
        b8.setBackground(Color.LIGHT_GRAY);
        b9=new Button("9");
        b9.setBounds(180,160,50,50);
        b9.setBackground(Color.LIGHT_GRAY);
        b10=new Button("0");
        b10.setBounds(40,340,50,50);
        b10.setBackground(Color.LIGHT_GRAY);
        b11=new Button("+");
        b11.setBounds(250,280,50,110);
        b11.setBackground(Color.LIGHT_GRAY);
        b12=new Button("-");
        b12.setBounds(250,220,50,50);
        b12.setBackground(Color.LIGHT_GRAY);
        b13=new Button("*");
        b13.setBounds(250,160,50,50);
        b13.setBackground(Color.LIGHT_GRAY);
        b14=new Button("/");
        b14.setBounds(250,100,50,50);
        b14.setBackground(Color.LIGHT_GRAY);
        b15=new Button("=");
        b15.setBounds(180,340,50,50);
        b15.setBackground(Color.LIGHT_GRAY);
        b16=new Button("AC");
        b16.setBounds(40,100,190,50);
        b16.setBackground(Color.LIGHT_GRAY);
        b17=new Button(".");
        b17.setBounds(110,340,50,50);
        b17.setBackground(Color.LIGHT_GRAY);
        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(tf);add(b11);add(b12);add(b13);add(b14);add(b15);add(b16);add(b17);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setForeground(Color.red);
        tf.setFont(f1);
        if(e.getSource()==b1)
        {
            s+="1";
            tf.setText(s);
        }
        else if(e.getSource()==b2)
        {
            s+="2";
            tf.setText(s);
        }
        else if(e.getSource()==b3)
        {
            s+="3";
            tf.setText(s);
        }
        else if(e.getSource()==b4)
        {
            s+="4";
            tf.setText(s);
        }
        else if(e.getSource()==b5)
        {
            s+="5";
            tf.setText(s);
        }
        else if(e.getSource()==b6)
        {
            s+="6";
            tf.setText(s);
        }
        else if(e.getSource()==b7)
        {
            s+="7";
            tf.setText(s);
        }
        else if(e.getSource()==b8)
        {
            s+="8";
            tf.setText(s);
        }
        else if(e.getSource()==b9)
        {
            s+="9";
            tf.setText(s);
        }
        else if(e.getSource()==b10)
        {
            s+="0";
            tf.setText(s);
        }
        else if(e.getSource()==b11)
        {
            if (s == "") {
                i=1;
                a=c;
                tf.setText("");
            }
            else
            { 
            i=1;
            a=Float.parseFloat(s);
            tf.setText("");
            s="";
            }
        }
        else if(e.getSource()==b12)
        {
            if (s == "") {
                i=2;
                a=c;
                tf.setText("");
            }
            else
            { 
                i=2;
                a=Float.parseFloat(s);
                tf.setText("");
                s="";
            }
            
        }
        else if(e.getSource()==b13)
        {
            if (s == "") {
                i=3;
                a=c;
                tf.setText("");
            }
            else
            { 
                i=3;
                a=Float.parseFloat(s);
                tf.setText("");
                s="";
            }
        }
        else if(e.getSource()==b14)
        {
            if (s == "") {
                i=4;
                a=c;
                tf.setText("");
            }
            else
            { 
                i=4;
                a=Float.parseFloat(s);
                tf.setText("");
                s="";
            }
        }
        else if(e.getSource()==b15)
        {
            b=Float.parseFloat(s);
            tf.setText("");
            
            if(i==1)
            {
                c=a+b;
            }
            else if(i==2)
            {
                c=a-b;
            }
            else if(i==3)
            {
                c=a*b;
            }
            else if(i==4)
            {
                c=a/b;
            }
            s="";
            tf.setText(String.valueOf(c));
        }
        else if(e.getSource()==b16)
        {
            tf.setText("");
            s="";
        }
        else if(e.getSource()==b17)
        { 
            s+=".";
            tf.setText(s);
        }
    }
}