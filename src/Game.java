import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game {
    JFrame window;
    Container con;
    JPanel titleNamePanel,startbuttonpanel,mainTextPanel,choicebuttonpanel;
    JLabel titleNameLabel;
    Font titlefont=new Font("Times New Roman",Font.PLAIN,45);
    Font normalfont=new Font("Times New Roman",Font.PLAIN,30);
    JButton startbutton,choice1,choice2,choice3,choice4;
    JTextArea mainTextArea;
    TitleScreenHandler tsHandler = new TitleScreenHandler();
    public static void main(String[] args) {
        new Game();
        }
    public Game(){
        window = new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);

        con=window.getContentPane();

        titleNamePanel=new JPanel();
        titleNamePanel.setBounds(50,50,700,60);
        titleNamePanel.setBackground(Color.black);
        titleNameLabel=new JLabel("PETER'S BIZARRE ADVENTURES");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titlefont);

        startbuttonpanel=new JPanel();
        startbuttonpanel.setBounds(300,400,200,100);
        startbuttonpanel.setBackground(Color.black);

        startbutton=new JButton("START");
        startbutton.setBackground(Color.black);
        startbutton.setForeground(Color.black);
        startbutton.setFont(normalfont);
        startbutton.addActionListener(tsHandler);

        titleNamePanel.add(titleNameLabel);
        startbuttonpanel.add(startbutton);

        con.add(titleNamePanel);
        con.add(startbuttonpanel);

        window.setVisible(true);
    }
    public void createGameScreen(){
        titleNamePanel.setVisible(false);
        startbuttonpanel.setVisible(false);

        mainTextPanel=new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.black);
        con.add(mainTextPanel);

        mainTextArea=new JTextArea("This Is The Main Text Area");
        mainTextArea.setBounds(100,100,600,250);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setFont(normalfont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        choicebuttonpanel=new JPanel();
        choicebuttonpanel.setBounds(250,350,300,200);
        choicebuttonpanel.setBackground(Color.black);
        choicebuttonpanel.setLayout(new GridLayout(4,1));
        con.add(choicebuttonpanel);

        choice1=new JButton("Choice 1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.black);
        choice1.setFont(normalfont);
        choicebuttonpanel.add(choice1);
        choice2=new JButton("Choice 2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.black);
        choice2.setFont(normalfont);
        choicebuttonpanel.add(choice2);
        choice3=new JButton("Choice 3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.black);
        choice3.setFont(normalfont);
        choicebuttonpanel.add(choice3);
        choice4=new JButton("Choice 4");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.black);
        choice4.setFont(normalfont);
        choicebuttonpanel.add(choice4);

    }

    public class TitleScreenHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent event) {
            createGameScreen();
        }
    }
}