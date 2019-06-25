package Dark;

import Logic.Player;
import MainPackage.MyColors;
import MainPackage.MyIcons;
import javazoom.jl.player.advanced.AdvancedPlayer;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DarkControlButtons extends JPanel implements ActionListener {
    public static boolean playOrPauseParameter = false;// true = playing(pause icon) ... false = paused(play icon)
    public static boolean SuffleOrNot = false;
    public static boolean replayAllOrNot = true;

    JButton replay = new JButton(MyIcons.DarkReplayAll);
    JButton playOrPause = new JButton();
    JButton next = new JButton(MyIcons.DarkNext);
    JButton previous = new JButton(MyIcons.DarkPrevious);
    JButton shuffle = new JButton(MyIcons.DarkShuffleOff);
    static Player player ;






    public DarkControlButtons(boolean playOrPaused) throws Exception {
        super();

        player = new Player();
        setLayout(new GridLayout(1,5));
        setBackground(MyColors.DarkFooter);


        shuffle.setBackground(MyColors.DarkFooter);
        shuffle.setSize(50,50);
        shuffle.setBorder(new EmptyBorder(10,20,10,10));
        shuffle.setBorderPainted(false);
        shuffle.setFocusable(false);
        shuffle.addActionListener(this);
        shuffle.setActionCommand("shuffle");
        add(shuffle);

        previous.setBackground(MyColors.DarkFooter);
        previous.setSize(50,50);
        previous.setBorder(new EmptyBorder(10,10,10,10));
        previous.setMaximumSize(new Dimension(50,50));
        previous.setBorder(new EmptyBorder(10,10,10,10));
        previous.setBorderPainted(false);
        previous.setFocusable(false);
        previous.addActionListener(this);
        previous.setActionCommand("previous");
        add(previous );

        if(!playOrPauseParameter)
            playOrPause.setIcon(MyIcons.DarkPlay);
        else
            playOrPause.setIcon(MyIcons.DarkPause);
        playOrPause.setBackground(MyColors.DarkFooter);
        playOrPause.setSize(50,50);
        playOrPause.setMaximumSize(new Dimension(50,50));
        playOrPause.setBorder(new EmptyBorder(10,10,10,10));
        playOrPause.setBorderPainted(false);
        playOrPause.setFocusable(false);
        playOrPause.addActionListener(this);
        playOrPause.setActionCommand("play/Pause");
        add(playOrPause );

        next.setBackground(MyColors.DarkFooter);
        next.setSize(50,50);
        next.setMaximumSize(new Dimension(50,50));
        next.setBorder(new EmptyBorder(10,10,10,10));
        next.setBorderPainted(false);
        next.setFocusable(false);
        next.addActionListener(this);
        next.setActionCommand("next");
        add(next );


        if(replayAllOrNot)
            replay.setIcon(MyIcons.DarkReplayAll);
        else
            replay.setIcon(MyIcons.DarkReplayOnce);
        replay.setBackground(MyColors.DarkFooter);
        replay.setSize(50,50);
        replay.setMaximumSize(new Dimension(50,50));
        replay.setBorder(new EmptyBorder(10,10,10,20));
        replay.setBorderPainted(false);
        replay.setFocusable(false);
        replay.addActionListener(this);
        replay.setActionCommand("replay");
        add(replay);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("play/Pause")) {//changing the icon of play or pause
            System.out.println("play or pause button pressed!");
            if(playOrPauseParameter){
                playOrPause.setIcon(MyIcons.DarkPlay);
                playOrPauseParameter = false;
                if (player.getPlayThread().isAlive())
                    player.getPlayThread().suspend();
                System.out.println("paused...");
            }else{
                playOrPause.setIcon(MyIcons.DarkPause);
                playOrPauseParameter = true;
                if (player.getPlayThread().isAlive())
                    player.getPlayThread().resume();
                else {

                    player.getPlayThread().start();
                }
//                DarkFooter.setDarkMusicInfo(player.getCurrentSong().getDarkMusicInfo());

                System.out.println("................................");
                System.out.println("playing...");

            }
        }

        if (action.equals("shuffle")) {//changing the icon of shuffle mode
            System.out.println("shuffle button pressed!");
            if(SuffleOrNot){
                shuffle.setIcon(MyIcons.DarkShuffleOff);
                SuffleOrNot = false;
                System.out.println("shuffle off...");
            }else{
                shuffle.setIcon(MyIcons.DarkShuffleOn);
                SuffleOrNot = true;
                System.out.println("shuffle on...");
            }
        }

        if (action.equals("replay")) {//changing the icon of shuffle mode
            System.out.println("replay button pressed!");
            if(replayAllOrNot){
                replay.setIcon(MyIcons.DarkReplayOnce);
                replayAllOrNot = false;
                System.out.println("replaying once...");
            }else{
                replay.setIcon(MyIcons.DarkReplayAll);
                replayAllOrNot = true;
                System.out.println("replaying all...");
            }
        }

        if (action.equals("next")) {//next
            int index = player.getCurrentPlayList().indexOf(player.getCurrentSong());
            if (player.getCurrentPlayList().size() > index){
                player.getPlayThread().stop();
                player.setCurrentSong(player.getCurrentPlayList().get(index + 1));
                if(playOrPauseParameter){
                    System.out.println("?|?|?|??|??|??||?|?|?|?|?|?|?||");
                    playOrPause.setIcon(MyIcons.DarkPlay);
                    playOrPauseParameter = false;
                    if (player.getPlayThread().isAlive())
                        player.getPlayThread().suspend();
                    System.out.println("paused...");
//                    DarkFooter.setDarkMusicInfo(player.getCurrentSong().getDarkMusicInfo());
                }
            }else System.out.println("Next song doesnt exist!");
            System.out.println("next button pressed!");
        }
        if (action.equals("previous")) {//previous
            int index = player.getCurrentPlayList().indexOf(player.getCurrentSong());
            if (index > 0){
                player.getPlayThread().stop();
                player.setCurrentSong(player.getCurrentPlayList().get(index - 1));
                if(playOrPauseParameter){
                    playOrPause.setIcon(MyIcons.DarkPlay);
                    playOrPauseParameter = false;
                    if (player.getPlayThread().isAlive())
                        player.getPlayThread().suspend();
                    System.out.println("paused...");
//                    DarkFooter.setDarkMusicInfo(player.getCurrentSong().getDarkMusicInfo());
                }
                System.out.println("previous button pressed!");
            }else System.out.println("Previous song does'nt exist");

        }
    }
}
