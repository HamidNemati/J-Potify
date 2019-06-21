package MainPackage;

import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class ColoredThumbSliderUI extends BasicSliderUI {
    Color thumbColor;
    public ColoredThumbSliderUI(JSlider s, Color tColor) {
        super(s);
        thumbColor=tColor;
    }

    public void paint( Graphics g, JComponent c ) {
        recalculateIfInsetsChanged();
        recalculateIfOrientationChanged();
        Rectangle clip = g.getClipBounds();

        if ( slider.getPaintTrack() && clip.intersects( trackRect ) ) {
            paintTrack( g );
        }
        if ( slider.getPaintTicks() && clip.intersects( tickRect ) ) {
            paintTicks( g );
        }
        if ( slider.getPaintLabels() && clip.intersects( labelRect ) ) {
            paintLabels( g );
        }
        if ( slider.hasFocus() && clip.intersects( focusRect ) ) {
            paintFocus( g );
        }
        if ( clip.intersects( thumbRect ) ) {
            Color savedColor = slider.getBackground();
            slider.setBackground(thumbColor);
            paintThumb( g );
            slider.setBackground(savedColor);
        }
    }
}

