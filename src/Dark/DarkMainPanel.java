package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;
import MainPackage.OvalBorder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class DarkMainPanel extends JPanel implements ActionListener {
    private JPanel title;
    private JPanel body;
    private JPanel homePlayListPanel;
    private JPanel SongsPanel;
    private JButton addSong;
    private ArrayList<DarkSongPanel> songsArraylist;
    public DarkMainPanel(String headerName){// non playlist pages
        super();
        setLayout(new BorderLayout());
        songsArraylist= new ArrayList<>();
//        title = new JPanel(new GridLayout(1,3));
        title = new JPanel(new BorderLayout());
        title.setBackground(MyColors.DarkMenu);
        JLabel leftLowPoly = new JLabel(MyIcons.DarkTitleLeft);
        leftLowPoly.setBackground(Color.magenta);
        title.add(leftLowPoly , BorderLayout.WEST);
        JLabel RightLowPoly = new JLabel(MyIcons.DarkTitleRight);
        title.add(RightLowPoly , BorderLayout.EAST);
        JLabel titleName = new JLabel();
        JPanel titleNamePanel = new JPanel(new BorderLayout());
        titleName.setForeground(MyColors.DarkTextColor);
        titleName.setBackground(MyColors.DarkTextColor);
        titleName.setText(headerName);
        titleNamePanel.setBackground(MyColors.DarkMenu);
        titleName.setFont(MyFonts.heavyTitle);
        titleNamePanel.add(titleName, BorderLayout.WEST);
        title.add(titleNamePanel , BorderLayout.CENTER);
        add(title, BorderLayout.NORTH);
        ///////////////////////////////////////////////////////////
        body = new JPanel();
        body.setBackground(MyColors.DarkBackground);


        if(headerName.equals("HOME")){
            //playlists
            body.setLayout(new GridLayout(2,1));
            homePlayListPanel = new JPanel();
            TitledBorder playlistBorder = new TitledBorder(new OvalBorder(MyColors.DarkFooter,MyColors.DarkerTextColor), "Playlists");
            playlistBorder.setTitleFont(MyFonts.cursiveTitle);
            playlistBorder.setTitleColor(MyColors.DarkTextColor);
            homePlayListPanel.setBorder(playlistBorder);
            homePlayListPanel.setBackground(MyColors.DarkBackground);
            body.add(homePlayListPanel);
            //songs
            SongsPanel = new JPanel();
//            TitledBorder songsBorder = new TitledBorder(new LineBorder(MyColors.DarkerTextColor, 2), "Songs");
            TitledBorder songsBorder = new TitledBorder(new OvalBorder(MyColors.DarkerTextColor,MyColors.DarkTextColor), "Songs");
            songsBorder.setTitleFont(MyFonts.cursiveTitle);
            songsBorder.setTitleColor(MyColors.DarkTextColor);
            SongsPanel.setBorder(songsBorder);
            SongsPanel.setBackground(MyColors.DarkBackground);
            body.add(SongsPanel);


            body.setBorder(new EmptyBorder(5,20,20,20));
            ////////////////////////////////////////////////////////////////////////////////////////////////
        }else  if(headerName.equals("SONGS")){
            body.setLayout(new BorderLayout());
            JPanel songsList = new JPanel();
//            songsList.setLayout(new GridLayout(15,1));
            songsList.setLayout(new BoxLayout(songsList , BoxLayout.Y_AXIS));
            songsList.setMinimumSize(new Dimension(1000,500));
            songsList.setMaximumSize(new Dimension(1000,500));
            addSong = new JButton("addSong");
            addSong.addActionListener(this);
            body.add(addSong , BorderLayout.NORTH);
            songsArraylist.add(new DarkSongPanel("Something to remind you","Staind",true,false, "4:09"));
            songsArraylist.add(new DarkSongPanel("Still Loving You","Scorpions",true,false, "4:09"));
            songsArraylist.add(new DarkSongPanel("Something to remind you","Staind",true,false, "4:09"));

            for (DarkSongPanel i: songsArraylist){
                songsList.add(i);
            }
            body.setBorder(new EmptyBorder(5,20,20,20));
            body.add(songsList , BorderLayout.CENTER);
        }else  if(headerName.equals("ALBUMS")){

            body.setBorder(new EmptyBorder(5,20,20,20));
        }

        add(body, BorderLayout.CENTER);
    }
    ///////////////////////////////////////////////////////////////////////////////
//    public DarkMainPanel(Playlist playlist){
    public DarkMainPanel(int playlist){
        super(new BorderLayout());
        JPanel header = new JPanel(new BorderLayout());
        JLabel playlistArtwork = new JLabel(MyIcons.DarkNoArtwork);
        playlistArtwork.setBorder(new EmptyBorder(20,20,20,20));
        header.add(playlistArtwork, BorderLayout.WEST);

        JPanel playlistHeaderTexts = new JPanel(new BorderLayout());
        playlistHeaderTexts.setBorder(new EmptyBorder(90,0,70,0));

        JLabel playlistHeaderTitle = new JLabel("PLAYLIST");
        playlistHeaderTitle.setFont(MyFonts.arial);
        playlistHeaderTitle.setForeground(MyColors.DarkTextColor);

        JLabel playlistHeaderNameTitle = new JLabel("HARDCORE");
        playlistHeaderNameTitle.setFont(MyFonts.heavyTitle);
        playlistHeaderNameTitle.setForeground(MyColors.DarkTextColor);

        playlistHeaderTexts.add(playlistHeaderNameTitle, BorderLayout.CENTER);
        playlistHeaderTexts.add(playlistHeaderTitle, BorderLayout.NORTH);
        header.add(playlistHeaderTexts , BorderLayout.CENTER);
        JLabel partition = new JLabel(MyIcons.DarkFriendsActivitHorizentalPartition);
        header.add(partition , BorderLayout.SOUTH);

        add(header,BorderLayout.NORTH);

        //Body

        JPanel body = new JPanel();
        body.setBackground(MyColors.DarkBackground);
        add(body , BorderLayout.CENTER);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addSong){

        }

    }
}
