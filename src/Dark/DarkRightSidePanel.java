package Dark;

import MainPackage.MyColors;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
//scrollBar needed

public class DarkRightSidePanel extends JPanel  implements ActionListener {
    JPanel body;
    JButton addFriend;
    ArrayList<DarkFriendsInfo> myFriends;
    public DarkRightSidePanel(){
        myFriends = new ArrayList<>();
        setBackground(MyColors.DarkRightBar);
        setLayout(new BorderLayout());
        JLabel title = new JLabel();
        title.setBorder(new EmptyBorder(0,0,0,0));
        title.setIcon(MyIcons.DarkFriendsActivity);
        add(title, BorderLayout.NORTH);

//        add(new JScrollBar());
//        JScrollPane scrollPane = new JScrollPane();
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//        scrollPane.setBounds(50, 30, 300, 50);
        body = new JPanel();
        body.setLayout(new BoxLayout(body, BoxLayout.Y_AXIS));
        body.setBackground(MyColors.DarkRightBar);

        myFriends.add(new DarkFriendsInfo("HAMID","ey vay", "khashayar"));
        myFriends.add(new DarkFriendsInfo("sgr1378","Magnitised", "Tom Odell"));
        myFriends.add(new DarkFriendsInfo("Deli978","Sing Me to Sleep", "Allen Walker"));
        myFriends.add(new DarkFriendsInfo("neginhsobhani","Still loving you", "Scorpions"));
        myFriends.add(new DarkFriendsInfo("Darya_zm","Sing Me to Sleep", "Allen Walker"));
        myFriends.add(new DarkFriendsInfo("tarrat","KILL4ME", "Marilyn Manson"));


        for(DarkFriendsInfo i : myFriends){
            body.add(i);
        }
        add(body , BorderLayout.CENTER);

        addFriend = new JButton(MyIcons.DarkAddFriend);
        addFriend.setFocusable(false);
        addFriend.setBorderPainted(false);
        addFriend.addActionListener(this);
        addFriend.setBorder(new EmptyBorder(0,0,0,0));
        add(addFriend , BorderLayout.SOUTH);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==addFriend){
            DarkAddFriendFrame addFriendFrame = new DarkAddFriendFrame();
            System.out.println("friend added!");
        }
    }
}
