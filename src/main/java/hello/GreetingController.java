package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Tyrone on 2/5/2017.
 */
@RestController
public class GreetingController {

    private static final String template = "Hello %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(
            @RequestParam(value="name", defaultValue="World") String name
    ) {
        long id = counter.incrementAndGet();
        String content = String.format(template, name);
        return new Greeting(id, content);
    }
}
