package structural.adapter.caching;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class RedisAdapter implements Caching
{
    @Override
    public void cache(String key, Object obj)
    {
        RedisCaching redisCaching= new RedisCaching();
        redisCaching.setItem(key,obj, Timestamp.valueOf(LocalDateTime.now()));
        System.out.println("Redise cachelendi:"+key);
    }
}
