package ru.melnikov.springCourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        context.getBean("musicPlayer", MusicPlayer.class).playMusic();
        context.getBean("musicPlayer", MusicPlayer.class).playMusic();

        context.close();
    }
}
