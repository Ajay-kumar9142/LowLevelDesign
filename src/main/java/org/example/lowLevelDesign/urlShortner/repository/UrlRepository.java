package org.example.lowLevelDesign.urlShortner.repository;

import org.example.lowLevelDesign.urlShortner.Url;

public interface UrlRepository {

    Url save(Url url);

    Url findByShortCode(String shortCode);

    boolean exists(String shortCode);

    long getNextId();

}
