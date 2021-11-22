package ru.otus.java;

public class Cat implements Animal{
    String name;
    Sound catSound;
    String catDescription;

    //Поймать и обработать исключение
    @Override
    public void performAnimal(Sound catSound, String catDescription) {
        try{
            catSound.playSound();
        }catch (NoSuchSoundException e){
            System.out.println(e.getMessage());
//            log.(e.getMessage() + " " + e.getCause())
        }finally {
            System.out.println(catDescription);
        }
    }
}
