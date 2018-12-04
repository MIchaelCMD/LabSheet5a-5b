import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyJFrame4 extends JFrame implements ActionListener{
    // private instance variables
    JButton Button1;
	JButton Button2;

	int count1 = 0;
	int count2 = 0;

    public static void main (String [] args) {
		MyJFrame4 mine = new MyJFrame4();
        mine.setVisible(true);
    }

    public MyJFrame4 () {
        setTitle ("This is a \"MyJFrame4\" object (V4)");
        setSize (300, 500);
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        // get the content pane and set properties
        Container contentPane = getContentPane();
        contentPane.setBackground (Color.blue);
        contentPane.setLayout(null); // so that we can use absolute positioning

        // construct a button and make this MyJFrame3 listen for
        // and  handle button events

        Button1 = new JButton(Integer.toString(0));
        Button2 = new JButton(Integer.toString(0));
        Button1.setBounds(110,130,80,40);
        Button2.setBounds(110,230,80,40);
	    Button1.addActionListener(this);
	    Button2.addActionListener(this);
        contentPane.add(Button1);
        contentPane.add(Button2);
    }

    public void actionPerformed(ActionEvent event) {
        // add code to increment the buttonCount and display it on the button

       if(event.getSource().equals(Button1))
       {

           count1++;

           Button1.setText(Integer.toString(count1));

       }

       if (event.getSource().equals(Button2))
       {

           count2++;

           Button2.setText(Integer.toString(count2));

       }
    }
}
