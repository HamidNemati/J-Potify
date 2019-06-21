package Dark;

import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

//public class DarkPlaylistPanel extends JPanel implements Scrollable{
public class DarkPlaylistPanel extends JPanel {
    JList list;
//    ArrayList<String> playlistsArraylist = new ArrayList<>();
    ArrayList<DarkPlaylistTitle> playlistsArraylist = new ArrayList<>();



    public DarkPlaylistPanel(){
        super();
//        playlistsArraylist.add(new DarkPlaylistTitle("Shared Playlist"));

//        playlistsArraylist.add("B");
//        playlistsArraylist.add("C");

        setLayout(new BorderLayout());
        setBackground(MyColors.DarkLeftBar);
        JLabel playlistButton = new JLabel(MyIcons.DarkPlaylistButton);//playlist button
        add(playlistButton , BorderLayout.NORTH );

        JPanel playlistsList = new JPanel(new BorderLayout());// a panel that shows all of the playlists
        playlistsList.setBackground(MyColors.DarkLeftBar);

        String week[]= { "Lo-Fi beats","car"};

//        list = new JList(week);
        list = new JList(playlistsArraylist.toArray());
        list.setBackground(MyColors.DarkLeftBar);
        list.setForeground(MyColors.DarkTextColor);
        list.setSelectionBackground(MyColors.DarkTextColor);
        list.setSelectionForeground(MyColors.DarkLeftBar);
        list.setFont(MyFonts.arial);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setLayoutOrientation(JList.VERTICAL);
        playlistsList.add(list);

//        JScrollPane scroll = new JScrollPane(playlistsList);
//        this.getContentPane().add(scrollPane, BorderLayout.CENTER);
        add(playlistsList, BorderLayout.CENTER);

//        DefaultListModel<String> l1 = new DefaultListModel<>();
//        l1.addElement("Item1");
//        l1.addElement("Item2");
//        l1.addElement("Item3");
//        l1.addElement("Item4");
//        JList<String> list = new JList<>(l1);
//        list.setBounds(100,100, 75,75);
//        playlistsList.add(list);

//        final JScrollBar scrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 48, 0, 255);
//        int height = scrollBar.getPreferredSize( ).height;
//        scrollBar.setPreferredSize(new Dimension(20, height));
//        scrollBar.setForeground(MyColors.DarkFooter);
//        scrollBar.setBackground(MyColors.DarkFooter);

//        add(scrollBar , BorderLayout.EAST);

//        JScrollPane scrollPane = new JScrollPane(list);
//        scrollPane.setMinimumSize(new Dimension(100, 50));



        JButton addPlaylistButton = new JButton(MyIcons.DarkAddPlaylistButton);
        addPlaylistButton.setBorder(new EmptyBorder(0,0,0,0));
        add(addPlaylistButton , BorderLayout.SOUTH);

    }


}
