package org.example.lowLevelDesign.urlShortner;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Url {
    //model
    long id;
    String shortCode;
    String longUrl;
    long createdAt;
    long expiryTime;

    public Url(long id, String shortCode, String longUrl, long createdAt, long expiryTime){
        this.id = id;
        this.shortCode = shortCode;
        this.longUrl = longUrl;
        this.expiryTime = expiryTime;
        this.createdAt = createdAt;

    }

    public boolean isExpired(){
        return expiryTime > 0 && System.currentTimeMillis() > expiryTime;
    }
}
