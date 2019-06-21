package Dark;

import MainPackage.MyColors;

import javax.swing.*;
import java.awt.*;

public class DarkMusicController extends JPanel {
    public DarkMusicController(boolean playOrPaused){
        super();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkFooter);
        DarkControlButtons buttons = new DarkControlButtons(playOrPaused);
        add(buttons , BorderLayout.CENTER);
        JPanel timeLine = new JPanel();
        timeLine.setBackground(Color.RED);
        add(timeLine , BorderLayout.SOUTH);
    }
}
