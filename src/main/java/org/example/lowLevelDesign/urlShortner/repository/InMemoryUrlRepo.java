package org.example.lowLevelDesign.urlShortner.repository;

import org.example.lowLevelDesign.urlShortner.Url;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class InMemoryUrlRepo implements UrlRepository{

    private final Map<String, Url> memory;
    private final AtomicLong idGenerator;

    public InMemoryUrlRepo(){
        this.memory = new ConcurrentHashMap<>();
        this.idGenerator = new AtomicLong(1);
    }
    @Override
    public Url save(Url url) {
        memory.put(url.getShortCode(), url);
        return url;
    }

    @Override
    public Url findByShortCode(String shortCode) {
        return memory.get(shortCode);
    }

    @Override
    public boolean exists(String shortCode) {
        return memory.containsKey(shortCode);
    }

    @Override
    public long getNextId() {
        return idGenerator.getAndIncrement();
    }
}
