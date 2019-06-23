package Dark;

import MainPackage.MyColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DarkFooter extends JPanel {
    public DarkFooter(boolean playOrPaused){
        super();
        setBackground(MyColors.DarkFooter);
//        setLayout(new BorderLayout());
        setLayout(new GridLayout(1,3));
        setBackground(MyColors.DarkFooter);

        DarkMusicInfo musicInfo = new DarkMusicInfo(false , false , "Something to remind you" , "Staind");
        musicInfo.setBorder(new EmptyBorder(20,10,20,0));
        add(musicInfo, BorderLayout.WEST);

        DarkMusicController musicController = new DarkMusicController(playOrPaused);
        musicController.setBorder(new EmptyBorder(0,0,10,0));
        musicController.setMaximumSize(new Dimension(600,100));
        add(musicController, BorderLayout.CENTER);

        DarkVolumePanel volumePanel = new DarkVolumePanel();
        volumePanel.setBorder(new EmptyBorder(16,0,0,20));
        add(volumePanel, BorderLayout.EAST);
    }
}
