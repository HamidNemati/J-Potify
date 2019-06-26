package Dark;

import Logic.Song;
import MainPackage.Main;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DarkSongPanel extends JPanel implements ActionListener {
    boolean isLiked;
    boolean isShared;
    boolean playOrPaused;
    JLabel musicName;
    JLabel artistName;
    JLabel time;
    JButton shareButton;
    JButton likeButton;
    JButton playAndPause;
    JButton more;
    JPanel buttons;
    JPanel songInfo;

    //    public DarkSongPanel(){
    public DarkSongPanel(Song song){
        super(new BorderLayout());
//        super(new GridLayout(1,5));
//        setBorder(new EmptyBorder(5,5,5,5));
        buttons = new JPanel(new GridLayout(1 , 3));


            setMinimumSize(new Dimension(1200, 30));
            setMaximumSize(new Dimension(1200, 30));
            musicName = new JLabel();
            musicName.setFont(MyFonts.arial);
            musicName.setBackground(MyColors.DarkMenu);
            musicName.setForeground(MyColors.DarkTextColor);
//        add(musicName );
            JPanel artistNamePanel = new JPanel(new BorderLayout());//artist name
            artistName = new JLabel(song.getArtist());
            artistName.setFont(MyFonts.arial);
            artistNamePanel.setBackground(MyColors.DarkMenu);
            artistName.setForeground(MyColors.DarkTextColor);
            artistNamePanel.add(artistName);
//        add(artistName );

            likeButton = new JButton();
            if (song.getLiked())
                likeButton.setIcon(MyIcons.Darkliked);
            else
                likeButton.setIcon(MyIcons.Darklike);
            likeButton.setBorderPainted(false);
            likeButton.setFocusable(false);
            likeButton.setBorder(new EmptyBorder(0, 0, 0, 0));
            likeButton.setBackground(MyColors.DarkMenu);
            likeButton.addActionListener(this);
//        add(likeButton);

            shareButton = new JButton();
            if (song.getShared())
                shareButton.setIcon(MyIcons.DarkShared);
            else
                shareButton.setIcon(MyIcons.DarkShare);
            shareButton.setBorderPainted(false);
            shareButton.setFocusable(false);
            shareButton.setBorder(new EmptyBorder(0, 0, 0, 0));
            shareButton.setBackground(MyColors.DarkMenu);
            shareButton.addActionListener(this);


        more = new JButton("...");
        more.setBorderPainted(false);
        more.setFocusable(false);
        more.setBorder(new EmptyBorder(0,0,0,5));
        more.setBackground(MyColors.DarkMenu);
        more.setForeground(MyColors.DarkTextColor);
        more.setFont(MyFonts.arialBold);

        more.addActionListener(this);

        //Create the popup menu.
        final JPopupMenu popup = new JPopupMenu();

        JMenuItem remove = new JMenuItem(new AbstractAction("Remove Song") {
            public void actionPerformed(ActionEvent e)
            {
//                DarkDeleteFrame deleteFrame = new DarkDeleteFrame();
                Main.darkFrame.getHomePanel().getHomeSongsArraylist().remove(song.getDarkHomeSongsItems());
                Main.darkFrame.getHomePanel().getHomeSongPanel().remove(song.getDarkHomeSongsItems());
                Main.darkFrame.getHomePanel().setVisible(false);
                Main.darkFrame.getHomePanel().setVisible(true);

                Main.darkFrame.getSongsPanel().getSongsList().remove(song.getDarkSongPanel());
                Main.darkFrame.getSongsPanel().getSongsList().setVisible(false);
                Main.darkFrame.getSongsPanel().getSongsList().setVisible(true);


            }
        });
        remove.setBackground(MyColors.DarkMenu);
        remove.setForeground(MyColors.DarkTextColor);
        popup.add(remove);
        JMenuItem addToPlaylist = new JMenuItem(new AbstractAction("Add to PlayList") {
            public void actionPerformed(ActionEvent e) {
                //delete selected song
                try {
                    Main.darkFrame.getHomePanel().getHomePlayListPanel().add(song.getDarkHomeSongsItems());
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

            }
        });
        addToPlaylist.setBackground(MyColors.DarkMenu);
        addToPlaylist.setForeground(MyColors.DarkTextColor);
        popup.add(addToPlaylist);

        more.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });

//        add(shareButton );

        time = new JLabel(song.getLength());
        time.setFont(MyFonts.arial);
        setBackground(MyColors.DarkMenu);
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
        buttons.add(more);

        buttons.setBackground(MyColors.DarkMenu);
        add(buttons , BorderLayout.EAST);
//        JPanel songInfo = new JPanel(new BorderLayout());
//        songInfo.add(musicName , BorderLayout.CENTER);
//        songInfo.add(artistName, BorderLayout.EAST);
        songInfo = new JPanel(new GridLayout());
        musicName.setText(song.getName());
        artistName.setText(song.getArtist());
        songInfo.setBackground(MyColors.DarkMenu);
        songInfo.add(musicName );
        songInfo.add(artistName);
        songInfo.setBorder(new EmptyBorder(5,5,5,5));
        songInfo.setBackground(MyColors.DarkMenu);
        time.setBorder(new EmptyBorder(5,0,5,5));
        add(songInfo , BorderLayout.CENTER);
//        add(time , BorderLayout.EAST);
        add( new JLabel(MyIcons.DarkSongHorizentalPartition), BorderLayout.SOUTH);

        playAndPause = new JButton();
        if(playOrPaused)
            playAndPause.setIcon(MyIcons.DarkPauseSmall);
        else
            playAndPause.setIcon(MyIcons.DarkPlaySmall);
        playAndPause.setBorderPainted(false);
        playAndPause.setFocusable(false);
        playAndPause.setBorder(new EmptyBorder(0,5,0,0));
        playAndPause.setBackground(MyColors.DarkMenu);
        playAndPause.addActionListener(this);
        add(playAndPause , BorderLayout.WEST);




//        JPanel likeAndSharePanel = new JPanel(new BorderLayout()); //like & share & partition
//        likeAndSharePanel.setBackground(MyColors.DarkMenu);
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
        }else if(e.getSource()==playAndPause){
            if(playOrPaused){
                playAndPause.setIcon(MyIcons.DarkPlaySmall);
                playOrPaused = false;
                System.out.println("paused...");
            }else{
                playAndPause.setIcon(MyIcons.DarkPauseSmall);
                playOrPaused = true;
                System.out.println("playing...");
            }
        }
    }
}
