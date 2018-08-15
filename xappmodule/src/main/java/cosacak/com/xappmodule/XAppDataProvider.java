package cosacak.com.xappmodule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class XAppDataProvider {
    public static List<String> parse(String rssFeed) {
        List<String> list = new ArrayList<>();
        Random r = new Random();
        // random number of item but at least 5
        Integer number = r.nextInt(10) + 5;
        for (int i = 0; i < number; i++) {
            // create sample data
            String s = String.valueOf(r.nextInt(1000));
            String item = "Summary " + s + ", Description " + s;
            list.add(item);
        }
        return list;
    }
}
