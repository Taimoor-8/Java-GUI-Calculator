import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {
    JTextField textfield;
    JTextField textfield1;
    JFrame frame;
    ImageIcon icon;
    JButton[] number_button = new JButton[10];
    JButton[] function_button = new JButton[14];
    JButton addButton,subButton,mulButton,
            divButton,decButton,clrButton,
            negButton,equalButton,delButton,
            squareButton,UnderButton,inverseButton,
            cubeButton,cuberootButton;
    Font myfont = new Font("Comic Sans",Font.BOLD,25);
    Font myfont1 = new Font("Comic Sans",Font.ITALIC,10);
    JPanel panel;
    JToolBar toolbar;
    double num1=0,num2=0,result=0;
    char operator;

        Calculator(){
//            for Frame
            frame = new JFrame("Calculator");
            frame.setSize(370,550);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null);

            toolbar = new JToolBar("Standard Calculator");
            toolbar.setBackground(new Color(28,31,34));
            toolbar.setForeground(Color.WHITE);


//            for operating text field
            textfield = new JTextField();
            textfield.setBounds(0,45,350,80);
            textfield.setEditable(true);
            textfield.setFont(myfont);
            textfield.setBackground(new Color(28,31,34));
            textfield.setForeground(Color.WHITE);
            textfield.setVisible(true);

//            for appending text field
            textfield1 = new JTextField();
            textfield1.setBounds(0,25,350,20);
            textfield1.setEditable(false);
            textfield1.setFont(myfont1);
            textfield1.setBackground(new Color(28,31,34));
            textfield1.setForeground(Color.WHITE);
//            textfield.setBorder(true);
            textfield1.setVisible(true);

//            for Icon
            icon = new ImageIcon("475497.png");
//            for Buttons
//            Addition Button
            addButton = new JButton("+");
            addButton.setBackground(new Color(21,24,25));
            addButton.setForeground(Color.WHITE);
            addButton.setFont(myfont);
//            Subtract Button
            subButton= new JButton("-");
            subButton.setBackground(new Color(21,24,25));
            subButton.setForeground(Color.WHITE);
            subButton.setFont(myfont);
//            Multiply Button
            mulButton = new JButton("X");
            mulButton.setBackground(new Color(21,24,25));
            mulButton.setForeground(Color.WHITE);
            mulButton.setFont(myfont);
//            Divide Button
            divButton = new JButton("/");
            divButton.setBackground(new Color(21,24,25));
            divButton.setForeground(Color.WHITE);
            divButton.setFont(myfont);
//            Delete Button
            delButton = new JButton("DC");
            delButton.setBackground(new Color(7,8,8));
            delButton.setForeground(Color.WHITE);
            delButton.setFont(myfont);
//            Decimal Button
            decButton = new JButton(".");
            decButton.setBackground(new Color(21,24,25));
            decButton.setForeground(Color.WHITE);
            decButton.setFont(myfont);
//            Clear Button
            clrButton = new JButton("AC");
            clrButton.setBackground(new Color(174,31,36));
            clrButton.setForeground(Color.WHITE);
            clrButton.setFont(myfont);
//            Negative Button
            negButton = new JButton("+/-");
            negButton.setBackground(new Color(21,24,25));
            negButton.setForeground(Color.WHITE);
            negButton.setFont(myfont);
//            Equal Button
            equalButton = new JButton("=");
            equalButton.setBackground(new Color(17,70,74));
            equalButton.setForeground(Color.WHITE);
            equalButton.setFont(myfont);
//            Square Button
            squareButton = new JButton("square");
            squareButton.setBackground(new Color(21,24,25));
            squareButton.setForeground(Color.WHITE);
            squareButton.setFont(myfont1);
//            Under Root Button
            UnderButton = new JButton("√x");
            UnderButton.setBackground(new Color(21,24,25));
            UnderButton.setForeground(Color.WHITE);
            UnderButton.setFont(myfont);
//            Inverse Button
            inverseButton = new JButton("1/x");
            inverseButton.setBackground(new Color(21,24,25));
            inverseButton.setForeground(Color.WHITE);
            inverseButton.setFont(myfont);
//            Cube root Button
            cuberootButton = new JButton("3√x");
            cuberootButton.setBackground(new Color(21,24,25));
            cuberootButton.setForeground(Color.WHITE);
            cuberootButton.setFont(myfont);
//            Cube Button
            cubeButton = new JButton("cube");
            cubeButton.setBackground(new Color(21,24,25));
            cubeButton.setForeground(Color.WHITE);
            cubeButton.setFont(myfont1);

//            Assigning Buttons in Array
            function_button[0] = addButton;
            function_button[1] = subButton;
            function_button[2] = mulButton;
            function_button[3] = divButton;
            function_button[4] = decButton;
            function_button[5] = equalButton;
            function_button[6] = clrButton;
            function_button[7] = negButton;
            function_button[8] = squareButton;
            function_button[9] = UnderButton;
            function_button[10] = delButton;
            function_button[11] = inverseButton;
            function_button[12] = cubeButton;
            function_button[13] = cuberootButton;

//            Assigning properties to Function Buttons
            for(int i=0; i<function_button.length; i++){
                function_button[i].addActionListener(this);
                function_button[i].setFocusable(false);
            }

//            Assigning properties to Number Buttons
            for(int i=0; i<number_button.length; i++){
                number_button[i]= new JButton(String.valueOf(i));
                number_button[i].addActionListener(this);
                number_button[i].setFocusable(false);
                number_button[i].setFont(myfont);
                number_button[i].setBackground(new Color(7,8,8));
                number_button[i].setForeground(Color.WHITE);
                
            }

//            Assigning Panel properties
            panel = new JPanel();
            panel.setBounds(5,130,345,375);
            panel.setBackground(new Color(28,31,34));
            panel.setLayout(new GridLayout(6,4,3,3));

//            Adding Buttons to Panel
            panel.add(function_button[12]);
            panel.add(function_button[13]);
            panel.add(function_button[10]);
            panel.add(function_button[6]);

            panel.add(function_button[11]);
            panel.add(function_button[8]);
            panel.add(function_button[9]);
            panel.add(function_button[3]);

            panel.add(number_button[7]);
            panel.add(number_button[8]);
            panel.add(number_button[9]);
            panel.add(function_button[2]);

            panel.add(number_button[4]);
            panel.add(number_button[5]);
            panel.add(number_button[6]);
            panel.add(function_button[1]);

            panel.add(number_button[1]);
            panel.add(number_button[2]);
            panel.add(number_button[3]);
            panel.add(function_button[0]);

            panel.add(function_button[7]);
            panel.add(number_button[0]);
            panel.add(function_button[4]);
            panel.add(function_button[5]);

//            Integration of components to frame
            frame.add(textfield);
            frame.add(panel);
            frame.add(textfield1);
            frame.setIconImage(icon.getImage());
            frame.getContentPane().setBackground(new Color(28,31,34));
            frame.add(toolbar,BorderLayout.NORTH);
            frame.setVisible(true);

        }

    public static void main(String[] args) {

        Calculator cal = new Calculator();
    }
            @Override
            public void actionPerformed(ActionEvent e){

//              Making number button responsive
                for(int i=0; i<number_button.length; i++){
                    if(e.getSource() == number_button[i]){
                        textfield.setText(textfield.getText().concat(String.valueOf(i)));
                    }

                }
                for(int i=0; i<number_button.length; i++){
                    if(e.getSource() == number_button[i]){
                        textfield1.setText(textfield1.getText().concat(String.valueOf(i)));
                    }
                }

//                Making decimal button responsive
                if(e.getSource() == decButton){
                    textfield.setText(textfield.getText().concat("."));
                    textfield1.setText(textfield1.getText().concat("."));
                }

//                Making addition button responsive
                if(e.getSource() == addButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator='+';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat(" + "));
                }

