import  javax.swing.*;

public class View extends  JFrame {

    JRadioButton charCount, wordCount, button_3, button_4;
    JRadioButton sort_ascending, sort_descending, sort_frequencyAscending, sort_frequencyDescending;
    JTextField textField_1, textField_2;
    JMenu file,menu;
    JButton bStart;
    JTextArea textArea;
    JLabel countShower;




    View(){
       file = new JMenu(" File ");
       menu = new JMenu("Menu");
       JMenuBar mb = new JMenuBar();
       mb.add(file);
       mb.add(menu);
       this.add(mb);
       this.setJMenuBar(mb);
       this.setLayout(null);




        textField_1 = new JTextField("test.txt");
        textField_2 = new JTextField("Text Field 2");




        charCount = new JRadioButton("Count chars");
        wordCount = new JRadioButton("Count words");
        button_3 = new JRadioButton("RButton 3");
        button_4 = new JRadioButton("RButton 4");

        bStart = new JButton("Start/Go");


        textField_1.setBounds( 10, 20, 150,30);
        charCount.setBounds(   5,  50, 150,30);
        wordCount.setBounds(   5,  80, 150,30);
        button_3.setBounds(    5,  110,150,30);
        button_4.setBounds(    5,  140,150,30);
        textField_2.setBounds( 10, 170,150,30);
        bStart.setBounds(      20, 250,100,40);



        ButtonGroup bg = new ButtonGroup();
        bg.add(charCount); bg.add(wordCount); bg.add(button_3); bg.add(button_4);

        this.add(textField_1);
        this.add(charCount);
        this.add(wordCount);
        this.add(button_3);
        this.add(button_4);
        this.add(textField_2);


//        this.add(bStart);


        countShower = new JLabel("Total:");
        countShower.setBounds(175,40,100,30);
        this.add(countShower);

        sort_ascending = new JRadioButton("Sort by ascending");
        sort_descending = new JRadioButton("Sort by descending");
        sort_frequencyAscending = new JRadioButton("Sort by frequency ascending");
        sort_frequencyDescending = new JRadioButton("Sort by frequency descending");

        sort_ascending.setBounds(          175,280,200,30);
        sort_descending.setBounds(         175,310,200,30);
        sort_frequencyAscending.setBounds( 175,340,200,30);
        sort_frequencyDescending.setBounds(175,370,200,30);

        ButtonGroup sortBg = new ButtonGroup();
        sortBg.add(sort_ascending); sortBg.add(sort_descending); sortBg.add(sort_frequencyAscending); sortBg.add(sort_frequencyDescending);

        this.add(sort_ascending);
        this.add(sort_descending);
        this.add(sort_frequencyAscending);
        this.add(sort_frequencyDescending);

        textArea = new JTextArea(20, 20);
        JScrollPane scrollableTextArea = new JScrollPane(textArea);

        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        scrollableTextArea.setBounds(180,70,100,200);

        this.add(scrollableTextArea);




        setSize(900,600);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }




}
