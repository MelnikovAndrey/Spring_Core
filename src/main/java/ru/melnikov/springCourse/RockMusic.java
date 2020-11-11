package ru.melnikov.springCourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    private final Random random = new Random();

    private static final List<String> rockSongList = new ArrayList<>();

    static {
        rockSongList.add("First rock song!");
        rockSongList.add("Second rock song!");
        rockSongList.add("Third rock song!");
    }

    @Override
    public String getSong() {
        return rockSongList.get(random.nextInt(3));
    }
}
