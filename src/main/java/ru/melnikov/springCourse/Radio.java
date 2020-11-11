package ru.melnikov.springCourse;

public class Radio implements Music{

    @Override
    public String getSong() {
        return "Radio music";
    }
}
