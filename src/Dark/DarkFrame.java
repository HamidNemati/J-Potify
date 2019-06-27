package Dark;

import Logic.Player;
import Logic.playList;
import MainPackage.Main;
import MainPackage.MyColors;
import MainPackage.MyFonts;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
    private DarkMainPlaylistPanel favouritePlayListPanel;
    private DarkMainPlaylistPanel sharedPlayListPanel;

    private ArrayList<DarkMainPlaylistPanel> mainPlaylistPanelsArraylists;

//    DarkMainPlaylistPanel hardcore = new DarkMainPlaylistPanel(1);
//    DarkMainPlaylistPanel cactus = new DarkMainPlaylistPanel(new playList("good mood:)","what a wonderful fucking world"));
    DarkMainAlbumPanel album = new DarkMainAlbumPanel(1);

    public ArrayList<DarkMainPlaylistPanel> getMainPlaylistPanelsArraylists() {
        return mainPlaylistPanelsArraylists;
    }

    public void setAllMainPanelsInvisible(){
        remove( albumsPanel );
        remove( playlistPanel );
        remove( homePanel);
        remove( songsPanel);
        remove( sharedPlayListPanel);
        remove( favouritePlayListPanel);
        albumsPanel .setVisible(false);
        playlistPanel .setVisible(false);
        homePanel.setVisible(false);
        songsPanel.setVisible(false);
        sharedPlayListPanel.setVisible(false);
        favouritePlayListPanel.setVisible(false);
        for(DarkMainPlaylistPanel i : mainPlaylistPanelsArraylists){
            i.setVisible(false);
        }
    }

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

    public void addOnePlaylistPanelToTheMainPanel(playList pl){
        addPlaylistsToMainPanel();
        playlistPanel.setVisible(false);
//        remove(playlistPanel);
//        remove( albumsPanel );
//        remove( playlistPanel );
//        remove( homePanel);
//        remove( songsPanel);
////        remove( sharedPlayListPanel);
////        remove( favouritePlayListPanel);
//        albumsPanel .setVisible(false);
//        playlistPanel .setVisible(false);
//        homePanel.setVisible(false);
//        songsPanel.setVisible(false);
//        sharedPlayListPanel.setVisible(false);
//        favouritePlayListPanel.setVisible(false);
//        setAllMainPanelsInvisible();
        add(pl.getMainPlaylistPanel() , BorderLayout.CENTER);
        pl.getMainPlaylistPanel().setVisible(true);
    }


    public void addSongsToMainPanel(){
//        removeAll();
        setAllMainPanelsInvisible();
        remove(albumsPanel );
        remove(playlistPanel );
        remove(homePanel);
        remove(sharedPlayListPanel);
        remove(favouritePlayListPanel);
        add(songsPanel , BorderLayout.CENTER);
        albumsPanel .setVisible(false);
        playlistPanel .setVisible(false);
        homePanel.setVisible(false);
        songsPanel.setVisible(true);
    }
    public void addHomeToMainPanel(){
//        removeAll();
//        setAllMainPanelsInvisible();

        remove(albumsPanel );
        remove(playlistPanel );
        remove(songsPanel);
        remove(sharedPlayListPanel);
        remove(favouritePlayListPanel);
        add(homePanel , BorderLayout.CENTER);
        albumsPanel .setVisible(false);
        playlistPanel .setVisible(false);
        songsPanel.setVisible(false);
        sharedPlayListPanel.setVisible(false);
        favouritePlayListPanel.setVisible(false);
        homePanel.setVisible(true);
    }
    public void addAlbumsToMainPanel(){
//        removeAll();
//        setAllMainPanelsInvisible();

        remove(playlistPanel );
        remove(songsPanel );
        remove(homePanel);
        remove(sharedPlayListPanel);
        remove(favouritePlayListPanel);
        add(albumsPanel , BorderLayout.CENTER);
        albumsPanel .setVisible(true);
        playlistPanel .setVisible(false);
        songsPanel.setVisible(false);
        homePanel.setVisible(false);
        sharedPlayListPanel.setVisible(false);
        favouritePlayListPanel.setVisible(false);

    }
    public void addPlaylistsToMainPanel(){
//        setAllMainPanelsInvisible();

        remove(albumsPanel );
        remove(songsPanel );
        remove(homePanel);
        remove(sharedPlayListPanel);
        remove(favouritePlayListPanel);
        add(playlistPanel , BorderLayout.CENTER);
        albumsPanel .setVisible(false);
        songsPanel.setVisible(false);
        sharedPlayListPanel.setVisible(false);
        favouritePlayListPanel.setVisible(false);
        homePanel.setVisible(false);
        playlistPanel .setVisible(true);

    }






    public DarkFrame(boolean playOrPaused) throws Exception {
        super("JPOTIFY-Dark");
        footer = new DarkFooter(playOrPaused);
        header = new DarkHeader();
        rightSidePanel = new DarkRightSidePanel();
        leftBar = new DarkLeftSidePanel();
        homePanel = new DarkMainPanel("HOME");
        songsPanel = new DarkMainPanel("SONGS");
        playlistPanel = new DarkMainPanel("PLAYLISTS");
        albumsPanel = new DarkMainPanel("ALBUMS");
        mainPlaylistPanelsArraylists = new ArrayList<>();
        favouritePlayListPanel = new DarkMainPlaylistPanel(Player.favouritePlaylist);
        sharedPlayListPanel = new DarkMainPlaylistPanel(Player.sharedPlaylist);

//        HARDCORE = new DarkMainPanel(1);
//        JScrollPane scrollPane = new JScrollPane(rightSidePanel , ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
//        scrollPane.setPreferredSize(new Dimension(10, 600));
//        scrollPane.setBackground(Color.MAGENTA);
//        scrollPane.setBackground(Color.ORANGE);
//        scrollPane.setAlignmentX(LEFT_ALIGNMENT);
//
//        add(scrollPane);

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

        add(playlistPanel , BorderLayout.CENTER);
        add(albumsPanel , BorderLayout.CENTER);
        add(songsPanel , BorderLayout.CENTER);
        playlistPanel.setVisible(false);
        albumsPanel.setVisible(false);
        songsPanel.setVisible(false);
        add(homePanel , BorderLayout.CENTER);




//        add(hardcore , BorderLayout.CENTER);
//        add(album , BorderLayout.CENTER);


//        add(cactus , BorderLayout.CENTER);



        setVisible(true);
    }
}
