package Dark;

import Logic.Song;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkMusicInfo extends JPanel implements ActionListener {
    boolean isLiked;
    boolean isShared;
    JLabel musicName;
    JLabel artistName;
    JButton like;
    JButton share;
    Song song;

    public DarkMusicInfo(Song song){
        super();
        //setLayout(new GridLayout(3,1));
        this.song = song;
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkFooter);
        JPanel musicNameAndArtistPanel = new JPanel(new GridLayout(2,1));//music name


        musicName = new JLabel(this.song.getName());
        musicName.setFont(MyFonts.arialBold);
        musicNameAndArtistPanel.setBackground(MyColors.DarkFooter);
        musicName.setForeground(MyColors.DarkTextColor);
        musicNameAndArtistPanel.add(musicName );
        JPanel artistNamePanel = new JPanel(new BorderLayout());//artist name
        artistName = new JLabel(this.song.getArtist());
        artistName.setFont(MyFonts.arial);
        artistNamePanel.setBackground(MyColors.DarkFooter);
        artistName.setForeground(MyColors.DarkTextColor);
        artistNamePanel.add(artistName);
//        add(artistNamePanel , BorderLayout.SOUTH);
        musicNameAndArtistPanel.add(artistName );
        add(musicNameAndArtistPanel, BorderLayout.CENTER);

        JPanel likeAndShare = new JPanel(new BorderLayout());

        like = new JButton();
        if(isLiked)
            like.setIcon(MyIcons.Darkliked);
        else
            like.setIcon(MyIcons.Darklike);
        like.setBorderPainted(false);
        like.setFocusable(false);
        like.setBorder(new EmptyBorder(0,0,3,0));
        like.setBackground(MyColors.DarkFooter);
        like.addActionListener(this);
        like.setActionCommand("replay");
        likeAndShare.add(like , BorderLayout.NORTH);

        share = new JButton();
        if(isLiked)
            share.setIcon(MyIcons.DarkShared);
        else
            share.setIcon(MyIcons.DarkShare);
        share.setBorderPainted(false);
        share.setFocusable(false);
        share.setBorder(new EmptyBorder(3,0,0,0));
        share.setBackground(MyColors.DarkFooter);
        share.addActionListener(this);
        share.setActionCommand("replay");
        likeAndShare.add(share , BorderLayout.SOUTH);

        JLabel partition = new JLabel(MyIcons.DarkPartition);
        partition.setBackground(MyColors.DarkFooter);
        partition.setBorder(new EmptyBorder(0,10,0,10));


        JPanel likeAndSharePanel = new JPanel(new BorderLayout()); //like & share & partition
        likeAndSharePanel.setBackground(MyColors.DarkFooter);
        likeAndSharePanel.add(likeAndShare ,BorderLayout.CENTER);
        likeAndSharePanel.add(partition , BorderLayout.EAST);

//        musicNameAndArtistPanel.add(partition , BorderLayout.WEST);

        add(likeAndSharePanel , BorderLayout.WEST);

    }

    public DarkMusicInfo(String MusicName , String ArtistName){
        super();
        //setLayout(new GridLayout(3,1));
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkFooter);
        JPanel musicNameAndArtistPanel = new JPanel(new GridLayout(2,1));//music name


        this.musicName = new JLabel(MusicName);
        musicName.setFont(MyFonts.arialBold);
        musicNameAndArtistPanel.setBackground(MyColors.DarkFooter);
        musicName.setForeground(MyColors.DarkTextColor);
        musicNameAndArtistPanel.add(musicName );
        JPanel artistNamePanel = new JPanel(new BorderLayout());//artist name
        this.artistName = new JLabel(ArtistName);
        artistName.setFont(MyFonts.arial);
        artistNamePanel.setBackground(MyColors.DarkFooter);
        artistName.setForeground(MyColors.DarkTextColor);
        artistNamePanel.add(artistName);
//        add(artistNamePanel , BorderLayout.SOUTH);
        musicNameAndArtistPanel.add(artistName );
        add(musicNameAndArtistPanel, BorderLayout.CENTER);

        JPanel likeAndShare = new JPanel(new BorderLayout());
        like = new JButton();
        if(isLiked)
            like.setIcon(MyIcons.Darkliked);
        else
            like.setIcon(MyIcons.Darklike);
        like.setBorderPainted(false);
        like.setFocusable(false);
        like.setBorder(new EmptyBorder(0,0,3,0));
        like.setBackground(MyColors.DarkFooter);
        like.addActionListener(this);
        like.setActionCommand("replay");
        likeAndShare.add(like , BorderLayout.NORTH);

        share = new JButton();
        if(isLiked)
            share.setIcon(MyIcons.DarkShared);
        else
            share.setIcon(MyIcons.DarkShare);
        share.setBorderPainted(false);
        share.setFocusable(false);
        share.setBorder(new EmptyBorder(3,0,0,0));
        share.setBackground(MyColors.DarkFooter);
        share.addActionListener(this);
        share.setActionCommand("replay");
        likeAndShare.add(share , BorderLayout.SOUTH);

        JLabel partition = new JLabel(MyIcons.DarkPartition);
        partition.setBackground(MyColors.DarkFooter);
        partition.setBorder(new EmptyBorder(0,10,0,10));


        JPanel likeAndSharePanel = new JPanel(new BorderLayout()); //like & share & partition
        likeAndSharePanel.setBackground(MyColors.DarkFooter);
        likeAndSharePanel.add(likeAndShare ,BorderLayout.CENTER);
        likeAndSharePanel.add(partition , BorderLayout.EAST);

//        musicNameAndArtistPanel.add(partition , BorderLayout.WEST);

        add(likeAndSharePanel , BorderLayout.WEST);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==like){
            System.out.println("like button pressed!");
            if(isLiked){
                like.setIcon(MyIcons.Darklike);
                isLiked = false;
                System.out.println("unliked...");
            }else{
                like.setIcon(MyIcons.Darkliked);
                isLiked = true;
                System.out.println("liked...");
            }
        } else if(e.getSource()==share){
            System.out.println("share button pressed!");
            if(isShared){
                share.setIcon(MyIcons.DarkShare);
                isShared = false;
                System.out.println("unshare...");
            }else{
                share.setIcon(MyIcons.DarkShared);
                isShared = true;
                System.out.println("share...");
            }
        }
    }

    public void setSong(Song song){
        this.song = song;
        JPanel musicNameAndArtistPanel = new JPanel(new GridLayout(2,1));//music name


        this.musicName = new JLabel(song.getName());
        musicName.setFont(MyFonts.arialBold);
        musicNameAndArtistPanel.setBackground(MyColors.DarkFooter);
        musicName.setForeground(MyColors.DarkTextColor);
        musicNameAndArtistPanel.add(musicName );
        JPanel artistNamePanel = new JPanel(new BorderLayout());//artist name
        this.artistName = new JLabel(song.getArtist());
        artistName.setFont(MyFonts.arial);
        artistNamePanel.setBackground(MyColors.DarkFooter);
        artistName.setForeground(MyColors.DarkTextColor);
        artistNamePanel.add(artistName);
//        add(artistNamePanel , BorderLayout.SOUTH);
        musicNameAndArtistPanel.add(artistName );
        add(musicNameAndArtistPanel, BorderLayout.CENTER);

    }
}
