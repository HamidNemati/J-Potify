package Dark;

import MainPackage.MyColors;
import MainPackage.*;
//import com.sun.deploy.panel.NodeBorder;
//import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkLeftSidePanel extends JPanel implements ActionListener {
    private JButton songsButton;
    private JButton albumsButton;
    private DarkPlaylistPanel playlistPanel;
    public static JLabel artwork;

    public DarkPlaylistPanel getPlaylistPanel() {
        return playlistPanel;
    }

    public DarkLeftSidePanel (){
        super();
        setBackground(MyColors.DarkFooter);
        setLayout(new BorderLayout());

        JPanel artworkPanel = new JPanel();// for showing music artwork
        artwork = new JLabel();
        artwork.setMinimumSize(new Dimension(200,200));
        artwork.setMaximumSize(new Dimension(200,200));
        if (DarkControlButtons.player.getCurrentSong() != null){
            if (DarkControlButtons.player.getCurrentSong().isHasId3v2Tag()) {
                artwork.setIcon(DarkControlButtons.player.getCurrentSong().getArtWork());
            }
        }else
            artwork.setIcon(MyIcons.DarkNoArtwork);



        artworkPanel.add(artwork , BorderLayout.CENTER);
        add(artwork, BorderLayout.SOUTH);

        JPanel buttonsAndPlaylists = new JPanel(new BorderLayout());// the part that contain buttons such as "playlists" and ...
        buttonsAndPlaylists.setBackground(MyColors.DarkFooter);
        buttonsAndPlaylists.setBackground(MyColors.DarkTextColor);


        songsButton = new JButton(MyIcons.DarkSongsButton);
        songsButton.addActionListener(this);
        songsButton.setBorder(new EmptyBorder(0,0,0,0));

//        buttonsAndPlaylists.add(playlistButton );
        albumsButton = new JButton(MyIcons.DarkAlbumsButton);
        albumsButton.addActionListener(this);
        albumsButton.setBorder(new EmptyBorder(0,0,0,0));
//        buttonsAndPlaylists.add(addPlaylistButton );
        JPanel songsAndAlbumButtons = new JPanel(new GridLayout(2,1));
        songsAndAlbumButtons.add(songsButton);
        songsAndAlbumButtons.add(albumsButton);
        buttonsAndPlaylists.add(songsAndAlbumButtons, BorderLayout.NORTH);
        playlistPanel = new DarkPlaylistPanel();
        playlistPanel.setBackground(MyColors.DarkLeftBar);
        buttonsAndPlaylists.add(playlistPanel , BorderLayout.CENTER);
        add(buttonsAndPlaylists , BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==songsButton){
            System.out.println("SONGS");
            Main.darkFrame.addSongsToMainPanel();
        }else if (e.getSource()==albumsButton){
            System.out.println("ALBUM");
            Main.darkFrame.addAlbumsToMainPanel();
        }
    }



}
