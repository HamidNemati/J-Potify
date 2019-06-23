package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;

public class DarkSignUpFrame extends JFrame implements ActionListener {
    JTextField username;
    JPasswordField password;
    JButton click;

    public DarkSignUpFrame(){
        super();
        setMinimumSize(new Dimension(490,300));
        setMaximumSize(new Dimension(490,300));
        setResizable(false);
        //header
        JPanel header = new JPanel(new BorderLayout());
        header.add(new JLabel(MyIcons.DarkTitleLeft) , BorderLayout.WEST);
        header.add(new JLabel(MyIcons.DarkTitleRight) , BorderLayout.EAST);
        JLabel createPlaylistTitle = new JLabel("SignUp");
        createPlaylistTitle.setFont(MyFonts.heavyTitle);
        createPlaylistTitle.setBackground(MyColors.DarkRightBar);
        createPlaylistTitle.setForeground(MyColors.DarkTextColor);
        header.add(createPlaylistTitle , BorderLayout.CENTER);
        header.setBackground(MyColors.DarkMenu);
        add(header , BorderLayout.NORTH);
        //body
        JPanel bodyGrid = new JPanel(new GridLayout(4,1));
        JPanel body = new JPanel(new BorderLayout());
        body.setBackground(MyColors.DarkLeftBar);
//        artwork = new JLabel(MyIcons.DarkNoArtwork);
//        artwork.setBorder(new EmptyBorder(0,20,0,0));
//        artwork.setMinimumSize(new Dimension(200,200));
//        artwork.setMaximumSize(new Dimension(200,200));
//        body.add(artwork , BorderLayout.WEST);
        JPanel usernameAndPassword = new JPanel(new BorderLayout());
        usernameAndPassword.setBorder(new EmptyBorder(20,20,30,20));
        JLabel usernameLable = new JLabel("USERNAME:");
        usernameLable.setFont(MyFonts.arialBold);
        usernameLable.setForeground( MyColors.DarkTextColor);
        username = new JTextField(16);
        username.setFont(MyFonts.arial);
        JLabel passwordLable = new JLabel("PASSWORD:");
        passwordLable.setFont(MyFonts.arialBold);
        passwordLable.setForeground( MyColors.DarkTextColor);
        password = new JPasswordField();
        password.setFont(MyFonts.arial);
        JPanel namePanel = new JPanel(new GridLayout(2,1));
        namePanel.setBackground(MyColors.DarkLeftBar);
        usernameAndPassword.setBackground(MyColors.DarkLeftBar);
        namePanel.add(usernameLable);
        namePanel.add(username);
        JPanel passwordPanel = new JPanel(new BorderLayout());
        passwordPanel.setBackground(MyColors.DarkLeftBar);
        passwordPanel.add(passwordLable , BorderLayout.NORTH);
        passwordPanel.add(password , BorderLayout.SOUTH);
        passwordPanel.setBorder(new EmptyBorder(20,0,0,0));
        usernameAndPassword.add(namePanel , BorderLayout.NORTH);
        usernameAndPassword.add(passwordPanel , BorderLayout.CENTER);

        click = new JButton("SignUp!");
        click.setBorderPainted(false);
        click.setFocusable(false);
        click.setBorder(new EmptyBorder(0,0,5,0));
        click.setForeground(MyColors.DarkTextColor);
        click.setBackground(MyColors.DarkLeftBar);
        click.setFont(MyFonts.arialBold);
        click.addActionListener(this);
        add(click , BorderLayout.SOUTH);



        body.add(usernameAndPassword, BorderLayout.CENTER);
        //add(body , BorderLayout.CENTER);
        bodyGrid.add(usernameLable);
        bodyGrid.add(username);
        bodyGrid.add(passwordLable);
        bodyGrid.add(password);
        bodyGrid.setBorder(new EmptyBorder(10,50,10,50));
        bodyGrid.setBackground(MyColors.DarkLeftBar);
        add(bodyGrid , BorderLayout.CENTER);


        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==click){
            //add it to play list and closse the window

        }
    }
}
