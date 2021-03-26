package com;

import java.util.ArrayList;
import java.util.List;

 class SanturayManager {
     List<Bird> birds = new ArrayList<Bird>();
     static SanturayManager instance;

     private SanturayManager(){

     }
     static SanturayManager getInstance(){
         if (instance == null){
            instance = new SanturayManager();
         }
         return instance;
     }

    public List<Bird> getallbirds() {

        return birds;

    }

    public void addBird(Bird bird) {
        birds.add(bird);

    }
    public void deletBird(Bird bird) {
        birds.remove(bird);

    }
    public void flyAllBird() {
        for (int i = 0; i < birds.size(); i++) {
            if (birds.get(i) instanceof Flyable) {
                ((Flyable) birds.get(i)).fly();
            }
        }
    }

    public void feedAllBird(){
         for (int i = 0; i < birds.size(); i++){
             birds.get(i).eat();
         }
     }

     public  void swimAllBirds() {
         for (int i = 0; i < birds.size(); i++) {
             if (birds.get(i) instanceof Swimmable) {
                 ((Swimmable) birds.get(i)).swim();
             }
         }
     }
}

