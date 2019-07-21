package Dark;

import Logic.Song;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DarkHomeSongsItems extends JPanel {
    JLabel songName;
    JLabel artistName;
    JLabel artwork;
    public DarkHomeSongsItems(Song song){
        super();
        setBackground(MyColors.DarkBackground);
        artwork = new JLabel();
        songName = new JLabel();
        artistName = new JLabel();
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(150, 126));
artwork.setHorizontalAlignment(JLabel.CENTER);
        artwork.setMaximumSize(new Dimension(50,50));
        artwork.setMinimumSize(new Dimension(50,50));
        artwork.setPreferredSize(new Dimension(50 ,50));
        artwork.setSize(100,100);
//        if()
            artwork.setIcon(song.getArtWorkSmall()
            );
//
//            artwork.setIcon(song.getArtWorkSmall());



//        if (DarkControlButtons.player.getCurrentSong() != null){
//            if (DarkControlButtons.player.getCurrentSong().isHasId3v2Tag()) {
//                artwork.setIcon(DarkControlButtons.player.getCurrentSong().getArtWork());
//            }
//        }else
//            artwork.setIcon(MyIcons.DarkNoArtworkSmall);



        add(artwork , BorderLayout.CENTER);

        JPanel musicInfo = new JPanel(new BorderLayout());
        musicInfo.setBackground(MyColors.DarkBackground);
        if(song.getName()!=null)
            songName.setText(song.getName());
        else
            songName.setText("unknown");
        songName.setHorizontalAlignment(JLabel.CENTER);
        songName.setFont(MyFonts.arial);
        songName.setForeground(MyColors.DarkTextColor);
        songName.setBackground(MyColors.DarkBackground);

        artistName.setText(song.getArtist());
        artistName.setHorizontalAlignment(JLabel.CENTER);
        artistName.setFont(MyFonts.arialForPlaylistButtons);
        artistName.setForeground(MyColors.DarkerTextColor);
        artistName.setBackground(MyColors.DarkBackground);


        musicInfo.add(songName , BorderLayout.NORTH);
        musicInfo.add(artistName , BorderLayout.SOUTH);
        add(musicInfo , BorderLayout.SOUTH);

    }


    public DarkHomeSongsItems(){
        super();
        setBorder(new EmptyBorder(0,10,0,0));
        artwork = new JLabel();
        songName = new JLabel();
        artistName = new JLabel();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkBackground);
        artwork.setMaximumSize(new Dimension(100,100));
        artwork.setMinimumSize(new Dimension(100,100));
        artwork.setSize(100,100);

        artwork.setIcon(MyIcons.DarkNoArtworkSmall);

        add(artwork , BorderLayout.CENTER);

        JPanel musicInfo = new JPanel(new BorderLayout());
        musicInfo.setBackground(MyColors.DarkBackground);
        songName.setText("SONG");
//        songName.setHorizontalAlignment(JLabel.CENTER);
        songName.setFont(MyFonts.arialBold);
        songName.setForeground(MyColors.DarkTextColor);
        songName.setBackground(MyColors.DarkBackground);

        artistName.setText("ARTIST");
//        artistName.setHorizontalAlignment(JLabel.CENTER);
        artistName.setFont(MyFonts.arial);
        artistName.setForeground(MyColors.DarkerTextColor);
        artistName.setBackground(MyColors.DarkBackground);


        musicInfo.add(songName , BorderLayout.NORTH);
        musicInfo.add(artistName , BorderLayout.SOUTH);
        add(musicInfo , BorderLayout.SOUTH);

    }
}
