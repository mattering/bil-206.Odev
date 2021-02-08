import  javax.swing.*;
import  java.awt.*;

public class View extends  JFrame {

    JRadioButton button_1,button_2, button_3, button_4;
    JTextField textField_1, textField_2;
    JMenu file,menu;
    JButton bStart;




    View(){
       file = new JMenu(" File ");
       menu = new JMenu("Menu");
       JMenuBar mb = new JMenuBar();
       mb.add(file);
       mb.add(menu);
       this.add(mb);
       this.setJMenuBar(mb);
       this.setLayout(null);




        textField_1 = new JTextField("Text File name");
        textField_2 = new JTextField("Text Field 2");




        button_1 = new JRadioButton("RButton 1");
        button_2 = new JRadioButton("RButton 2");
        button_3 = new JRadioButton("RButton 3");
        button_4 = new JRadioButton("RButton 4");

        bStart = new JButton("Start/Go");


        textField_1.setBounds(10,20,120,30);
        button_1.setBounds(   5,50,100,30);
        button_2.setBounds(   5,80,100,30);
        button_3.setBounds(   5,110,100,30);
        button_4.setBounds(   5,140,100,30);
        textField_2.setBounds(10,170,120,30);
        bStart.setBounds(20,250,100,40);



        ButtonGroup bg = new ButtonGroup();
        bg.add(button_1); bg.add(button_2); bg.add(button_3); bg.add(button_4);
        this.add(textField_1);
        this.add(button_1);
        this.add(button_2);
        this.add(button_3);
        this.add(button_4);
        this.add(textField_2);
        this.add(bStart);





        setSize(400,400);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }




}
