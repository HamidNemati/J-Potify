package Dark;

import MainPackage.GradientPanel;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkMainPlaylistPanel extends JPanel implements ActionListener {
    public DarkMainPlaylistPanel(int playlist){
        super(new BorderLayout());
//        JPanel header = new JPanel(new BorderLayout());
        GradientPanel header = new GradientPanel(MyColors.DarkerTextColor ,MyColors.DarkBackground );
        header.setLayout(new BorderLayout());
        JLabel playlistArtwork = new JLabel(MyIcons.DarkNoArtwork);
        playlistArtwork.setBorder(new EmptyBorder(20,20,20,20));
        header.add(playlistArtwork, BorderLayout.WEST);

        JPanel playlistHeaderTexts = new JPanel(new BorderLayout());
        playlistHeaderTexts.setBackground(MyColors.Trancparent);
        playlistHeaderTexts.setBorder(new EmptyBorder(90,0,70,0));

        JLabel playlistHeaderTitle = new JLabel("PLAYLIST");
        playlistHeaderTitle.setFont(MyFonts.arial);
        playlistHeaderTitle.setForeground(MyColors.DarkTextColor);

        JLabel playlistHeaderNameTitle = new JLabel("Rock&Metal");
        playlistHeaderNameTitle.setFont(MyFonts.heavyTitle);
        playlistHeaderNameTitle.setForeground(MyColors.DarkTextColor);

        playlistHeaderTexts.add(playlistHeaderNameTitle, BorderLayout.CENTER);
        playlistHeaderTexts.add(playlistHeaderTitle, BorderLayout.NORTH);
        header.add(playlistHeaderTexts , BorderLayout.CENTER);
        JLabel partition = new JLabel(MyIcons.DarkSongHorizentalPartition);
        header.add(partition , BorderLayout.SOUTH);

        add(header,BorderLayout.NORTH);

        //Body

        JPanel body = new JPanel();
        body.setBackground(MyColors.DarkBackground);
        add(body , BorderLayout.CENTER);



    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
