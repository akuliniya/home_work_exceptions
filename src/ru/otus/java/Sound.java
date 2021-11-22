package ru.otus.java;

import java.io.FileNotFoundException;

public class Sound {
    SoundFile soundFile;
    public Sound(SoundFile soundFile){
        this.soundFile = soundFile;
    }

    //Обернуть исключение в свое исклбчение и пробросить
    public void playSound() throws NoSuchSoundException {
        try{
            SoundPlayer player = new SoundPlayer();
            player.playFile(loadSoundFile(soundFile));
        }catch(FileNotFoundException e) {
            throw new NoSuchSoundException(e);
        }
    }

    //Пробросить исключение
    private SoundFile loadSoundFile(SoundFile soundFile) throws FileNotFoundException{
        String path = soundFile.getPath();
        String name = soundFile. getName();
        String format = soundFile.getFotmat();
        // Пытаемся подгрузить указанный файл
        throw  new FileNotFoundException();
    }

}
