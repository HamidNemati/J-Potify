package MainPackage;

import Dark.DarkFrame;
import Dark.DarkMusicInfo;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static boolean playOrPause = false;// true = playing(pause icon) ... false = paused(play icon)
    public static boolean SuffleOrNot = false;
    public static boolean replayAllOrNot = false;
    public static void main(String[] args) {
         DarkFrame darkFrame = new DarkFrame(playOrPause);
//         Scanner scanner = new Scanner(System.in);
//         int x = scanner.nextInt();
//         playOrPause=true;
//         darkFrame = new DarkFrame(playOrPause);

//
//        JFrame frame = new JFrame();
//        JPanel panel = new JPanel();
//        for (int i = 0; i < 10; i++) {
//            panel.add(new JButton("Hello-" + i));
//        }
//        JScrollPane scrollPane = new JScrollPane(panel);
//        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//        scrollPane.setBounds(50, 30, 300, 50);
//        JPanel contentPane = new JPanel(null);
//        contentPane.setPreferredSize(new Dimension(500, 400));
//        contentPane.add(scrollPane);
//        frame.setContentPane(contentPane);
//        frame.pack();
//        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        frame.setVisible(true);

    }
}
