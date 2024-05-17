package com.luizgomendes.patterns.behavioral.strategy;

import java.time.Duration;
import java.time.LocalTime;

public class UrbanTrail extends Trail{
    private final String city;
    public UrbanTrail(long distance, String city) {
        super(distance);
        this.city = city;
    }

    public void describe() {
        String durationStr = LocalTime.MIN.plus(Duration.ofMinutes(calculateTime())).toString();
        System.out.println("""
            Trail through %1$s.
            Enjoy! 
            Total time = %2$s hours""".formatted(city, durationStr));
    }
}
