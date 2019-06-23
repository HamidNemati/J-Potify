package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;
import MainPackage.User;
import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DarkUserInfo extends JPanel {
    JLabel userName;
    final JButton userIcon;
    JPopupMenu popupMenu;
    public DarkUserInfo(String user){
//    public DarkUserInfo(){
        setBackground(MyColors.DarkLeftBar);
        setLayout(new BorderLayout());
        JPanel userNamePanel = new JPanel(new FlowLayout());
        userName = new JLabel(user);
        setBorder(new EmptyBorder(10,40,20,40));
        userNamePanel.setBackground(MyColors.DarkLeftBar);
        userName.setForeground(MyColors.DarkTextColor);

        userIcon = new JButton(MyIcons.DarkUser);
        userIcon.setBorderPainted(false);
        userIcon.setFocusable(false);
        userIcon.setBorder(new EmptyBorder(0,0,0,0));
        userIcon.setBackground(MyColors.DarkLeftBar);





        //Create the popup menu.
        final JPopupMenu popup = new JPopupMenu();

        JMenuItem login = new JMenuItem(new AbstractAction("Login with another account") {
            public void actionPerformed(ActionEvent e) {
                DarkLoginFrame addFriendFrame = new DarkLoginFrame();
            }
        });
        login.setBackground(MyColors.DarkMenu);
        login.setForeground(MyColors.DarkTextColor);
        popup.add(login);

        JMenuItem signUp = new JMenuItem(new AbstractAction("Create a new account") {
            public void actionPerformed(ActionEvent e) {
                DarkSignUpFrame addFriendFrame = new DarkSignUpFrame();
            }
        });
        signUp.setBackground(MyColors.DarkMenu);
        signUp.setForeground(MyColors.DarkTextColor);
        popup.add(signUp);





        userIcon.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });





        userNamePanel.add(userIcon);

//        userNamePanel.add(empty1);
        userNamePanel.add(userName);
//        userNamePanel.add(empty2);

//        add(empty1 , BorderLayout.EAST);
//        add(empty2 , BorderLayout.WEST);
        add(userNamePanel , BorderLayout.WEST);


    }
}
