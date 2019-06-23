package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;

import javax.swing.*;
import java.awt.*;

public class DarkFrame extends JFrame {
    private Dimension minimum = new Dimension(1000,700);
    private DarkFooter footer ;
    private DarkHeader header ;
    private DarkRightSidePanel rightSidePanel ;
    private DarkLeftSidePanel leftBar;
    private DarkMainPanel homePanel;
    private DarkMainPanel playlistPanel;
    private DarkMainPanel songsPanel;
    private DarkMainPanel albumsPanel;

    private DarkMainPanel HARDCORE;






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
        HARDCORE = new DarkMainPanel(1);


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

        add(albumsPanel , BorderLayout.CENTER);
        add(playlistPanel , BorderLayout.CENTER);
        add(homePanel , BorderLayout.CENTER);
        add(songsPanel , BorderLayout.CENTER);

        add(HARDCORE , BorderLayout.CENTER);






        setVisible(true);
    }
}
