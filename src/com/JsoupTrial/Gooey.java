package com.JsoupTrial;

/**
 * Created by Adcomp on 10/16/2014.
 */

import javax.swing.JLabel;
import java.awt.*;
import javax.swing.JFrame;

public class Gooey extends JFrame{//takes all properties of the JFrame by default

    public Gooey(String title){//constructor

        super("WebScraper");//the title of the frame
        JLabel item1;//make the frame object
        setLayout(new FlowLayout());//set a layout
        item1 = new JLabel(title);//put things into the label
        item1.setToolTipText("Yo I'm hovering");//hover over sign
        add(item1);//add the frame at the end of this constructor
    }
}
