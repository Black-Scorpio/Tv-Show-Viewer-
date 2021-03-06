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

    /**
     * This method adds a TvShow to the ArrayList of shows
     * @param tvshow
     */
    public void addTvShow(TvShow tvshow){
        shows.add(tvshow);
    }

    /**
     * Gives the channel the tv show is playing on
     * @return
     */
    public int getTvChannel() {
        return tvChannel;
    }



    /**
     * Sets the tvChannel to be between channel 0-1000 exclusive
     * @param tvChannel
     */
    public void setTvChannel(int tvChannel) {
        if(tvChannel > 0 && tvChannel < 1000)
            this.tvChannel = tvChannel;
        else
            throw new IllegalArgumentException("The tv channel must be between 0-1000");
    }

    /**
     * Returns the datePlaying
     * @return
     */
    public LocalDate getDatePlaying() {
        return datePlaying;
    }

    /**
     * Set the date the shows are playing.
     * Any date between the current and 6 days ahead
     * @param datePlaying
     */
    public void setDatePlaying(LocalDate datePlaying) {
        if(datePlaying.isEqual(LocalDate.now()) || datePlaying.isAfter(LocalDate.now())
                && datePlaying.isBefore(LocalDate.now().plusDays(6)))
            this.datePlaying = datePlaying;
        else
            throw new IllegalArgumentException("The date must be equal to or greater than the current date.\n" +
                    "The date must not be greater than 6 days into the future.");
    }

    /**
     * Removes the first TvShow object in the list and sends it to the last index in the list
     * @return
     */
    public TvShow viewNextShowFromList(){
        TvShow firstIndex;
        if (shows.size()>0)
        {
            firstIndex = shows.remove(0);
            shows.add(firstIndex);
            return shows.get(0);
        }
        else
            return null;
    }


}
