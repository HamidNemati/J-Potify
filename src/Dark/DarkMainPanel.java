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
    private JPanel homeSongsPanel;
    private JButton addSong;
    private ArrayList<DarkSongPanel> songPanelsArraylist;
    private ArrayList<DarkHomeItems> homeSongsArraylist;
    private JFileChooser fileChooser;
    private JPanel songsList;
    String filePath;
    String filename;


    public DarkMainPanel(String headerName){// non playlist pages
        super();
        setLayout(new BorderLayout());
        songPanelsArraylist = new ArrayList<>();
        homeSongsArraylist = new ArrayList<>();
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
            homePlayListPanel = new JPanel();
            TitledBorder playlistBorder = new TitledBorder(new OvalBorder(MyColors.DarkFooter,MyColors.DarkerTextColor), "Playlists");
            playlistBorder.setTitleFont(MyFonts.cursiveTitle);
            playlistBorder.setTitleColor(MyColors.DarkTextColor);
            homePlayListPanel.setBorder(playlistBorder);
            homePlayListPanel.setBackground(MyColors.DarkBackground);
            body.add(homePlayListPanel);
            //songs
            homeSongsPanel = new JPanel();




//            TitledBorder songsBorder = new TitledBorder(new LineBorder(MyColors.DarkerTextColor, 2), "Songs");
            TitledBorder songsBorder = new TitledBorder(new OvalBorder(MyColors.DarkerTextColor,MyColors.DarkTextColor), "Songs");
            songsBorder.setTitleFont(MyFonts.cursiveTitle);
            songsBorder.setTitleColor(MyColors.DarkTextColor);
//            homeSongsPanel.setLayout(new FlowLayout());
            homeSongsPanel.setLayout(new BoxLayout(homeSongsPanel, BoxLayout.X_AXIS));
            homeSongsPanel.setBorder(songsBorder);
            homeSongsPanel.setBackground(MyColors.DarkBackground);

            homeSongsPanel.add(new DarkHomeItems());
            homeSongsPanel.add(new DarkHomeItems());
            homeSongsPanel.add(new DarkHomeItems());
            homeSongsPanel.add(new DarkHomeItems());
            homeSongsPanel.add(new DarkHomeItems());
            homeSongsPanel.add(new DarkHomeItems());




            body.add(homeSongsPanel);


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
//                    homeSongsArraylist.add(song.getDarkHomeItems());
//                    homeSongsPanel.add(song.getDarkHomeItems());
//                    homeSongsPanel.add(song.getDarkHomeItems());
//                    homeSongsPanel.setVisible(false);
//                    homeSongsPanel.setVisible(true);
////                    homeSongsPanel.add(song.getDarkHomeItems());
//                    homeSongsPanel.add(new DarkHomeItems());
//                    homeSongsPanel.setVisible(true);


                } catch (Exception e1) {
                    e1.printStackTrace();
                }


//                JLabel artWork = new JLabel();

            }


        }

    }
}
