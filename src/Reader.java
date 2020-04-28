import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;


public class Reader extends JFrame {

    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
            buttonSum,buttonDivision,buttonSubtraction,buttonMultiplication,
            buttonCleaning,buttonEqually,
            buttonBack,buttonLogarithm,buttonFactorial,
            buttonEngineering, buttonOrdinary, buttonPoint;
    JTextField inputField;
    JPanel p1=new JPanel(),p2=new JPanel(),p3=new JPanel();
    JPanel windowContent = new  JPanel();
    Double firstIntNumber, secondIntNumber;
    int SUM=0, SUBTRACTION=0, MULTIPLICATION=0, DIVISION=0, FACTORIAL, LOGARITHM;
    String firstStringNumber,secondStringNumber;

    eHandler handler=new eHandler();

    public Reader(String s){
        super(s);
        setLayout(new FlowLayout());

        inputField=new JTextField(12);

        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button0=new JButton("   0   ");

        buttonPoint=new JButton(".");

        buttonSum=new JButton(" +");
        buttonSubtraction=new JButton(" -");
        buttonMultiplication=new JButton(" *");
        buttonDivision=new JButton(" /");
        buttonCleaning=new JButton("CE");
        buttonBack=new JButton("<--");
        buttonEqually=new JButton("     =     ");

        buttonFactorial=new JButton("!");
        buttonLogarithm=new JButton("log");

        buttonEngineering=new JButton("Engineering");
        buttonOrdinary=new JButton("Ordinary");

        inputField.setEditable(false);

        GridLayout g1 = new GridLayout(7,1);

        p1.setLayout(g1);
        p1.add(inputField);
        p1.add(buttonCleaning);
        p1.add(buttonBack);
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1. add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqually);
        windowContent.add("Center",p1);


        GridLayout g2 = new GridLayout(5,2);
        p2.setLayout(g2);
        p2.add(buttonSum);
        p2.add(buttonSubtraction);
        p2.add(buttonDivision);
        p2.add(buttonMultiplication);
        p2.add(buttonEngineering);

        windowContent.add("East",p2);


        GridLayout g3 = new GridLayout(5,2);
        p3.setLayout(g3);
        p3.add(buttonFactorial);
        p3.add(buttonLogarithm);
        p3.add(buttonOrdinary);
        p3.setVisible(false);
        windowContent.add("East",p3);

        buttonCleaning.addActionListener(handler);
        buttonBack.addActionListener(handler);

        button1.addActionListener(handler);
        button2.addActionListener(handler);
        button3.addActionListener(handler);
        button4.addActionListener(handler);
        button5.addActionListener(handler);
        button6.addActionListener(handler);
        button7.addActionListener(handler);
        button8.addActionListener(handler);
        button9.addActionListener(handler);
        button0.addActionListener(handler);

        buttonPoint.addActionListener(handler);

        buttonSum.addActionListener(handler);
        buttonEqually.addActionListener(handler);
        buttonSubtraction.addActionListener(handler);
        buttonDivision.addActionListener(handler);
        buttonMultiplication.addActionListener(handler);

        buttonEngineering.addActionListener(handler);
        buttonOrdinary.addActionListener(handler);

