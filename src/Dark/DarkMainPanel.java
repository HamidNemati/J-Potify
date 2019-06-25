package Dark;

import Logic.Song;
import MainPackage.*;
import com.mpatric.mp3agic.Mp3File;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DarkMainPanel extends JPanel implements ActionListener {
    private JPanel title;
    private JPanel body;
    private JPanel homePlayListPanel;
    private JPanel homeSongPanel;
    private JButton addSong;
    private JButton showAllSongs;
    private JButton showAllPlaylists;
    private ArrayList<DarkSongPanel> songPanelsArraylist;//for songs
    private ArrayList<DarkHomeSongsItems> homeSongsArraylist;//for home
    private ArrayList<DarkHomeSongsItems> homePlaylistsArraylist;//for home
    private JFileChooser fileChooser;
    private JPanel songsList;
    String filePath;
    String filename;


    public DarkMainPanel(String headerName){// non playlist pages
        super();
        setLayout(new BorderLayout());
        songPanelsArraylist = new ArrayList<>();
        homeSongsArraylist = new ArrayList<>();
        homePlaylistsArraylist = new ArrayList<>();
//        title = new JPanel(new GridLayout(1,3));
        title = new JPanel(new BorderLayout());
        title.setBackground(MyColors.DarkMenu);
        JLabel leftLowPoly = new JLabel(MyIcons.DarkTitleLeft);
        leftLowPoly.setBackground(Color.magenta);
        title.add(leftLowPoly , BorderLayout.WEST);
        JLabel RightLowPoly = new JLabel(MyIcons.DarkTitleRight);
        title.add(RightLowPoly , BorderLayout.EAST);
        JLabel titleName = new JLabel();
        JPanel titleNamePanel = new JPanel(new BorderLayout());
        titleName.setForeground(MyColors.DarkTextColor);
        titleName.setBackground(MyColors.DarkTextColor);
        titleName.setText(headerName);
        titleNamePanel.setBackground(MyColors.DarkMenu);
        titleName.setFont(MyFonts.heavyTitle);
        titleNamePanel.add(titleName, BorderLayout.WEST);
        title.add(titleNamePanel , BorderLayout.CENTER);
        add(title, BorderLayout.NORTH);
        ///////////////////////////////////////////////////////////
        body = new JPanel();
        body.setBackground(MyColors.DarkBackground);


        if(headerName.equals("HOME")){
            //playlists
            homeSongsArraylist = new ArrayList<>();
            body.setLayout(new GridLayout(2,1));

            JPanel homePlayListPanelPanel = new JPanel(new BorderLayout());

            homePlayListPanel = new JPanel();
            homePlayListPanel.setLayout(new FlowLayout());
            TitledBorder playlistBorder = new TitledBorder(new OvalBorder(MyColors.DarkFooter,MyColors.DarkBackground), "Playlists");
            playlistBorder.setTitleFont(MyFonts.cursiveTitle);
            playlistBorder.setTitleColor(MyColors.DarkTextColor);
            homePlayListPanel.setBorder(playlistBorder);
            homePlayListPanel.setBackground(MyColors.DarkBackground);
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanel.add(new DarkHomePlaylistsItems());
            homePlayListPanelPanel.add(homePlayListPanel ,BorderLayout.CENTER);
            showAllPlaylists = new JButton("show all playlists...");
            showAllPlaylists.addActionListener(this);
            showAllPlaylists.setBorder(new EmptyBorder(0,0,0,0));
            showAllPlaylists.setFocusable(false);
            showAllPlaylists.setBorderPainted(false);
            showAllPlaylists.setFont(MyFonts.arialForPlaylistButtons);
            showAllPlaylists.setForeground(MyColors.DarkFooter);
            showAllPlaylists.setBackground(MyColors.DarkBackground);
            JPanel showAllPlaylistsPanel = new JPanel(new BorderLayout());
            showAllPlaylistsPanel.setBackground(MyColors.DarkBackground);
            showAllPlaylistsPanel.add(showAllPlaylists , BorderLayout.EAST);

            homePlayListPanelPanel.add(showAllPlaylistsPanel , BorderLayout.SOUTH);
            body.add(homePlayListPanelPanel);


            //songs
            homeSongsArraylist = new ArrayList<>();
            body.setLayout(new GridLayout(2,1));

            JPanel homeSongPanelPanel = new JPanel(new BorderLayout());

            homeSongPanel = new JPanel();
            homeSongPanel.setLayout(new FlowLayout());
            TitledBorder songsBorder = new TitledBorder(new OvalBorder(MyColors.DarkFooter,MyColors.DarkBackground), "Songs");
            songsBorder.setTitleFont(MyFonts.cursiveTitle);
            songsBorder.setTitleColor(MyColors.DarkTextColor);
            homeSongPanel.setBorder(songsBorder);
            homeSongPanel.setBackground(MyColors.DarkBackground);
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanel.add(new DarkHomeSongsItems());
            homeSongPanelPanel.add(homeSongPanel ,BorderLayout.CENTER);
            showAllSongs = new JButton("show all songs...");
            showAllSongs.addActionListener(this);
            showAllSongs.setBorder(new EmptyBorder(0,0,0,0));
            showAllSongs.setFocusable(false);
            showAllSongs.setBorderPainted(false);
            showAllSongs.setFont(MyFonts.arialForPlaylistButtons);
            showAllSongs.setForeground(MyColors.DarkFooter);
            showAllSongs.setBackground(MyColors.DarkBackground);
            JPanel showAllSongsPanel = new JPanel(new BorderLayout());
            showAllSongsPanel.setBackground(MyColors.DarkBackground);
            showAllSongsPanel.add(showAllSongs , BorderLayout.EAST);

            homeSongPanelPanel.add(showAllSongsPanel , BorderLayout.SOUTH);
            body.add(homeSongPanelPanel);
//


            body.setBorder(new EmptyBorder(5,20,20,20));
            ////////////////////////////////////////////////////////////////////////////////////////////////
        }else  if(headerName.equals("SONGS")){
            body.setLayout(new BorderLayout());
            songsList = new JPanel();
            songsList.setLayout(new BoxLayout(songsList , BoxLayout.Y_AXIS));
            songsList.setBackground(MyColors.Trancparent);
            songsList.setMinimumSize(new Dimension(1000,500));
            songsList.setMaximumSize(new Dimension(1000,500));
            addSong = new JButton("addSong");
            addSong.addActionListener(this);
            addSong.setBackground(MyColors.DarkerTextColor);
            addSong.setForeground(Color.white);
            addSong.setFocusable(false);
            addSong.setBorderPainted(false);
            body.add(addSong , BorderLayout.NORTH);

            body.setBorder(new EmptyBorder(5,20,20,20));
            body.add(songsList , BorderLayout.CENTER);
        }else  if(headerName.equals("ALBUMS")){

            body.setBorder(new EmptyBorder(5,20,20,20));
        }

        add(body, BorderLayout.CENTER);
    }
    ///////////////////////////////////////////////////////////////////////////////
//    public DarkMainPanel(Playlist playlist){


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addSong){
            if (DarkControlButtons.player.getPlayThread().isAlive()) {
                DarkControlButtons.player.getPlayThread().interrupt();
            }
            fileChooser = new JFileChooser("musicss");
            fileChooser.setBackground(Color.darkGray);
            fileChooser.setCurrentDirectory(new File("C:\\Users\\hamid\\Downloads\\Telegram Desktop"));
            fileChooser.setDialogTitle("Select Mp3");
            fileChooser.setBackground(MyColors.DarkFooter);
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.setForeground(MyColors.DarkLeftBar);
            fileChooser.setFileFilter(new FileNameExtensionFilter("Mp3 files", "mp3"));
            if (fileChooser.showOpenDialog(addSong) == JFileChooser.APPROVE_OPTION) {

                filename = fileChooser.getSelectedFile().getName();
                System.out.println(filename);
                filePath = fileChooser.getSelectedFile().getPath();
                try {
                    Song song = new Song(filePath , filename);
                    DarkControlButtons.player.songs.add(song);
                    songPanelsArraylist.add(song.getDarkSongPanel());
                    songsList.add(song.getDarkSongPanel());
//                    songsList.add(song.getDarkSongPanel());
                    songsList.setVisible(false);
                    songsList.setVisible(true);
                    System.out.println("added to songs list");

////                    DarkControlButtons.player.songs.add(song);
//                    homeSongsArraylist.add(song.getDarkHomeSongsItems());
//                    homeSongsPanel.add(song.getDarkHomeSongsItems());
//                    homeSongsPanel.add(song.getDarkHomeSongsItems());
//                    homeSongsPanel.setVisible(false);
//                    homeSongsPanel.setVisible(true);
////                    homeSongsPanel.add(song.getDarkHomeSongsItems());
//                    homeSongsPanel.add(new DarkHomeSongsItems());
//                    homeSongsPanel.setVisible(true);


                } catch (Exception e1) {
                    e1.printStackTrace();
                }


//                JLabel artWork = new JLabel();

            }


        }else if (e.getSource()==showAllPlaylists){
            System.out.println("PLAYLISTS");
            Main.darkFrame.addPlaylistsToMainPanel();
        }else if (e.getSource()==showAllSongs){
            System.out.println("SONGS");
            Main.darkFrame.addSongsToMainPanel();
        }

    }
}
