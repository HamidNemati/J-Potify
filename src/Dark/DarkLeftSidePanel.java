package Dark;

import MainPackage.MyColors;
import MainPackage.MyIcons;
import com.sun.deploy.panel.NodeBorder;
import com.sun.xml.internal.messaging.saaj.soap.JpegDataContentHandler;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DarkLeftSidePanel extends JPanel {
    private JButton songsButton;
    private JButton albumsButton;
    private DarkPlaylistPanel playlistPanel;

    public DarkLeftSidePanel(){
        super();
        setBackground(MyColors.DarkFooter);
        setLayout(new BorderLayout());

        JPanel artworkPanel = new JPanel();// for showing music artwork
        JLabel artwork = new JLabel();
        artwork.setMinimumSize(new Dimension(200,200));
        artwork.setMaximumSize(new Dimension(200,200));
        artwork.setIcon(MyIcons.DarkNoArtwork);
        artworkPanel.add(artwork , BorderLayout.CENTER);
        add(artwork, BorderLayout.SOUTH);

        JPanel buttonsAndPlaylists = new JPanel(new BorderLayout());// the part that contain buttons such as "playlists" and ...
        buttonsAndPlaylists.setBackground(MyColors.DarkFooter);
        buttonsAndPlaylists.setBackground(MyColors.DarkTextColor);


        songsButton = new JButton(MyIcons.DarkSongsButton);
        //songsButton.addActionListener(DarkMainPanel);
        songsButton.setBorder(new EmptyBorder(0,0,0,0));

//        buttonsAndPlaylists.add(playlistButton );
        albumsButton = new JButton(MyIcons.DarkAlbumsButton);
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
}
