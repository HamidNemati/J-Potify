package Dark;

import MainPackage.*;
import MainPackage.MyFonts;

import javax.swing.*;
import java.awt.*;

public class DarkSearchArea extends JPanel {
    public DarkSearchArea(){
        super();

        setLayout(new FlowLayout());
        setBackground(MyColors.DarkLeftBar);
        JTextField textField = new JTextField(16);
        textField.setBackground(MyColors.DarkLeftBar);
        textField.setFont(MyFonts.arial);
        textField.setBorder(new OvalBorder());
        textField.setForeground(MyColors.DarkTextColor);
        add(textField);
        JButton searchButton = new JButton(MyIcons.DarkMagnifier);
        searchButton.setBorderPainted(false);
        searchButton.setFocusable(false);
        searchButton.setBackground(MyColors.DarkLeftBar);
        searchButton.setSize(20,20);
        add(searchButton);
    }
}
