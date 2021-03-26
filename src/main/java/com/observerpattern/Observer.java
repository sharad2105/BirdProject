package com.observerpattern;

public interface Observer {
    void onUpdate(News news);
    NewsType getNewsType();
}