        buttonFactorial.addActionListener(handler);
        buttonLogarithm.addActionListener(handler);
    }

    public Double calculateFactorial(Double num) {
        Double fact = 1.0;
        for (; num > 0; fact *= num--);
        return fact;
    }

    public class eHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==buttonPoint){
                if(!inputField.getText().contains(".")){
                    if(!inputField.getText().equals("")){
                        inputField.setText(inputField.getText() + ".");
                    }
                    else {
                        showMessageDialog(null, "Invalid input of point  !");
                    }
                }else {
                    showMessageDialog(null, "Invalid input of point !");
                }
            }

            if(e.getSource()==buttonEngineering){
                p3.setVisible(true);
                pack();
            }

            if(e.getSource()==buttonOrdinary){
                p3.setVisible(false);
                pack();
            }

            if(e.getSource()==buttonCleaning){
                inputField.setText(null);
            }

            if(e.getSource()==buttonBack){
                String str=inputField.getText();
                inputField.setText(str.substring(0,str.length()-1));
            }

            if(e.getSource()==button1){
                inputField.setText(inputField.getText()+"1");
            }

            if(e.getSource()==button2){
                inputField.setText(inputField.getText()+"2");
            }

            if(e.getSource()==button3){
                inputField.setText(inputField.getText()+"3");
            }

            if(e.getSource()==button4){
                inputField.setText(inputField.getText()+"4");
            }

            if(e.getSource()==button5){
                inputField.setText(inputField.getText()+"5");
            }

            if(e.getSource()==button6){
                inputField.setText(inputField.getText()+"6");
            }

            if(e.getSource()==button7){
                inputField.setText(inputField.getText()+"7");
            }

            if(e.getSource()==button8){
                inputField.setText(inputField.getText()+"8");
            }

            if(e.getSource()==button9){
                inputField.setText(inputField.getText()+"9");
            }

            if(e.getSource()==button0){
                inputField.setText(inputField.getText()+"0");
            }

            if(e.getSource()==buttonEqually ){

                secondStringNumber=inputField.getText();
                secondIntNumber= parseDouble(secondStringNumber);
                firstIntNumber= parseDouble(firstStringNumber);

                if(SUM==1){
                    inputField.setText(firstIntNumber+secondIntNumber+"");
                    SUM=0;
                    firstIntNumber=0.0;
                    secondIntNumber=0.0;
                    secondStringNumber="";
                    firstStringNumber="";
                }

                if(SUBTRACTION==1){
                    inputField.setText(firstIntNumber-secondIntNumber+"");
                    SUBTRACTION=0;
                    firstIntNumber=0.0;
                    secondIntNumber=0.0;
                    secondStringNumber="";
                    firstStringNumber="";
                }

                if(MULTIPLICATION==1){
                    inputField.setText(firstIntNumber*secondIntNumber+"");
                    MULTIPLICATION=0;
                    firstIntNumber=0.0;
                    secondIntNumber=0.0;
                    secondStringNumber="";
                    firstStringNumber="";
                }

                if(DIVISION==1){
                    inputField.setText(firstIntNumber/secondIntNumber+"");
                    DIVISION=0;
                    firstIntNumber=0.0;
                    secondIntNumber=0.0;
                    secondStringNumber="";
                    firstStringNumber="";
                }

                if(LOGARITHM==1){
                    inputField.setText(Math.log(secondIntNumber)/Math.log(firstIntNumber)+"");
                    LOGARITHM=0;
                    firstIntNumber=0.0;
                    secondIntNumber=0.0;
                    secondStringNumber="";
                    firstStringNumber="";
                }
            }

            if(e.getSource()==buttonFactorial){
                firstStringNumber=inputField.getText();
                firstIntNumber= parseDouble(firstStringNumber);
                inputField.setText(null);
                inputField.setText(calculateFactorial(firstIntNumber)+"");
                FACTORIAL=0;
                firstIntNumber=0.0;
                firstStringNumber="";
            }

            if(e.getSource()==buttonLogarithm){
                firstStringNumber=inputField.getText();
                inputField.setText(null);
                LOGARITHM++;
            }

            if(e.getSource()==buttonSum){
                firstStringNumber=inputField.getText();
                inputField.setText(null);
                SUM++;
            }

            if(e.getSource()==buttonDivision){
                firstStringNumber=inputField.getText();
                inputField.setText(null);
                DIVISION++;
            }

            if(e.getSource()==buttonSubtraction){
                firstStringNumber=inputField.getText();
                inputField.setText(null);
                SUBTRACTION++;
            }

            if(e.getSource()==buttonMultiplication){
                firstStringNumber=inputField.getText();
                inputField.setText(null);
                MULTIPLICATION++;
            }
        }
    }
}






