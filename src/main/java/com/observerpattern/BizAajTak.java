package com.observerpattern;
//Observer Class
public class BizAajTak implements Observer{

    public void onUpdate(News news){
        System.out.println(news.getNews());
    }
    @Override
    public NewsType getNewsType(){
        return NewsType.BIZ_NEWS;
    }
}
