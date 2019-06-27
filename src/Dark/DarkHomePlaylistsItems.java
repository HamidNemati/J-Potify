package Dark;

import Logic.Song;
import Logic.playList;
import MainPackage.Main;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class DarkHomePlaylistsItems extends JPanel implements ActionListener {
    public class DarkHomePlaylistsItems extends JButton implements ActionListener {
    JLabel songName;
    JLabel artwork;
    playList playlist;
    public DarkHomePlaylistsItems(playList playList){
        super();

        this.playlist = playList;

        setBorderPainted(false);
        addActionListener(this);

        artwork = new JLabel();
        songName = new JLabel();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkBackground);
        artwork.setMaximumSize(new Dimension(100,100));
        artwork.setMinimumSize(new Dimension(100,100));
        artwork.setSize(100,100);
        artwork.setBackground(MyColors.DarkBackground);

        artwork.setIcon(MyIcons.DarkNoArtworkSmall);

        add(artwork , BorderLayout.CENTER);

        JPanel musicInfo = new JPanel(new BorderLayout());
        musicInfo.setBackground(MyColors.DarkBackground);
        songName.setText(playList.getName());
        songName.setSize(100,50);
        songName.setMinimumSize(new Dimension(100,50));
        songName.setMaximumSize(new Dimension(100,50));
        songName.setBorder(new EmptyBorder(0,0,0,10));
//        songName.setHorizontalAlignment(JLabel.CENTER);
        songName.setFont(MyFonts.arialBold);
        songName.setForeground(MyColors.DarkTextColor);
        songName.setBackground(MyColors.DarkBackground);




        musicInfo.add(songName , BorderLayout.NORTH);
        add(musicInfo , BorderLayout.SOUTH);

    }


    public DarkHomePlaylistsItems(){
        super();
        setBorder(new EmptyBorder(0,10,0,0));
        artwork = new JLabel();
        songName = new JLabel();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkBackground);
        artwork.setMaximumSize(new Dimension(100,100));
        artwork.setMinimumSize(new Dimension(100,100));
        artwork.setSize(100,100);

        artwork.setIcon(MyIcons.DarkNoArtworkSmall);

        add(artwork , BorderLayout.CENTER);

        JPanel musicInfo = new JPanel(new BorderLayout());
        musicInfo.setBackground(MyColors.DarkBackground);
        songName.setText("Playlist");
//        songName.setHorizontalAlignment(JLabel.CENTER);
        songName.setFont(MyFonts.arialBold);
        songName.setForeground(MyColors.DarkTextColor);
        songName.setBackground(MyColors.DarkBackground);




        musicInfo.add(songName , BorderLayout.NORTH);
        add(musicInfo , BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this){
//            Main.darkFrame.setAllMainPanelsInvisible();
//            Main.darkFrame.addOnePlaylistPanelToTheMainPanel(this.playlist);
            this.playlist.getPlayListSongsFrame().setVisible(true);
        }
    }
}
