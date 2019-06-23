package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkSongPanel extends JPanel implements ActionListener {
    boolean isLiked;
    boolean isShared;
    JLabel musicName;
    JLabel artistName;
    JLabel time;
    JButton shareButton;
    JButton likeButton;
//    public DarkSongPanel(){
    public DarkSongPanel(String song, String artist, boolean like , boolean share ,String durition){
        super(new BorderLayout());
//        super(new GridLayout(1,5));
//        setBorder(new EmptyBorder(5,5,5,5));
        JPanel buttons = new JPanel(new GridLayout(1,2));



        setMinimumSize(new Dimension(1200,30));
        setMaximumSize(new Dimension(1200,30));
        musicName = new JLabel(song);
        musicName.setFont(MyFonts.arial);
        musicName.setBackground(MyColors.DarkFooter);
        musicName.setForeground(MyColors.DarkTextColor);
//        add(musicName );
        JPanel artistNamePanel = new JPanel(new BorderLayout());//artist name
        artistName = new JLabel(artist);
        artistName.setFont(MyFonts.arial);
        artistNamePanel.setBackground(MyColors.DarkFooter);
        artistName.setForeground(MyColors.DarkTextColor);
        artistNamePanel.add(artistName);
//        add(artistName );

        likeButton = new JButton();
        if(like)
            likeButton.setIcon(MyIcons.Darkliked);
        else
            likeButton.setIcon(MyIcons.Darklike);
        likeButton.setBorderPainted(false);
        likeButton.setFocusable(false);
        likeButton.setBorder(new EmptyBorder(0,0,0,0));
        likeButton.setBackground(MyColors.DarkFooter);
        likeButton.addActionListener(this);
        likeButton.setActionCommand("replay");
//        add(likeButton);

        shareButton = new JButton();
        if(share)
            shareButton.setIcon(MyIcons.DarkShared);
        else
            shareButton.setIcon(MyIcons.DarkShare);
        shareButton.setBorderPainted(false);
        shareButton.setFocusable(false);
        shareButton.setBorder(new EmptyBorder(0,0,0,0));
        shareButton.setBackground(MyColors.DarkFooter);
        shareButton.addActionListener(this);
        shareButton.setActionCommand("replay");
//        add(shareButton );

        time = new JLabel(durition);
        time.setFont(MyFonts.arial);
        setBackground(MyColors.DarkFooter);
        time.setForeground(MyColors.DarkTextColor);

//        add(time );

//        add(likeButton);
//        add(shareButton);
//        add(musicName);
//        add(artistName);
//        add(time);
//        buttons.setBorder(new EmptyBorder(5,5,5,5));
        likeButton.setBorder(new EmptyBorder(0,5,0,5));
        buttons.add(likeButton);
        buttons.add(shareButton);
        add(buttons , BorderLayout.WEST);
//        JPanel songInfo = new JPanel(new BorderLayout());
//        songInfo.add(musicName , BorderLayout.CENTER);
//        songInfo.add(artistName, BorderLayout.EAST);
        JPanel songInfo = new JPanel(new GridLayout());
        songInfo.add(musicName );
        songInfo.add(artistName);
        songInfo.setBorder(new EmptyBorder(5,5,5,5));
        songInfo.setBackground(MyColors.DarkFooter);
        time.setBorder(new EmptyBorder(5,0,5,5));
        add(songInfo , BorderLayout.CENTER);
        add(time , BorderLayout.EAST);
        add( new JLabel(MyIcons.DarkSongHorizentalPartition), BorderLayout.SOUTH);




//        JPanel likeAndSharePanel = new JPanel(new BorderLayout()); //like & share & partition
//        likeAndSharePanel.setBackground(MyColors.DarkFooter);
//        likeAndSharePanel.add(likeAndShare ,BorderLayout.CENTER);
//        likeAndSharePanel.add(partition , BorderLayout.EAST);

//        musicNameAndArtistPanel.add(partition , BorderLayout.WEST);

//        add(likeAndSharePanel , BorderLayout.WEST);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==likeButton){
            System.out.println("like button pressed!");
            if(isLiked){
                likeButton.setIcon(MyIcons.Darklike);
                isLiked = false;
                System.out.println("unliked...");
            }else{
                likeButton.setIcon(MyIcons.Darkliked);
                isLiked = true;
                System.out.println("liked...");
            }
        } else if(e.getSource()==shareButton){
            System.out.println("share button pressed!");
            if(isShared){
                shareButton.setIcon(MyIcons.DarkShare);
                isShared = false;
                System.out.println("unshare...");
            }else{
                shareButton.setIcon(MyIcons.DarkShared);
                isShared = true;
                System.out.println("share...");
            }
        }
    }
}