//                Making subtraction button responsive
                if(e.getSource() == subButton){
                    num1 =Double.parseDouble(textfield.getText());
                    operator = '-';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat(" - "));
                }

//                Making multiplication button responsive
                if(e.getSource() == mulButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator = '*';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat(" X "));
                }

//                Making division button responsive
                if(e.getSource() == divButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator = '/';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat(" / "));
                }

//                Making square button responsive
                if(e.getSource() == squareButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator = '2';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat("sqr("+num1+")"));
                }

//                Making under root button responsive
                if(e.getSource() == UnderButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator = '3';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat("√("+num1+")"));
                }

//                Making inverse button responsive
                if(e.getSource() == inverseButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator = '4';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat("1/"+num1));
                }

//              Making cube Button responsive
                if(e.getSource() == cubeButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator= '5';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat("cube(" +num1+ ")"));
                }

//                Making cube root button responsive
                if(e.getSource() == cuberootButton){
                    num1 = Double.parseDouble(textfield.getText());
                    operator= '6';
                    textfield.setText("");
                    textfield1.setText(textfield1.getText().concat("cube root(" +num1+ ")"));
                }

//                Making equal button responsive
                if (e.getSource() == equalButton){

                    switch (operator) {
                        case '+' -> {
                            num2 = Double.parseDouble(textfield.getText());
                            result = num1 + num2;
                        }
                        case '-' -> {
                            num2 = Double.parseDouble(textfield.getText());
                            result = num1 - num2;
                        }
                        case '*' -> {
                            num2 = Double.parseDouble(textfield.getText());
                            result = num1 * num2;
                        }
                        case '/' -> {
                            num2 = Double.parseDouble(textfield.getText());
                            result = num1 / num2;
                        }
                        case '2' -> {
//                            num1 = Double.parseDouble(textfield.getText());
                            result = Math.pow(num1, 2);
                        }
                        case '3' -> {
//                            num1 = Double.parseDouble(textfield.getText());
                            result = Math.sqrt(num1);
                        }
                        case '4' -> {
//                            num1 = Double.parseDouble(textfield.getText());
                            result = 1 / num1;
                        }
                        case '5' -> {
//                            num1 = Double.parseDouble(textfield.getText());
                            result = Math.pow(num1, 3);
                        }
                        case '6' -> {
//                            num1 = Double.parseDouble(textfield.getText());
                            result = Math.cbrt(num1);
                        }
                    }
                    textfield.setText(String.valueOf(result));
                    num1 = result;
                    textfield1.setText(textfield1.getText().concat(" ="));
                }


//                Making equal button responsive
                if(e.getSource() == clrButton){
                    textfield.setText("");
                    textfield1.setText("");
                }

//                Making deletion button responsive
                if(e.getSource() == delButton){
                    String str = textfield.getText();
                    textfield.setText("");
                    textfield1.setText("");
                    for(int i=0; i<str.length()-1; i++){
                        textfield.setText(textfield.getText() + str.charAt(i));
                        textfield1.setText(textfield1.getText() + str.charAt(i));
                    }
                }

//                Making negative button responsive
                if(e.getSource() ==  negButton){
                    double temp = Double.parseDouble(textfield.getText());
                    temp *= -1;
                    textfield.setText(String.valueOf(temp));
                }
            }

    }
