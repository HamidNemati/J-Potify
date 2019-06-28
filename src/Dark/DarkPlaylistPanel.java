package Dark;

import Logic.Player;
import Logic.playList;
import MainPackage.Main;
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

    JButton playlistButton = new JButton();//playlist button

    public void addPlaylistToPanel(playList playList){
        playlistsArraylist.add(playList.getPlaylistTitle());
        playlistsList.removeAll();

        for (DarkPlaylistTitle i : playlistsArraylist){
            playlistsList.add(i);
        }

    }

    public DarkPlaylistPanel(){
        super();
        playlistButton.setIcon(MyIcons.DarkPlaylistButton);
        playlistButton.setFocusable(false);
        playlistButton.setBorderPainted(false);
        playlistButton.setBorder(new EmptyBorder(0,0,0,0));
        playlistsArraylist = new ArrayList<>();
        setLayout(new BorderLayout());
        setBackground(MyColors.DarkLeftBar);
        add(playlistButton , BorderLayout.NORTH );
        playlistButton.addActionListener(this);
//        JPanel playlistsList = new JPanel(new BorderLayout());// a panel that shows all of the playlists
        playlistsList = new JPanel();// a panel that shows all of the playlists
        playlistsList.setLayout(new BoxLayout(playlistsList , BoxLayout.Y_AXIS));
//        playlistsList.setLayout(new FlowLayout());
//        playlistsList.setLayout(new GridLayout(0,1));
        playlistsList.setBackground(MyColors.DarkLeftBar);



        sharedPlaylist = Player.sharedPlaylist.getPlaylistTitle();
        favouritePlaylist = Player.favouritePlaylist.getPlaylistTitle();


        playlistsArraylist.add(sharedPlaylist);
        playlistsArraylist.add(favouritePlaylist);
//        playlistsArraylist.add(new DarkPlaylistTitle("HARDCORE"));
//        playlistsArraylist.add(new DarkPlaylistTitle("GoWithFlow"));


        for (DarkPlaylistTitle i : playlistsArraylist){
            playlistsList.add(i);

        }

        JScrollPane scrollPane = new JScrollPane(playlistsList , ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setBackground(MyColors.DarkFooter);
        scrollPane.setBorder(new EmptyBorder(0,0,0,0));
        this.add(scrollPane);
//        add(playlistsList, BorderLayout.CENTER);

//        Main.darkFrame.getContentPane().add(scrollPane);


        addPlaylistButton = new JButton(MyIcons.DarkAddPlaylistButton);
        addPlaylistButton.addActionListener(this);
        addPlaylistButton.setBorder(new EmptyBorder(0,0,0,0));
        add(addPlaylistButton , BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source==addPlaylistButton){
            System.out.println("adding a playlist:");
            DarkAddPlaylistFrame addPlaylistFrame = new DarkAddPlaylistFrame();
        }else if(e.getSource()==playlistButton){
            System.out.println("Playlists");
            Main.darkFrame.addPlaylistsToMainPanel();
        }
    }
}
