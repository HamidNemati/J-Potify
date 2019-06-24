package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkDeleteFrame extends JFrame implements ActionListener {

    private JButton delete = new JButton("DELETE");
    private JButton cancel = new JButton("CANCEL");
    public DarkDeleteFrame(){
        setMinimumSize(new Dimension(600,400));
        setMaximumSize(new Dimension(600,400));
        setResizable(false);
        //header
        JPanel header = new JPanel(new BorderLayout());
        header.add(new JLabel(MyIcons.DarkTitleLeft) , BorderLayout.WEST);
        header.add(new JLabel(MyIcons.DarkTitleRight) , BorderLayout.EAST);
        JLabel createPlaylistTitle = new JLabel("Delete");
        createPlaylistTitle.setFont(MyFonts.heavyTitle);
        createPlaylistTitle.setBackground(MyColors.DarkRightBar);
        createPlaylistTitle.setForeground(MyColors.DarkTextColor);
        header.add(createPlaylistTitle , BorderLayout.CENTER);
        header.setBackground(MyColors.DarkMenu);
        add(header , BorderLayout.NORTH);
        //body
        delete.setFont(MyFonts.arialBold);
        JPanel body = new JPanel(new BorderLayout());
        body.setBackground(MyColors.DarkBackground);
        JPanel buttons = new JPanel(new BorderLayout());
        buttons.add(delete , BorderLayout.WEST);
        buttons.add(cancel , BorderLayout.EAST);
        JLabel text = new JLabel("Do you really want to remove this from Your library?");
        text.setForeground(MyColors.DarkTextColor);
        text.setFont(MyFonts.arialBold);


        body.add(text , BorderLayout.CENTER);
        body.add(buttons , BorderLayout.SOUTH);
        add(body , BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
