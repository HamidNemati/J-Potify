package Dark;

import Logic.Player;
import Logic.Song;
import Logic.playList;
import MainPackage.GradientPanel;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DarkAlbumSongsFrame extends JFrame implements ActionListener {
    JPanel songsList;
    JLabel albumHeaderTitle ;
    JLabel albumHeaderNameTitle ;
    JLabel albumHeaderDescription ;
    ArrayList<Song> albumSongsArrayList;
    String albumName;



    public DarkAlbumSongsFrame(String albumName , String artistName , Song song){
        super();
        this.albumName = albumName;
        for(String i : Player.albumsHashMap.keySet()){
            if(i.equals(albumName)){
                albumSongsArrayList = Player.albumsHashMap.get(i);
            }

        }
        setLayout(new BorderLayout());
//        JPanel header = new JPanel(new BorderLayout());
        setSize(new Dimension(900,500));
        GradientPanel header = new GradientPanel(MyColors.DarkerTextColor ,MyColors.DarkBackground );

        albumHeaderTitle = new JLabel("album :");
        albumHeaderNameTitle = new JLabel(albumName);
        albumHeaderDescription = new JLabel("By : "+artistName );

        header.setLayout(new BorderLayout());
        JLabel albumArtwork = new JLabel(song.getArtWork());
        albumArtwork.setBorder(new EmptyBorder(20,20,20,20));
        header.add(albumArtwork, BorderLayout.WEST);

        JPanel albumHeaderTexts = new JPanel(new BorderLayout());
        albumHeaderTexts.setBackground(MyColors.Trancparent);
        albumHeaderTexts.setBorder(new EmptyBorder(80,0,70,0));

        albumHeaderTitle.setFont(MyFonts.cursiveTitleSmall);
        albumHeaderTitle.setForeground(MyColors.DarkTextColor);

        albumHeaderNameTitle.setFont(MyFonts.heavyTitle);
        albumHeaderNameTitle.setForeground(MyColors.DarkTextColor);

        albumHeaderDescription.setFont(MyFonts.arial);
        albumHeaderDescription.setForeground(MyColors.DarkTextColor);

        albumHeaderTexts.add(albumHeaderNameTitle, BorderLayout.CENTER);
        albumHeaderTexts.add(albumHeaderTitle, BorderLayout.NORTH);
        albumHeaderTexts.add(albumHeaderDescription, BorderLayout.SOUTH);
        header.add(albumHeaderTexts , BorderLayout.CENTER);
        JLabel partition = new JLabel(MyIcons.DarkSongHorizentalPartition);
        header.add(partition , BorderLayout.SOUTH);

        add(header,BorderLayout.NORTH);

        //Body

        JPanel body = new JPanel();
        body.setBackground(MyColors.DarkBackground);
        add(body , BorderLayout.CENTER);
        body.setLayout(new BorderLayout());
        songsList = new JPanel();
        songsList.setLayout(new BoxLayout(songsList , BoxLayout.Y_AXIS));
        songsList.setBackground(MyColors.Trancparent);
        songsList.setMinimumSize(new Dimension(1000,500));
        songsList.setMaximumSize(new Dimension(1000,500));
        songsList.add(song.getDarkSongPanelForAlbumMainPanel());


        body.setBorder(new EmptyBorder(5,20,20,20));
        body.add(songsList , BorderLayout.CENTER);


        setVisible(true);
    }

    public void refreshAlbum(){
        for(String i : Player.albumsHashMap.keySet()){
            if(i.equals(albumName)){
                albumSongsArrayList = Player.albumsHashMap.get(i);
            }

        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
