package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;

import javax.swing.*;

public class DarkMenu extends JMenuBar {
    public DarkMenu(){
        super();
        setBackground(MyColors.DarkMenu);
        setBorderPainted(false);
        JMenu menu = new JMenu("Menu");
        menu.setForeground(MyColors.DarkTextColor);
        menu.setFont(MyFonts.arial);
        add(menu);

        JMenuItem setting = new JMenuItem("Setting");
        setting.setBackground(MyColors.DarkFooter);
        setting.setFont(MyFonts.arial);
        setting.setForeground(MyColors.DarkTextColor);
        setting.setBorderPainted(false);

        menu.add(setting);


        JMenuItem aboutUs = new JMenuItem("About Us...");
        aboutUs.setBackground(MyColors.DarkFooter);
        aboutUs.setFont(MyFonts.arial);
        aboutUs.setForeground(MyColors.DarkTextColor);
        aboutUs.setBorderPainted(false);
        menu.add(aboutUs);


    }
}
