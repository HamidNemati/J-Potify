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
        artwork = new JLabel();
        songName = new JLabel();
        artistName = new JLabel();
        setLayout(new BorderLayout());

        artwork.setMaximumSize(new Dimension(100,100));
        artwork.setMinimumSize(new Dimension(100,100));
        artwork.setSize(100,100);

        artwork.setIcon(MyIcons.DarkNoArtworkSmall);

        add(artwork , BorderLayout.CENTER);

        JPanel musicInfo = new JPanel(new BorderLayout());
        musicInfo.setBackground(MyColors.DarkBackground);
        songName.setText(song.getName());
        songName.setHorizontalAlignment(JLabel.CENTER);
        songName.setFont(MyFonts.arialBold);
        songName.setForeground(MyColors.DarkTextColor);
        songName.setBackground(MyColors.DarkBackground);

        artistName.setText(song.getArtist());
        artistName.setHorizontalAlignment(JLabel.CENTER);
        artistName.setFont(MyFonts.arial);
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
