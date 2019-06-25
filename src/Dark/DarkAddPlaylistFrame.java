package Dark;

import Logic.playList;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class DarkAddPlaylistFrame extends JFrame implements ActionListener {
    JTextField playlistName;
    JTextArea description;
    JLabel artwork;
    JButton click;

    public DarkAddPlaylistFrame(){
        super();
        setMinimumSize(new Dimension(680,400));
        setMaximumSize(new Dimension(680,400));
        setResizable(false);
        //header
        JPanel header = new JPanel(new BorderLayout());
        header.add(new JLabel(MyIcons.DarkTitleLeft) , BorderLayout.WEST);
        header.add(new JLabel(MyIcons.DarkTitleRight) , BorderLayout.EAST);
        JLabel createPlaylistTitle = new JLabel("Create Playlist");
        createPlaylistTitle.setFont(MyFonts.heavyTitle);
        createPlaylistTitle.setBackground(MyColors.DarkRightBar);
        createPlaylistTitle.setForeground(MyColors.DarkTextColor);
        header.add(createPlaylistTitle , BorderLayout.CENTER);
        header.setBackground(MyColors.DarkMenu);
        add(header , BorderLayout.NORTH);
        //body
        JPanel body = new JPanel(new BorderLayout());
        body.setBackground(MyColors.DarkLeftBar);
        artwork = new JLabel(MyIcons.DarkNoArtwork);
        artwork.setBorder(new EmptyBorder(0,20,0,0));
        artwork.setMinimumSize(new Dimension(200,200));
        artwork.setMaximumSize(new Dimension(200,200));
        body.add(artwork , BorderLayout.WEST);
        JPanel playlistDetails = new JPanel(new BorderLayout());
        playlistDetails.setBorder(new EmptyBorder(20,20,30,20));
        JLabel nameTitle = new JLabel("Name:");
        nameTitle.setFont(MyFonts.arialBold);
        nameTitle.setForeground( MyColors.DarkTextColor);
        playlistName = new JTextField(16);
        playlistName.setFont(MyFonts.arial);
        JLabel descriptionTitle = new JLabel("Description:");
        descriptionTitle.setFont(MyFonts.arialBold);
        descriptionTitle.setForeground( MyColors.DarkTextColor);
        description = new JTextArea();
        description.setFont(MyFonts.arial);
        JPanel namePanel = new JPanel(new GridLayout(2,1));
        namePanel.setBackground(MyColors.DarkLeftBar);
        playlistDetails.setBackground(MyColors.DarkLeftBar);
        namePanel.add(nameTitle);
        namePanel.add(playlistName);
        JPanel descriptionPanel = new JPanel(new BorderLayout());
        descriptionPanel.setBackground(MyColors.DarkLeftBar);
        descriptionPanel.add(descriptionTitle , BorderLayout.NORTH);
        descriptionPanel.add(description , BorderLayout.CENTER);
        descriptionPanel.setBorder(new EmptyBorder(20,0,0,0));
        playlistDetails.add(namePanel , BorderLayout.NORTH);
        playlistDetails.add(descriptionPanel , BorderLayout.CENTER);

        click = new JButton("Create");
        click.setBorderPainted(false);
        click.setFocusable(false);
        click.setBorder(new EmptyBorder(0,0,5,0));
        click.setForeground(MyColors.DarkTextColor);
        click.setBackground(MyColors.DarkLeftBar);
        click.setFont(MyFonts.arialBold);
        click.addActionListener(this);
        add(click , BorderLayout.SOUTH);



        body.add(playlistDetails, BorderLayout.CENTER);
        add(body , BorderLayout.CENTER);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==click){
            playList playList = new playList(playlistName.getText() , description.getText());
            DarkControlButtons.player.playLists.add(playList);
            System.out.println(DarkControlButtons.player.playLists.size());
            click.setText("created!");
            for(int i = 0 ; i < 1000 ; i++){

            }
            this.setVisible(false);

            //add it to play list and closse the window

        }
    }
}
