package com.example.comp1008a2st200497345;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TvShowTest {

    private TvShow tvShow;

    @BeforeEach
    void setUp() {
        tvShow = new TvShow("You","Comedy",2.1,3);
    }

    @Test
    void setShowTitle() {
        tvShow.setShowTitle("You");
        assertEquals("You",tvShow.getShowTitle());
    }

    @Test
    void setShowTitleInvalidLength() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->tvShow.setShowTitle("Yo"));
    }



    @Test
    void setShowGenre() {
        tvShow.setShowGenre("Comedy");
        assertEquals("Comedy",tvShow.getShowGenre());
    }

    @Test
    void setShowGenreInvalidGenre(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> tvShow.setShowGenre("Comed"));
    }

    @Test
    void setShowRating() {
        tvShow.setShowRating(3);
        assertEquals(3, tvShow.getShowRating());
    }
    @Test
    void setShowRatingInvalidNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> tvShow.setShowRating(-1));

    }

    @Test
    void setShowRatingInvalidGreaterThan5(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> tvShow.setShowRating(5.3));
    }

    @Test
    void setShowSeasons() {
        tvShow.setShowSeasons(1);
    }

    @Test
    void setShowSeasonsInvalid0(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> tvShow.setShowSeasons(0));

    }

    @Test
    void setShowSeasonsInvalidNegative(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> tvShow.setShowSeasons(-1));
    }

}