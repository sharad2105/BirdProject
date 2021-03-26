package com.observerpattern;

import java.util.ArrayList;
import java.util.List;
//Subject class
public class AajTak {
   List<Observer> observerList = new ArrayList<Observer>();

    public void register(Observer observer){

        observerList.add(observer);
    }

    public void update(News news){
        for (Observer observer: observerList) {
            if (observer.getNewsType() == news.getNewsType()) {
                observer.onUpdate(news);
            }
        }
    }
}
