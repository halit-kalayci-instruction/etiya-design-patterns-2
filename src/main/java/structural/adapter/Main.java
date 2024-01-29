package structural.adapter;

import structural.adapter.caching.Caching;
import structural.adapter.caching.RedisAdapter;

public class Main {
    public static void main(String[] args) {
        Caching caching = new RedisAdapter();
        caching.cache("Deneme", 15);
    }
}
