//Filename: BorderLocation.java
//Author: Mia Buchanan
//Class: CIS 263AA
//Professor: Dr. Gonzalez
//Date Last Modified: 06.26.21

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class BorderLocation extends JFrame implements ActionListener
{
final JPanel center = new JPanel();
final int start = 20;
final int init = 200;
final int end = 200;
JButton northButton = new JButton("\n");
JButton southButton = new JButton("\n");
JButton centerButton = new JButton("\n");
JButton eastButton = new JButton("\n");
JButton westButton = new JButton("\n");

public BorderLocation()
{
northButton.addActionListener(this);
southButton.addActionListener(this);
centerButton.addActionListener(this);
eastButton.addActionListener(this);
westButton.addActionListener(this);

JFrame frame = new JFrame();
frame.add(northButton, BorderLayout.NORTH);
frame.add(southButton, BorderLayout.SOUTH);
frame.add(centerButton, BorderLayout.CENTER);
frame.add(eastButton, BorderLayout.EAST);
frame.add(westButton, BorderLayout.WEST);
frame.setSize(500, 500);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}

public static void main(String[]args)
{
new BorderLocation();
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource() == northButton)
{
northButton.setText("North");
}
else if(e.getSource() == southButton)
{
southButton.setText("South");
}
else if (e.getSource() == centerButton)
{
centerButton.setText("Center");
}
else if (e.getSource() == eastButton)
{
eastButton.setText("East");
}
else
{
westButton.setText("West");
}
}
}