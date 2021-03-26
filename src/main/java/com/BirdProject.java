package com;

public class BirdProject {

        public static void main(String[] args) {
                SanturayManager santurayManager = SanturayManager.getInstance();

                Bird duck    = BirdsFactory.getInstance().getBird(BirdsName.DUCK);
                Bird ostrich = BirdsFactory.getInstance().getBird(BirdsName.OSTRICH);
                Bird penguin = BirdsFactory.getInstance().getBird(BirdsName.PENGUIN);
                Bird parrot  = BirdsFactory.getInstance().getBird(BirdsName.PARROT);

                santurayManager.addBird(parrot);
                santurayManager.addBird(duck);
                santurayManager.addBird(ostrich);
                santurayManager.addBird(penguin);

                santurayManager.flyAllBird();
                santurayManager.feedAllBird();
                santurayManager.swimAllBirds();
        }
}