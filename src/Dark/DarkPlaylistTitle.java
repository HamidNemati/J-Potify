package Dark;

import MainPackage.MyColors;
import MainPackage.MyIcons;

import javax.swing.*;
import java.awt.*;

public class DarkPlaylistTitle extends JPanel {
    JLabel icon;
    JLabel name;
    public DarkPlaylistTitle(String playlistName){
        super();
        setLayout(new FlowLayout());
        icon.setIcon(MyIcons.DarkSharedPlayListTitle);//check
        name.setText(playlistName);
        add(icon);
        add(name);
    }

}
