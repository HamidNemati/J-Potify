package Dark;

import Logic.Song;
import MainPackage.MyColors;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

public class DarkFooter extends JPanel {

    public static DarkMusicInfo darkMusicInfo;

    public DarkFooter(boolean playOrPaused) throws Exception {
        super();
        setBackground(MyColors.DarkFooter);
//        setLayout(new BorderLayout());
        setLayout(new GridLayout(1,3));
        setBackground(MyColors.DarkFooter);

        if (DarkControlButtons.player.getCurrentSong() != null)
            darkMusicInfo = new DarkMusicInfo(DarkControlButtons.player.getCurrentSong());
        else {
            darkMusicInfo = new DarkMusicInfo("Song Name" , "Artist Name");
        }
        darkMusicInfo.setBorder(new EmptyBorder(20,10,20,0));
        this.add(darkMusicInfo ,  BorderLayout.WEST);


        DarkMusicController musicController = new DarkMusicController(playOrPaused);
        musicController.setBorder(new EmptyBorder(0,0,10,0));
        musicController.setMaximumSize(new Dimension(600,100));
        add(musicController, BorderLayout.CENTER);

        DarkVolumePanel volumePanel = new DarkVolumePanel();
        volumePanel.setBorder(new EmptyBorder(16,0,0,20));
        add(volumePanel, BorderLayout.EAST);


    }

//    public static void setDarkMusicInfo(DarkMusicInfo darkMusicInfo) {
//        DarkFooter.darkMusicInfo = darkMusicInfo;
//        this.add(darkMusicInfo);
//    }



    public static void setDarkMusicInfo(String songName, String Artist){
        darkMusicInfo.musicName.setText(songName);
        darkMusicInfo.artistName.setText(Artist);

    }
}
