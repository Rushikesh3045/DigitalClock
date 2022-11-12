package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Clock;
import java.util.Date;

public class MyWindow extends JFrame
{
    private JLabel heading;
    private JLabel ClockLabel;
    private Font font=new Font("",Font.BOLD,35);
    MyWindow()
    {
        super.setVisible(true);
        super.setSize(500,500);
        super.setLocation(100,40);
        this.creteGUI();
        this.StartClock();
        super.setTitle("Digital timer");

    }
    public void creteGUI() {
        heading = new JLabel("My Clock");
        ClockLabel = new JLabel("Clock");

        heading.setFont(font);
        ClockLabel.setFont(font);
        this.setLayout(new GridLayout(2, 1));
        this.add(heading);
        this.add(ClockLabel);
    }
    public void StartClock()
    {
        Timer timer=new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  String dataTime=new Date().toString();
                String dateTime=new Date().toLocaleString();
                ClockLabel.setText(dateTime);

            }
        });
        timer.start();
    }
}
