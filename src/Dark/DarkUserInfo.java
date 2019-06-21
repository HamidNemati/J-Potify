package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;
import MainPackage.User;
import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class DarkUserInfo extends JPanel {
    JLabel userName;
    JLabel userIcon;
    public DarkUserInfo(String user){
//    public DarkUserInfo(){
        setBackground(MyColors.DarkLeftBar);
        setLayout(new BorderLayout());
        JPanel userNamePanel = new JPanel(new FlowLayout());
        userName = new JLabel(user);
        setBorder(new EmptyBorder(10,40,20,40));
        userNamePanel.setBackground(MyColors.DarkLeftBar);
        userName.setForeground(MyColors.DarkTextColor);

        userIcon = new JLabel(MyIcons.DarkUser);
        userNamePanel.add(userIcon);

//        userNamePanel.add(empty1);
        userNamePanel.add(userName);
//        userNamePanel.add(empty2);

//        add(empty1 , BorderLayout.EAST);
//        add(empty2 , BorderLayout.WEST);
        add(userNamePanel , BorderLayout.WEST);


    }
}
