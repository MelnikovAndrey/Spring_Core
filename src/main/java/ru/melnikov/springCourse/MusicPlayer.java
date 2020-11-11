package ru.melnikov.springCourse;

import java.util.List;
import java.util.Random;

public class MusicPlayer {
//    private final Music music1;
//    private final Music music2;
//    private String name;
//    private int volume;
    private final Random random = new Random();
    private final List<Music> genreList;

    public MusicPlayer(List<Music> list) {
        this.genreList = list;
    }

    public void playMusic() {
        System.out.println(genreList.get(random.nextInt(genreList.size())).getSong());
//        switch (genre){
//            case ROCK:
//                System.out.println("Play ROOOOCK: " + music1.getSong());
//                break;
//            case CLASSIC:
//                System.out.println("Play classic: " + music2.getSong());
//                break;
//            default:
//                System.out.println("Nothing to play ))");
//        }
//        for (Music music : musicList){
//            System.out.println(music.getSong());
//        }

//        musicList
//                .forEach(x-> System.out.println(x.getSong()));

//        System.out.println("Now play: " + music.getSong());
    }
}
