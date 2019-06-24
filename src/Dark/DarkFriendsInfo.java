package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DarkFriendsInfo extends JButton {
    private JLabel name;
    private JLabel songName;
    private JLabel artistName;
    private JLabel artwork;
    private JPanel songAndArtisit;
    public DarkFriendsInfo(String userName, String userSong , String userArtist){
        super();
        setPreferredSize(new Dimension(200,80));
        setMaximumSize(new Dimension(200,85));
        setMinimumSize(new Dimension(200,85));
        setBorderPainted(false);
        setFocusable(false);
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkLeftBar);
        //artwork
        artwork = new JLabel(MyIcons.DarkUser);
        artwork.setBorder(new EmptyBorder(0,10,0,10));
        add(artwork , BorderLayout.WEST);

        //name, song and artist
        JPanel songAndArtisit = new JPanel();

        //JButton songAndArtisit = new JButton();
        songAndArtisit.setLayout(new GridLayout(3,1));

        songAndArtisit.setBackground(MyColors.Trancparent);
        songAndArtisit.setBorder(new EmptyBorder(2,0,5,0));


        name = new JLabel(userName);
        name.setBackground(MyColors.Trancparent);
        name.setForeground(MyColors.DarkTextColor);
        name.setFont(MyFonts.arialBold);
        songAndArtisit.add(name);

        songName = new JLabel(userSong);
        songName.setBackground(MyColors.Trancparent);
        songName.setForeground(MyColors.DarkTextColor);
        songName.setFont(MyFonts.arial);
        songAndArtisit.add(songName);

        artistName = new JLabel(userArtist);
        //artistName.setBorder(new EmptyBorder(0,0,0,0));
        artistName.setBackground(MyColors.Trancparent);
        artistName.setForeground(MyColors.DarkTextColor);
        artistName.setFont(MyFonts.arialForPlaylistButtons);
        songAndArtisit.add(artistName);


        add(songAndArtisit , BorderLayout.CENTER);

        JLabel partition = new JLabel(MyIcons.DarkFriendsActivitHorizentalPartition);
        add(partition , BorderLayout.SOUTH);
    }
}
