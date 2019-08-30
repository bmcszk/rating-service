package grapeup.ratingservice.controllers;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import grapeup.ratingservice.model.RatingDto;
import grapeup.ratingservice.services.RatingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("ratings")
public class RatingController {
    private final RatingService ratingService;

    @GetMapping
    public List<RatingDto> getAllRatings() {
        return ratingService.getAllRatings();

    }

    @GetMapping("{roomNumber}")
    public RatingDto getRating(@PathVariable String roomNumber) {
        return ratingService.getRatingsByRoom(roomNumber);
    }

}