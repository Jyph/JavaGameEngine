package UI;

import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// Title Bar
public class _0 extends JPanel
{
    JButton[] buttons = new JButton[3];
    int button_size = 40;
    
    public _0(JFrame window)
    {
        super();
        this.setLayout(null);
        this.setBounds(0, 0, window.getWidth(), button_size);
        this.setBackground(Color.black);

        Dimension minimum_titlebar_size = new Dimension(
            (button_size * 3) + 100,
            button_size
        );
        window.setMinimumSize(minimum_titlebar_size);

        buttons[0] = new JButton("-");
        buttons[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                // IDK how yet
            }
        });


        buttons[1] = new JButton("m");
        buttons[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                //IDK yet but min if maxed and max if min
            }
        });


        buttons[2] = new JButton("x");
        buttons[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.dispose();
            }
        });


        int ww = window.getWidth();
        for (int i = 0; i < 3; i++)
        {
            buttons[i].setBounds(
                ww - (button_size * (3 - i)),
                0, button_size, button_size
            );

            buttons[i].setBackground(Color.black);
            buttons[i].setForeground(Color.white);

            this.add(buttons[i]);
        }
    }

    public void repaint()
    {

    }
}