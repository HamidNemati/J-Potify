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

    public Dimension getMinimum() {
        return minimum;
    }

    public void setMinimum(Dimension minimum) {
        this.minimum = minimum;
    }

    public DarkFooter getFooter() {
        return footer;
    }

    public void setFooter(DarkFooter footer) {
        this.footer = footer;
    }

    public DarkHeader getHeader() {
        return header;
    }

    public void setHeader(DarkHeader header) {
        this.header = header;
    }

    public DarkRightSidePanel getRightSidePanel() {
        return rightSidePanel;
    }

    public void setRightSidePanel(DarkRightSidePanel rightSidePanel) {
        this.rightSidePanel = rightSidePanel;
    }

    public DarkLeftSidePanel getLeftBar() {
        return leftBar;
    }

    public void setLeftBar(DarkLeftSidePanel leftBar) {
        this.leftBar = leftBar;
    }

    public DarkMainPanel getHomePanel() {
        return homePanel;
    }

    public void setHomePanel(DarkMainPanel homePanel) {
        this.homePanel = homePanel;
    }

    public DarkMainPanel getPlaylistPanel() {
        return playlistPanel;
    }

    public void setPlaylistPanel(DarkMainPanel playlistPanel) {
        this.playlistPanel = playlistPanel;
    }

    public DarkMainPanel getSongsPanel() {
        return songsPanel;
    }

    public void setSongsPanel(DarkMainPanel songsPanel) {
        this.songsPanel = songsPanel;
    }

    public DarkMainPanel getAlbumsPanel() {
        return albumsPanel;
    }

    public void setAlbumsPanel(DarkMainPanel albumsPanel) {
        this.albumsPanel = albumsPanel;
    }

    public DarkMainPanel getHARDCORE() {
        return HARDCORE;
    }

    public void setHARDCORE(DarkMainPanel HARDCORE) {
        this.HARDCORE = HARDCORE;
    }

    private DarkMainPanel HARDCORE;



    public void addSongsToMainPanel(){
        remove(albumsPanel );
        remove(playlistPanel );
        remove(homePanel);
        add(songsPanel , BorderLayout.CENTER);

        System.out.println("SSS");
    }
    public void addHomeToMainPanel(){
//        add(albumsPanel , BorderLayout.CENTER);
//        add(playlistPanel , BorderLayout.CENTER);
        add(homePanel , BorderLayout.CENTER);
//        add(songsPanel , BorderLayout.CENTER);
    }
    public void addAlbumsToMainPanel(){
        remove(playlistPanel );
        remove(songsPanel );
        remove(homePanel);
        add(albumsPanel , BorderLayout.CENTER);

    }
    public void addPlaylistsToMainPanel(){
        remove(albumsPanel );
        remove(songsPanel );
        remove(homePanel);
        add(playlistPanel , BorderLayout.CENTER);

    }






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
        add(homePanel , BorderLayout.CENTER);



//        add(HARDCORE , BorderLayout.CENTER);






        setVisible(true);
    }
}
