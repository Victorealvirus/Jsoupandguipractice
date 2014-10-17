package com.JsoupTrial;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;


public class Main {

    public static void main(String[] args) {

        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.reddit.com").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String html = doc.html();
        System.out.print(html);
    }
}
