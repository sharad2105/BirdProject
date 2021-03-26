package com.observerpattern;

public class DelhiAajTak implements Observer {
@Override
    public void onUpdate(News news){

    System.out.println(news.getNews());
    }
    @Override
    public NewsType getNewsType(){
        return NewsType.DELHI_NEWS;
    }
}
