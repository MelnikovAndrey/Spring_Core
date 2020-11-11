package ru.melnikov.springCourse;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassicalMusic implements Music{
    private final Random random = new Random();

    private static final List<String> classicSongList = new ArrayList<>();

    static {
        classicSongList.add("First classical song!");
        classicSongList.add("Second classical song!");
        classicSongList.add("Third classical song!");
    }
//    private ClassicalMusic(){}
//
//    public static ClassicalMusic factory(){
//        return new ClassicalMusic();
//    }
    @PostConstruct
    private void initClassical(){
        System.out.println("Bean of Classical Music initialized");
    }
    @PreDestroy
    private void destroyClassical(){
        System.out.println("Bean of Classical music destroyed");
    }

    @Override
    public String getSong() {
        return classicSongList.get(random.nextInt(3));
    }
}
