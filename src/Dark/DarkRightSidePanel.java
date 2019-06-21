package Dark;

import MainPackage.MyColors;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
//scrollBar needed

public class DarkRightSidePanel extends JPanel {
    public DarkRightSidePanel(){
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
    }
}
