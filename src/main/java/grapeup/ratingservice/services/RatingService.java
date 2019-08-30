package grapeup.ratingservice.services;

import java.util.List;

import grapeup.ratingservice.model.RatingDto;

/**
 * RatingService
 */
public interface RatingService {
    List<RatingDto> getAllRatings();

    RatingDto getRatingsByRoom(String roomNumber);
    
}