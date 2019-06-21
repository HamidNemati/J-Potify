package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;

import javax.swing.*;
import java.awt.*;

public class DarkFrame extends JFrame {
    private Dimension minimum = new Dimension(1000,700);
    DarkFooter footer ;
    DarkHeader header ;
    DarkRightSidePanel rightSidePanel ;
    DarkLeftSidePanel leftBar;
    DarkMainPanel homePanel;
    DarkMainPanel playlistPanel;
    DarkMainPanel songsPanel;
    DarkMainPanel albumsPanel;






    public DarkFrame(boolean playOrPaused){
        super("JPOTIFY-Dark");
        footer = new DarkFooter(playOrPaused);
        header = new DarkHeader();
        rightSidePanel = new DarkRightSidePanel();
        leftBar = new DarkLeftSidePanel();
        homePanel = new DarkMainPanel("HOME");
        songsPanel = new DarkMainPanel("SONGS");
        playlistPanel = new DarkMainPanel("PLAYLISTS");
        albumsPanel = new DarkMainPanel("ALBUMS");


        setBackground(MyColors.DarkBackground);
        setSize(1366,720);
        setMinimumSize(minimum);

        //adding menu
        DarkMenu menu = new DarkMenu();
        setJMenuBar(menu);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(footer, BorderLayout.SOUTH);
        add(leftBar, BorderLayout.WEST);
        add(header , BorderLayout.PAGE_START);
        add(rightSidePanel, BorderLayout.EAST);
        //add(homePanel , BorderLayout.CENTER);
        add(songsPanel , BorderLayout.CENTER);
        add(albumsPanel , BorderLayout.CENTER);
        add(playlistPanel , BorderLayout.CENTER);


        setVisible(true);
    }
}
