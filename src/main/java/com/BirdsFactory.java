package com;

public class BirdsFactory {
    static BirdsFactory instance;

    private BirdsFactory(){

    }
    static BirdsFactory getInstance(){
        if (instance == null){
            instance = new BirdsFactory();
        }
        return instance;
    }
    public Bird getBird(BirdsName bird){
        switch (bird){
            case DUCK:
                return new Duck();

            case  OSTRICH:
                return new  Ostrich();

            case PENGUIN :
                return  new Penguin();

            case PARROT:
                return new Parrot();

            default:
                return null;
        }
    }
}
