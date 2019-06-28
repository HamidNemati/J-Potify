package Dark;

import Logic.playList;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class DarkPlaylistTitle extends JPanel {
public class DarkPlaylistTitle extends JButton implements ActionListener {

    JLabel icon;
    JLabel name;
    playList playList;




    public DarkPlaylistTitle(playList playList){
//        super(new BorderLayout());
        super();
        setPreferredSize(new Dimension(190,40));
        this.playList = playList;
        addActionListener(this);
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkLeftBar);
        setBorder(new EmptyBorder(0,0,0,0));
        setBorderPainted(false);
        setFocusable(false);
        icon = new JLabel();
        icon.setBackground(MyColors.DarkLeftBar);
        name = new JLabel();
        name.setFont(MyFonts.arialForPlaylistButtons);
        name.setForeground(MyColors.DarkTextColor);
        name.setBorder(new EmptyBorder(0,60,0,0));
        name.setBorder(new EmptyBorder(0,0,0,0));

        if(playList.getName().equals("Shared Playlist"))
            icon.setIcon(MyIcons.DarkSharedPlayListTitle);//check
        else if(playList.getName().equals("Favourite Playlist"))
            icon.setIcon(MyIcons.DarkFavouritePlayListTitle);//check
        else    icon.setIcon(MyIcons.DarkNormalPlayListTitle);//check


        name.setText(playList.getName());
        add(icon , BorderLayout.WEST);
        add(name , BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==this){
            if(!this.playList.getPlayListSongsFrame().isVisible()){
                this.playList.getPlayListSongsFrame().setVisible(true);
            }
        }
    }
}
