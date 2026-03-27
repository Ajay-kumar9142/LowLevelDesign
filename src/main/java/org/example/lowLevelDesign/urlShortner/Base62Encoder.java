package org.example.lowLevelDesign.urlShortner;

public class Base62Encoder {
    //utility layer
    private static final String BASE62 =
            "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String encode(long num){
        if(num == 0) return "0";

        StringBuilder sb = new StringBuilder();
        while(num>0){
           sb.append(BASE62.charAt((int) num%62));
           num /= 62;
        }

        return sb.reverse().toString();
    }
}
