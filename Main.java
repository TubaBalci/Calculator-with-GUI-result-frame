package Try;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame implements ActionListener{

    private String ekran="";
    private double a=0,b=0,  result= 0;
    private char islem =' ';
    private boolean elde=true, ondalik= false , esit=false;
    private int yo;
    public Main() {

        setSize(800, 1000);
        this.setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        String f="789+456-123x0.=÷";

        for (int i=0;i<16;i++)
        {
            int x=i%4,y=i/4;
            JButton tus = new JButton(f.charAt(i)+"");
            tus.setBounds(x*200+20,y*150+250+10,150,105);
            tus.setFont(new Font("Arial", Font.PLAIN, 40));
            tus.setForeground(Color.white);
            tus.addActionListener(this);
            tus.setBackground(new Color(70,97,232));

            add(tus);
            tus.setVisible(true);
        }

        JButton tus = new JButton("C");
        tus.setBounds(20,140,750,100);
        tus.setFont(new Font("Arial", Font.PLAIN, 40));
        tus.setForeground(Color.white);
        tus.addActionListener(this);
        tus.setBackground(new Color(70,97,232));
        add(tus);
        tus.setVisible(true);
        setVisible(true);
    }

    public static void main(String []args){
        new Main();
    }

    public void paint(Graphics g) {
        super.paint(g);
        int xo = 0;
        g.clearRect(0, 30, 800, 150);
        g.drawRect(8,35,782,120);


        for (int i=0;i<ekran.length();i++){
            char no = ekran.charAt(i);
            switch (no) {
                case '0':
                    g.fillRect(xo * 80 + 11, 45, 2, 100);//sol
                    g.fillRect(xo * 80 + 68, 45, 3, 100);//sag
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;

                case '1':
                    g.fillRect(xo * 80 + 40, 45, 3, 100);//=1
                    xo++;
                    break;

                case '2':
                    g.fillRect(xo * 80 + 11, 95, 2, 50);//sol alt
                    g.fillRect(xo * 80 + 68, 45, 3, 50);//sag ust
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;
                case '3':

                    g.fillRect(xo * 80 + 68, 45, 3, 100);//sag
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;
                case '4':
                    g.fillRect(xo * 80 + 11, 45, 2, 50);//sol ust
                    g.fillRect(xo * 80 + 68, 45, 3, 100);//sag
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    xo++;
                    break;
                case '5':
                    g.fillRect(xo * 80 + 11, 45, 2, 50);//sol ust
                    g.fillRect(xo * 80 + 68, 95, 3, 50);//sag alt
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;
                case '6':
                    g.fillRect(xo * 80 + 11, 45, 2, 100);//sol
                    g.fillRect(xo * 80 + 68, 95, 3, 50);//sag alt
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;
                case '7':
                    g.fillRect(xo * 80 + 68, 45, 3, 100);//sag
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    xo++;
                    break;
                case '8':
                    g.fillRect(xo * 80 + 11, 45, 2, 100);//sol
                    g.fillRect(xo * 80 + 68, 45, 3, 100);//sag
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;
                case '9':
                    g.fillRect(xo * 80 + 11, 45, 2, 50);//sol ust
                    g.fillRect(xo * 80 + 68, 45, 3, 100);//sag
                    g.fillRect(xo * 80 + 11, 45, 60, 2);//ust
                    g.fillRect(xo * 80 + 11, 95, 60, 2);//orta
                    g.fillRect(xo * 80 + 11, 145, 60, 2);//alt
                    xo++;
                    break;
                case '.':
                    g.fillRect(xo * 80-1 , 140, 4, 4);
                    break;
                case '-':
                    g.fillRect(xo * 80 + 30, 95, 30, 2);//orta
                    xo++;
                    break;
                default:
                    break;

            }
        }

    }

    public void actionPerformed(ActionEvent e) {
        char action_command = e.getActionCommand().charAt(0);
        if(Character.isDigit(action_command)&&esit)
        {a=0;b=0;elde = true;}
        if (action_command=='C')
        {
            ekran="";
            a=0;b=0;
            result= 0;
            elde=true;
            ondalik= false;
            esit=false;
        }
        else if (action_command=='.')
        {
            ondalik=true;
            ekran+=".";
            esit=false;
        }

        else if(Character.isDigit(action_command)) {
            if (elde) {
                if (ondalik)
                    a = a+ (double) Integer.parseInt("" + action_command)/10;
                else
                    a =a*10+ Integer.parseInt("" + action_command);
                if (a-(int)a==0)
                    ekran=""+(int)a;
                else
                    ekran=""+a;

            }
            else
            {
                if (ondalik)
                    b = b+ (double) Integer.parseInt("" + action_command)/10;
                else
                    b= b*10+ Integer.parseInt("" + action_command);
                if (b-(int)b==0)
                    ekran=""+(int)b;
                else
                    ekran=""+b;
            }
            esit=false;
        }
        else if(action_command!='=')
        {
            islem = action_command;
            elde = false;
            ondalik=false;
            esit=false;
        }

        else
        {
            switch (islem) {
                case '-' -> result = a - b;
                case '+' -> result = a + b;
                case '÷' -> result = a / b;
                case 'x' -> result = a * b;
                default -> {
                }
            }
            if (result-(int)result==0)
                ekran=""+(int)result;
            else

                ekran=""+result;
            a = result;
            b=0;
            elde=false;
            ondalik=false;
            islem=' ';
            esit=true;

        }

        repaint();
    }
}

