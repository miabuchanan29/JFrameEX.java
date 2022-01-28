//Filename: ColorChanger.java
//Author: Mia Buchanan
//Class: CIS263AA
//Professor: Dr. Gonzalez
//Date Last Modified: 06.26.21

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorChanger extends JFrame implements ActionListener
{
private JButton button = new JButton("Click Here");
private JButton area1 = new JButton("Area 1");
private JButton area2 = new JButton("Area 2");
private JButton area3 = new JButton("Area 3");
private JButton area4 = new JButton("Area 4");

public ColorChanger()
{
setLayout(new BorderLayout());
add(button, BorderLayout.CENTER);
add(area1, BorderLayout.NORTH);
add(area2, BorderLayout.SOUTH);
add(area3, BorderLayout.WEST);
add(area4, BorderLayout.EAST);

area1.setBackground(Color.WHITE);
area2.setBackground(Color.WHITE);
area3.setBackground(Color.WHITE);
area4.setBackground(Color.WHITE);
button.setBackground(Color.BLUE);

area1.setEnabled(false);
area2.setEnabled(false);
area3.setEnabled(false);
area4.setEnabled(false);

button.addActionListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent ae)
{
int area = (int)(Math.random()*4)+1;
if (area == 1)
{
area1.setBackground(Color.RED);
area2.setBackground(Color.WHITE);
area3.setBackground(Color.WHITE);
area4.setBackground(Color.WHITE);
}
else if (area == 2)
{
area1.setBackground(Color.WHITE);
area2.setBackground(Color.YELLOW);
area3.setBackground(Color.WHITE);
area4.setBackground(Color.WHITE);
}
else if (area == 3)
{
area1.setBackground(Color.WHITE);
area2.setBackground(Color.WHITE);
area3.setBackground(Color.GREEN);
area4.setBackground(Color.WHITE);
}
else
{
area1.setBackground(Color.WHITE);
area2.setBackground(Color.WHITE);
area3.setBackground(Color.WHITE);
area4.setBackground(Color.CYAN);
}

public static void main(String[]args)
{
ColorChanger frame = new ColorChanger();
frame.setSize(200, 200);
frame.setVisible(true);
}
