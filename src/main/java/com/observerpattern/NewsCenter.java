package com.observerpattern;

public class NewsCenter {
    public static void main(String[] args) {
        AajTak aajTak = new AajTak();

        BizAajTak bizAajTak = new BizAajTak();
        aajTak.register(bizAajTak);

        DelhiAajTak delhiAajTak = new DelhiAajTak();
        aajTak.register(delhiAajTak);

        News delhiNews = new News();
        delhiNews.setNews("Welcom to India");
        delhiNews.setNewsType(NewsType.DELHI_NEWS);

        News businessNews = new News();
        businessNews.setNews("Virat Is the world class player");
        businessNews.setNewsType(NewsType.BIZ_NEWS);

        aajTak.update(delhiNews);
        aajTak.update(businessNews);
    }
}
