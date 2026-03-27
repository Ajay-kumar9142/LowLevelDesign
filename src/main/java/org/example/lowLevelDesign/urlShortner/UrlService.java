package org.example.lowLevelDesign.urlShortner;

import org.example.lowLevelDesign.urlShortner.repository.UrlRepository;

public class UrlService {
    //service layer
    Base62Encoder encoder;
    UrlRepository repository;

    public UrlService(Base62Encoder encoder, UrlRepository repository){
        this.encoder = encoder;
        this.repository = repository;
    }

    // creating short url
    public String createShortenCode(String longUrl, String customAlias, Long expiryMillis){
        if(customAlias != null && !customAlias.isEmpty()){
            if(repository.exists(customAlias)) throw new RuntimeException("Alias already Exist");
        }

        Long id = repository.getNextId();

        // Custom Alias
        String shortCode = (customAlias != null && !customAlias.isEmpty())
                ? customAlias : getUniqueCode(id);

        long now = System.currentTimeMillis();
        long expiry = (expiryMillis != null) ? now + expiryMillis : 0;

        Url url = new Url(id, shortCode, longUrl, now, expiry);

        repository.save(url);

        return url.shortCode;

    }

    //get original url
    public String getLongUrl(String shortCode){
       Url url = repository.findByShortCode(shortCode);

       if(url == null) throw new RuntimeException("URL NOT FOUND!");

       if(url.isExpired()) throw new RuntimeException("URL Expired");

       return url.longUrl;
    }

    //handle collision
    private String getUniqueCode(Long id){
        String shortCode = encoder.encode(id);

        while(repository.exists(shortCode)){
            id++;
            shortCode = encoder.encode(id);
        }

        return shortCode;
    }
}
