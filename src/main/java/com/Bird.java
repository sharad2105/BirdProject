package com;
    interface Bird {
        void eat();
    }

    interface Flyable {
        void fly();
    }

    interface Swimmable {
        void swim();
    }

    class Duck implements Bird, Swimmable, Flyable {
        public void fly() {
            System.out.println("Duck is fling");
        }

        public void swim() {
            System.out.println("Duck is swimming");
        }

        public void eat() {
            System.out.println("Duck is eatting");
        }
    }

    class Ostrich implements Bird {

        public void eat() {
            System.out.println("Ostrich is eatting");
        }

    }

    class Penguin implements Bird, Swimmable {

        public void swim() {
            System.out.println("Penguin is swimming");
        }

        public void eat() {
            System.out.println("Penguin is eatting");
        }

    }

    class Parrot implements Bird, Flyable {
        public void fly() {
            System.out.println("Parrot is fling");
        }

        public void eat() {
            System.out.println("Parrot is eatting");
        }
    }