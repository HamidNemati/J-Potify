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

public class DarkMainPanel extends JPanel implements ActionListener {
    private JPanel title;
    private JPanel body;
    private JPanel homePlayListPanel;
    private JPanel SongsPanel;
    public DarkMainPanel(String headerName){
        setLayout(new BorderLayout());
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
        }else  if(headerName.equals("SONGS")){

            body.setBorder(new EmptyBorder(5,20,20,20));
        }else  if(headerName.equals("ALBUMS")){

            body.setBorder(new EmptyBorder(5,20,20,20));
        }

        add(body, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }
}
