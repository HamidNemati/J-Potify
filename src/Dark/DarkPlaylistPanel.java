package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DarkPlaylistPanel extends JPanel implements ActionListener {
    JList list;
    ArrayList<DarkPlaylistTitle> playlistsArraylist;
    JButton addPlaylistButton;
    JPanel playlistsList;
    DarkPlaylistTitle sharedPlaylist;
    DarkPlaylistTitle favouritePlaylist;


    public DarkPlaylistPanel(){
        super();
        playlistsArraylist = new ArrayList<>();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkLeftBar);
        JLabel playlistButton = new JLabel(MyIcons.DarkPlaylistButton);//playlist button
        add(playlistButton , BorderLayout.NORTH );

//        JPanel playlistsList = new JPanel(new BorderLayout());// a panel that shows all of the playlists
        playlistsList = new JPanel();// a panel that shows all of the playlists
        playlistsList.setLayout(new BoxLayout(playlistsList , BoxLayout.Y_AXIS));
        playlistsList.setBackground(MyColors.DarkLeftBar);



        sharedPlaylist = new DarkPlaylistTitle("Shared Playlist");
        favouritePlaylist = new DarkPlaylistTitle("Favourite Playlist");
        playlistsArraylist.add(sharedPlaylist);
        playlistsArraylist.add(favouritePlaylist);
        playlistsArraylist.add(new DarkPlaylistTitle("HARDCORE"));
        playlistsArraylist.add(new DarkPlaylistTitle("GoWithFlow"));


        for (DarkPlaylistTitle i : playlistsArraylist){
            playlistsList.add(i);
        }

        JScrollPane scrollPane = new JScrollPane(playlistsList , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(10, 600));
        scrollPane.setBackground(Color.MAGENTA);
        scrollPane.setBackground(Color.ORANGE);
        scrollPane.setAlignmentX(LEFT_ALIGNMENT);

        add(scrollPane);

        add(playlistsList, BorderLayout.CENTER);

//        add(scrollPane, BorderLayout.CENTER);


        addPlaylistButton = new JButton(MyIcons.DarkAddPlaylistButton);
        addPlaylistButton.addActionListener(this);
        addPlaylistButton.setBorder(new EmptyBorder(0,0,0,0));
        add(addPlaylistButton , BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==addPlaylistButton){
            DarkAddPlaylistFrame addPlaylistFrame = new DarkAddPlaylistFrame();
            System.out.println("playlist added");
            DarkPlaylistTitle newPlaylist = new DarkPlaylistTitle("New Playlist");
            playlistsList = new JPanel();
            playlistsArraylist.add(newPlaylist);
            playlistsList.add(newPlaylist);
            for (DarkPlaylistTitle i : playlistsArraylist){
                playlistsList.add(i);
            }
        }
    }
}
