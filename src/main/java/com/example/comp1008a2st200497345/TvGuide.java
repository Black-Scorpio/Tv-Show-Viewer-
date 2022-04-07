package com.example.comp1008a2st200497345;

import java.time.LocalDate;
import java.util.ArrayList;


public class TvGuide {
    private ArrayList<TvShow> shows;
    private int tvChannel;
    private LocalDate datePlaying;

    public TvGuide(int tvChannel, LocalDate datePlaying) {

        setTvChannel(tvChannel);
        setDatePlaying(datePlaying);
        shows = new ArrayList<>();
    }

    public void addTvShow(TvShow tvshow){
        shows.add(tvshow);
    }

    public int getTvChannel() {
        return tvChannel;
    }

    public void setTvChannel(int tvChannel) {
        this.tvChannel = tvChannel;
    }

    public LocalDate getDatePlaying() {
        return datePlaying;
    }

    public void setDatePlaying(LocalDate datePlaying) {
        this.datePlaying = datePlaying;
    }

}
