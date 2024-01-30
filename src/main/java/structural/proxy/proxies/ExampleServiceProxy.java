package structural.proxy.proxies;

import structural.proxy.libraries.ExampleService;

import java.util.HashMap;

public class ExampleServiceProxy {
    private HashMap<Integer,Integer> results = new HashMap<Integer, Integer>();

    public int getDataWithProxy(int number) {
        if(results.containsKey(number))
        {
            return results.get(number);
        }
        ExampleService exampleService = new ExampleService();
        int result = exampleService.getData(number);
        results.put(number,result);
        return result;
    }
}
