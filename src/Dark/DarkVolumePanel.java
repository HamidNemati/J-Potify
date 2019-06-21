package Dark;

import MainPackage.ColoredThumbSliderUI;
import MainPackage.MyColors;
import MainPackage.MyFonts;
import MainPackage.MyIcons;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class DarkVolumePanel extends JPanel implements ChangeListener {
    JLabel percentage = new JLabel();
    JSlider slider = new JSlider(0, 100, 50);
    JLabel volumeIcon = new JLabel();
    public DarkVolumePanel() {
        super();
        setLayout(new BorderLayout());
        JPanel sliderAndPercentage = new JPanel(new FlowLayout());
        setBackground(MyColors.DarkFooter);
        slider.setBackground(MyColors.DarkFooter);
        percentage.setBackground(MyColors.DarkFooter);
        slider.setUI(new ColoredThumbSliderUI(slider, MyColors.DarkTextColor));
        slider.setPaintTicks(true);
        slider.setFocusable(false);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);
        slider.setForeground(MyColors.DarkTextColor);
        slider.setPreferredSize(new Dimension(100,1));
        percentage.setText(slider.getValue() + "%");
        percentage.setFont(MyFonts.arial);
        percentage.setForeground(MyColors.DarkTextColor);
        percentage.setBorder(new EmptyBorder(5,5,0,0));
        setVolumeIcon(slider.getValue());
        JPanel verticalSliderAndPercentage = new JPanel(new GridLayout(2,1));
        verticalSliderAndPercentage.setBackground(MyColors.DarkFooter);
        sliderAndPercentage.add(volumeIcon);
//        verticalSliderAndPercentage.add(slider);
        verticalSliderAndPercentage.add(percentage);
        verticalSliderAndPercentage.add(slider);
        sliderAndPercentage.add(verticalSliderAndPercentage);
        sliderAndPercentage.setBackground(MyColors.DarkFooter);
        //sliderAndPercentage.setBorder(new EmptyBorder(20,0,20,0));
//        add(sliderAndPercentage,BorderLayout.CENTER);
        add(sliderAndPercentage, BorderLayout.EAST);



    }
    @Override
    public void stateChanged (ChangeEvent e){
        percentage.setText(slider.getValue() + "%");
        setVolumeIcon(slider.getValue());
    }
    public void setVolumeIcon(int volume){
        if (volume == 0){
            volumeIcon.setIcon(MyIcons.DarkVolume0);
        }else if(volume < 33){
            volumeIcon.setIcon(MyIcons.DarkVolume1);
        }else if(volume < 66){
            volumeIcon.setIcon(MyIcons.DarkVolume2);
        }else if(volume == 100){
            volumeIcon.setIcon(MyIcons.DarkVolume4);
        }else
            volumeIcon.setIcon(MyIcons.DarkVolume3);
    }
}
