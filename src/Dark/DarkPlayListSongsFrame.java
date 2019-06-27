package Dark;

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

public class DarkPlayListSongsFrame extends JFrame implements ActionListener {
    JLabel playlistHeaderTitle ;
    JLabel playlistHeaderNameTitle ;
    JLabel playlistHeaderDescription ;
    JPanel songsList;
    JButton addSong;

    public JPanel getSongsList() {
        return songsList;
    }


    //
//    public DarkMainPlaylistPanel(int playlist){
//        super(new BorderLayout());
////        JPanel header = new JPanel(new BorderLayout());
//        GradientPanel header = new GradientPanel(MyColors.DarkerTextColor ,MyColors.DarkBackground );
//
//        playlistHeaderTitle = new JLabel("playlist");
//        playlistHeaderNameTitle = new JLabel("Rock&Metal");
//        playlistHeaderDescription = new JLabel("goodi goodi goodi");
//
//        header.setLayout(new BorderLayout());
//        JLabel playlistArtwork = new JLabel(MyIcons.DarkNoArtwork);
//        playlistArtwork.setBorder(new EmptyBorder(20,20,20,20));
//        header.add(playlistArtwork, BorderLayout.WEST);
//
//        JPanel playlistHeaderTexts = new JPanel(new BorderLayout());
//        playlistHeaderTexts.setBackground(MyColors.Trancparent);
//        playlistHeaderTexts.setBorder(new EmptyBorder(80,0,70,0));
//
//        playlistHeaderTitle.setFont(MyFonts.cursiveTitleSmall);
//        playlistHeaderTitle.setForeground(MyColors.DarkTextColor);
//
//        playlistHeaderNameTitle.setFont(MyFonts.heavyTitle);
//        playlistHeaderNameTitle.setForeground(MyColors.DarkTextColor);
//
//        playlistHeaderDescription.setFont(MyFonts.arial);
//        playlistHeaderDescription.setForeground(MyColors.DarkTextColor);
//
//        playlistHeaderTexts.add(playlistHeaderNameTitle, BorderLayout.CENTER);
//        playlistHeaderTexts.add(playlistHeaderTitle, BorderLayout.NORTH);
//        playlistHeaderTexts.add(playlistHeaderDescription, BorderLayout.SOUTH);
//        header.add(playlistHeaderTexts , BorderLayout.CENTER);
//        JLabel partition = new JLabel(MyIcons.DarkSongHorizentalPartition);
//        header.add(partition , BorderLayout.SOUTH);
//
//        add(header,BorderLayout.NORTH);
//
//        //Body
//
//        JPanel body = new JPanel();
//        body.setBackground(MyColors.DarkBackground);
//        add(body , BorderLayout.CENTER);
//
//
//
//    }

    public DarkPlayListSongsFrame(playList playlist){
        super();
        setSize(new Dimension(600,500));

        setLayout(new BorderLayout());
//        JPanel header = new JPanel(new BorderLayout());
        GradientPanel header = new GradientPanel(MyColors.DarkerTextColor ,MyColors.DarkBackground );

        playlistHeaderTitle = new JLabel("playlist");
        playlistHeaderNameTitle = new JLabel(playlist.getName());
        playlistHeaderDescription = new JLabel(playlist.getDescription());

        header.setLayout(new BorderLayout());
        JLabel playlistArtwork = new JLabel(MyIcons.DarkNoArtwork);
        playlistArtwork.setBorder(new EmptyBorder(20,20,20,20));
        header.add(playlistArtwork, BorderLayout.WEST);

        JPanel playlistHeaderTexts = new JPanel(new BorderLayout());
        playlistHeaderTexts.setBackground(MyColors.Trancparent);
        playlistHeaderTexts.setBorder(new EmptyBorder(80,0,70,0));

        playlistHeaderTitle.setFont(MyFonts.cursiveTitleSmall);
        playlistHeaderTitle.setForeground(MyColors.DarkTextColor);

        playlistHeaderNameTitle.setFont(MyFonts.heavyTitle);
        playlistHeaderNameTitle.setForeground(MyColors.DarkTextColor);

        playlistHeaderDescription.setFont(MyFonts.arial);
        playlistHeaderDescription.setForeground(MyColors.DarkTextColor);

        playlistHeaderTexts.add(playlistHeaderNameTitle, BorderLayout.CENTER);
        playlistHeaderTexts.add(playlistHeaderTitle, BorderLayout.NORTH);
        playlistHeaderTexts.add(playlistHeaderDescription, BorderLayout.SOUTH);
        header.add(playlistHeaderTexts , BorderLayout.CENTER);
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
        addSong = new JButton("addSong");
        addSong.addActionListener(this);
        addSong.setBackground(MyColors.DarkerTextColor);
        addSong.setForeground(Color.white);
        addSong.setFocusable(false);
        addSong.setBorderPainted(false);
        body.add(addSong , BorderLayout.NORTH);

        body.setBorder(new EmptyBorder(5,20,20,20));
        body.add(songsList , BorderLayout.CENTER);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
