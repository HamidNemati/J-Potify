package Dark;

import Logic.Song;
import MainPackage.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkDeleteFrame extends JFrame implements ActionListener {

    private JButton delete = new JButton("DELETE");
    private JButton cancel = new JButton("CANCEL");
    public DarkDeleteFrame(Song song){
        setMinimumSize(new Dimension(600,400));
        setMaximumSize(new Dimension(600,400));
        setResizable(false);
        //header
        JPanel header = new JPanel(new BorderLayout());
        header.add(new JLabel(MyIcons.DarkTitleLeft) , BorderLayout.WEST);
        header.add(new JLabel(MyIcons.DarkTitleRight) , BorderLayout.EAST);
        JLabel deletePlaylistTitle = new JLabel("Delete");
        deletePlaylistTitle.setFont(MyFonts.heavyTitle);
        deletePlaylistTitle.setHorizontalAlignment(SwingConstants.CENTER);
        deletePlaylistTitle.setBackground(MyColors.DarkRightBar);
        deletePlaylistTitle.setForeground(MyColors.DarkTextColor);
        header.add(deletePlaylistTitle , BorderLayout.CENTER);
        header.setBackground(MyColors.DarkMenu);
        add(header , BorderLayout.NORTH);
        //body
        delete.setFont(MyFonts.arialBold);
        delete.setBackground(MyColors.DarkerTextColor);
        delete.setForeground(MyColors.DarkTextColor);
        delete.setFocusable(false);
        delete.setBorderPainted(false);
        delete.setBorder(new EmptyBorder(10,10,10,10));
        delete.addActionListener(this);

        cancel.setFont(MyFonts.arialBold);
        cancel.setBackground(MyColors.DarkerTextColor);
        cancel.setForeground(MyColors.DarkTextColor);
        cancel.setFocusable(false);
        cancel.setBorderPainted(false);
        cancel.setBorder(new EmptyBorder(10,10,10,10));
        cancel.addActionListener(this);

//        JPanel body = new JPanel(new BorderLayout());
        GradientPanel body = new GradientPanel(MyColors.DarkMenu , MyColors.DarkerTextColor);
        body.setLayout(new BorderLayout());
        body.setBackground(MyColors.DarkBackground);
        JPanel buttons = new JPanel(new BorderLayout());
        buttons .setBackground(MyColors.DarkerTextColor);
        buttons.add(delete , BorderLayout.WEST);
        buttons.add(cancel , BorderLayout.EAST);
        JLabel text = new JLabel("Do you really want to remove this from Your library?");
        text.setHorizontalAlignment(JLabel.CENTER);
        text.setForeground(MyColors.DarkTextColor);
        text.setFont(MyFonts.arialBold);


        body.add(text , BorderLayout.CENTER);
        body.add(buttons , BorderLayout.SOUTH);
        add(body , BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==delete){
            //remove the song
        }else if(e.getSource()==cancel){
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        }
    }
}
