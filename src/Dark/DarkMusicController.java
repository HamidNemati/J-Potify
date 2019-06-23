package Dark;

import MainPackage.MyColors;

import javax.swing.*;
import java.awt.*;

public class DarkMusicController extends JPanel {
    JLabel timeGone;
    JLabel timeLeft;
    JSlider timeLine;
    public DarkMusicController(boolean playOrPaused){
        super();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkFooter);
        DarkControlButtons buttons = new DarkControlButtons(playOrPaused);
        add(buttons , BorderLayout.CENTER);
        JPanel timeLinePanel = new JPanel(new BorderLayout());
//        JPanel timeLine = new JPanel();
         timeLine = new JSlider();
        timeLine.setBackground(MyColors.DarkFooter);
        timeGone = new JLabel("0:20");
        timeGone.setForeground(MyColors.DarkTextColor);
        timeLeft = new JLabel("3:50");
        timeLeft.setForeground(MyColors.DarkTextColor);
        timeLinePanel.add(timeGone , BorderLayout.WEST);
        timeLinePanel.add(timeLine , BorderLayout.CENTER);
        timeLinePanel.add(timeLeft , BorderLayout.EAST);

        timeLinePanel.setBackground(MyColors.DarkFooter);
        add(timeLinePanel , BorderLayout.SOUTH);
    }
}
