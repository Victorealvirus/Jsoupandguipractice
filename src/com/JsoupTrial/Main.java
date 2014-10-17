package com.JsoupTrial;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import javax.swing.*;


public class Main{

    public static void main(String[] args) {
        Document doc = null;

        try {

        String input = JOptionPane.showInputDialog("Please enter the website you want to do shit with: ");
            doc = Jsoup.connect("https://www." +input +".com").get();

            String title = doc.title();
            String html = doc.html();

            Gooey obj1 = new Gooey(title);
            obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj1.setSize(270, 180);
            obj1.setVisible(true);

            System.out.print(html);

        } catch (IOException e) {
            JOptionPane.showConfirmDialog(null, "Something went terribly wrong", "Oops!!!", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
