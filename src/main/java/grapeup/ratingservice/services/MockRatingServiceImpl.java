package grapeup.ratingservice.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import grapeup.ratingservice.model.RatingDto;

@Service
@Primary
public class MockRatingServiceImpl implements RatingService {
    public List<RatingDto> getAllRatings() {
        return Arrays.asList(
            RatingDto.builder()
                .id(1L)
                .roomNumber("11")
                .rating(5)
                .build(),
            RatingDto.builder()
                .id(1L)
                .roomNumber("21")
                .rating(3)
                .build(),
            RatingDto.builder()
                .id(1L)
                .roomNumber("22")
                .rating(4)
                .build(),
            RatingDto.builder()
                .id(1L)
                .roomNumber("31")
                .rating(3)
                .build()
        );

    }

    public RatingDto getRatingsByRoom(String roomNumber) {
        return RatingDto.builder()
                .id(1L)
                .roomNumber(roomNumber)
                .rating(5)
                .build();
    }
    
}