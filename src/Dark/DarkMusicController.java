package Dark;

import MainPackage.MyColors;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.swing.*;
import java.awt.*;

public class DarkMusicController extends JPanel {
    JLabel timeGone;
    JLabel timeLeft;
    public static int passedTime = 0;
//    JSlider timeLine;
    public DarkMusicController(boolean playOrPaused) throws Exception {
        super();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkFooter);
        DarkControlButtons buttons = new DarkControlButtons(playOrPaused);
        add(buttons , BorderLayout.CENTER);
        JPanel timeLinePanel = new JPanel(new BorderLayout());
//        JPanel timeLine = new JPanel();
//         timeLine = DarkControlButtons.player.timeLine;
         DarkControlButtons.player.timeLine.setValue(0);
        DarkControlButtons.player.timeLine.setBackground(MyColors.DarkFooter);
        timeGone = DarkControlButtons.player.currentTimepanel;
        timeGone.setForeground(MyColors.DarkTextColor);
        timeLeft = DarkControlButtons.player.songLength;
        timeLeft.setForeground(MyColors.DarkTextColor);
        timeLinePanel.add(timeGone , BorderLayout.WEST);
        timeLinePanel.add(DarkControlButtons.player.timeLine , BorderLayout.CENTER);
        timeLinePanel.add(timeLeft , BorderLayout.EAST);

        timeLinePanel.setBackground(MyColors.DarkFooter);
        add(timeLinePanel , BorderLayout.SOUTH);
    }


//    public void setTimeLine(int currentTime) {
//        this.timeLine.setValue(currentTime);
//    }
}
