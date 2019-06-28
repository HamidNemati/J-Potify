package Dark;

import Logic.Player;
import Logic.Song;
import Logic.playList;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DarkSelectAPlaylistFrame extends JFrame implements ActionListener {
    JPanel playlistsList;
    Song song;
    ArrayList<playList> playlistIcons;
    DarkHomePlaylistsItemsForSelecting shared;
    DarkHomePlaylistsItemsForSelecting favourite;

    public DarkSelectAPlaylistFrame(Song song) {
        super();
//        shared = new DarkHomePlaylistsItemsForSelecting(Player.sharedPlaylist);
//        favourite = new DarkHomePlaylistsItemsForSelecting(Player.favouritePlaylist);

        playlistIcons = new ArrayList<>();
        this.song = song;
        setLayout(new BorderLayout());
        setSize(new Dimension(800, 600));
        JPanel header = new JPanel(new BorderLayout());
        header.add(new JLabel(MyIcons.DarkTitleLeft), BorderLayout.WEST);
        header.add(new JLabel(MyIcons.DarkTitleRight), BorderLayout.EAST);
        JLabel deletePlaylistTitle = new JLabel("Select a playlist");
        deletePlaylistTitle.setFont(MyFonts.heavyTitle);
        deletePlaylistTitle.setHorizontalAlignment(SwingConstants.CENTER);
        deletePlaylistTitle.setBackground(MyColors.DarkRightBar);
        deletePlaylistTitle.setForeground(MyColors.DarkTextColor);
        header.add(deletePlaylistTitle, BorderLayout.CENTER);
        header.setBackground(MyColors.DarkMenu);
        add(header, BorderLayout.NORTH);

        JPanel bodyBody = new JPanel(new BorderLayout());


        JPanel body = new JPanel();
        body.setLayout(new FlowLayout());
        body.setBackground(MyColors.DarkBackground);
        JPanel playlistsListpanel = new JPanel(new BorderLayout());
        playlistsList = new JPanel();
        playlistsList.setLayout(new FlowLayout());
//            playlistsList.setLayout(new GridLayout(4,4));

        playlistsList.setBackground(MyColors.Trancparent);
        playlistsList.setMinimumSize(new Dimension(1000, 500));
        playlistsList.setMaximumSize(new Dimension(1000, 500));

        JScrollPane scrollPane = new JScrollPane(body , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setBackground(MyColors.DarkFooter);
        scrollPane.setBorder(new EmptyBorder(0,0,0,0));
        this.add(scrollPane);

        playlistsListpanel.setBackground(MyColors.DarkBackground);
        playlistsListpanel.add(playlistsList, BorderLayout.CENTER);

//        playlistsList.add(favourite);
//        playlistsList.add(shared);

//        favourite.addActionListener(this);
//        shared.addActionListener(this);


//        playlistIcons.add(Player.sharedPlaylist);
//        playlistIcons.add(Player.favouritePlaylist);

        for (playList i : Player.getPlayLists()) {
            playlistsList.add(i.getHomePlaylistsItemsForSelectingPlayListFrame());
            playlistIcons.add(i);
            i.getHomePlaylistsItemsForSelectingPlayListFrame().addActionListener(this);
        }

        body.add(playlistsListpanel);
//            body.add(addPlaylist , BorderLayout.NORTH);

        body.setBorder(new EmptyBorder(5, 20, 20, 20));
//            body.add(addPlaylist , BorderLayout.CENTER);
        bodyBody.add(scrollPane , BorderLayout.CENTER);
        bodyBody.setBackground(MyColors.DarkBackground);
        JLabel text = new JLabel("Select one of your own playlists to add \""+song.getName() + "\" to it...");
        text.setFont(MyFonts.arialBold);
        text.setBackground(MyColors.DarkBackground);
        text.setForeground(MyColors.DarkTextColor);
        text.setHorizontalAlignment(JLabel.CENTER);


        bodyBody.add(text , BorderLayout.NORTH);



        add(bodyBody, BorderLayout.CENTER);
        setVisible(true);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        Song addedSong = this.song;
        for (playList i : playlistIcons) {
            if(e.getSource()==i.getHomePlaylistsItemsForSelectingPlayListFrame()){
                i.addSongs(addedSong);
                break;
            }
        }
        this.dispose();

    }
}
