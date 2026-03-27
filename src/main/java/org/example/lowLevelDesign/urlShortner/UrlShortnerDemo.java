package org.example.lowLevelDesign.urlShortner;

import org.example.lowLevelDesign.urlShortner.repository.InMemoryUrlRepo;
import org.example.lowLevelDesign.urlShortner.repository.UrlRepository;

public class UrlShortnerDemo {

    public static void main(String[] args) {
        UrlRepository repo = new InMemoryUrlRepo();
        Base62Encoder encoder = new Base62Encoder();
//        AnalyticsService analytics = new AnalyticsService();

        UrlService service = new UrlService(encoder, repo);

        // 1. Normal shorten
        String shortUrl = service.createShortenCode(
                "https://google.com", "google", null);
        System.out.println("Short URL: " + shortUrl);

        // 2. Custom alias
        String custom = service.createShortenCode(
                "https://github.com", "myGit", null);
        System.out.println("Custom URL: " + custom);

        // 3. Redirect
        String original = service.getLongUrl("myGit");
        System.out.println("Redirected to: " + original);

        String original1 = service.getLongUrl("google");
        System.out.println("Redirected to: " + original1);

        // 4. Process analytics
//        analytics.processEvents();
    }
}
