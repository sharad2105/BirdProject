package com.observerpattern;


public class News {
    String news;
    NewsType newsType;

    public NewsType getNewsType() {

        return newsType;
    }

    public void setNewsType(NewsType newsType) {

        this.newsType = newsType;
    }

    public String getNews() {

        return news;
    }

    public void setNews(String news) {

        this.news = news;
    }
}
enum NewsType{
    DELHI_NEWS, BIZ_NEWS;
}