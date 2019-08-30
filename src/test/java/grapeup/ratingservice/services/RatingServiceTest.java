package grapeup.ratingservice.services;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import grapeup.ratingservice.model.RatingDto;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RatingServiceTest {
    @Autowired
    RatingService ratingService;

    @Test
    public void shouldGetAllRatings() {
        //given

        //when
        List<RatingDto> result = ratingService.getAllRatings();
        //then
        assertThat(result).isNotNull();
    }

    @Test
    public void shouldGetRatingsByRoom() {
        //given
        String roomNumber = "123";
        //when
        RatingDto result = ratingService.getRatingsByRoom(roomNumber);
        //then
        assertThat(result).isNotNull();

    }
    
}