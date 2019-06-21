package Dark;

import MainPackage.MyColors;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DarkHeader extends JPanel {
    public DarkHeader(){
        super();
        setBackground(MyColors.DarkLeftBar);
        setLayout(new BorderLayout());
        JButton headerMusicLogo = new JButton();// for the music logo and "JPOTIFY" title...
        headerMusicLogo.setFocusable(false);
        headerMusicLogo.setBorderPainted(false);
        headerMusicLogo.setBorder(new EmptyBorder(0,0,0,0));
        JLabel musicLogo = new JLabel(MyIcons.DarkJpotifyLogo);
        headerMusicLogo.add(musicLogo,BorderLayout.WEST);
        add(headerMusicLogo , BorderLayout.WEST);

        JPanel headerWithNoLogo = new JPanel(new BorderLayout());
        headerWithNoLogo.setBackground(MyColors.DarkLeftBar);
        add(headerWithNoLogo , BorderLayout.CENTER);

        JPanel searchPanel = new JPanel(new BorderLayout());// for the Searching area
        searchPanel.setBackground(MyColors.DarkLeftBar);
        DarkSearchArea searchArea = new DarkSearchArea();

        searchPanel.add(searchArea , BorderLayout.CENTER);
        searchPanel.setBorder(new EmptyBorder(10,15,15,0));
        headerWithNoLogo.add(searchPanel, BorderLayout.WEST);

        DarkUserInfo userInfo = new DarkUserInfo("USERNAME");
        headerWithNoLogo.add(userInfo , BorderLayout.EAST);

    }
}
