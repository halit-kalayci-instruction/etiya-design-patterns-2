package structural.adapter.caching;

public class InMemoryCaching implements Caching
{
    @Override
    public void cache(String key, Object obj) {
        System.out.println("Cachelendi:" + key);
    }
}
