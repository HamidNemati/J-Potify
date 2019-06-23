package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

//public class DarkPlaylistTitle extends JPanel {
public class DarkPlaylistTitle extends JButton {

    JLabel icon;
    JLabel name;
    public DarkPlaylistTitle(String playlistName){
//        super(new BorderLayout());
        super();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkLeftBar);
        setBorder(new EmptyBorder(0,0,0,0));
        icon = new JLabel();
        icon.setBackground(MyColors.DarkLeftBar);
        name = new JLabel();
        name.setFont(MyFonts.arialForPlaylistButtons);
        name.setForeground(MyColors.DarkTextColor);
        name.setBorder(new EmptyBorder(0,60,0,0));
        name.setBorder(new EmptyBorder(0,0,0,0));

        if(playlistName.equals("Shared Playlist"))
            icon.setIcon(MyIcons.DarkSharedPlayListTitle);//check
        else if(playlistName.equals("Favourite Playlist"))
            icon.setIcon(MyIcons.DarkFavouritePlayListTitle);//check
        else    icon.setIcon(MyIcons.DarkNormalPlayListTitle);//check


        name.setText(playlistName);
        add(icon , BorderLayout.WEST);
        add(name , BorderLayout.CENTER);
    }

}
