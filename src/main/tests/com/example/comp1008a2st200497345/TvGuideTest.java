package com.example.comp1008a2st200497345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TvGuideTest {
    private TvGuide guide;

    @BeforeEach
    void setUp(){
        guide = new TvGuide(5,LocalDate.now());
    }

    @Test
    void addTvShow() {
        guide.addTvShow(new TvShow("You","Drama",4.6,3));

    }

    @Test
    void setTvChannel() {
        guide.setTvChannel(5);
        assertEquals(5,guide.getTvChannel());
    }

    @Test
    void setTvChannelInvalid0() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> guide.setTvChannel(0));
    }

    @Test
    void setTvChannelInvalidNegative() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> guide.setTvChannel(-1));
    }

    @Test
    void setTvChannelInvalidHighValue() {
        Assertions.assertThrows(IllegalArgumentException.class, ()-> guide.setTvChannel(1000));
    }



    @Test
    void setDatePlaying() {
        guide.setDatePlaying(LocalDate.now());
        assertEquals(LocalDate.now(), guide.getDatePlaying());
    }

    @Test
    void setDatePlayingInvalidPastDate() {
        guide.setDatePlaying(LocalDate.now());
        assertEquals(LocalDate.now(), guide.getDatePlaying());
    }
}