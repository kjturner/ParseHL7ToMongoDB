package App;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.*;
/**
 * Created by kraigt on 2/11/2016.
 */
@RestController
public class MessageController {
    @RequestMapping(value = "/post",method = RequestMethod.POST)
    public void post(@RequestBody String body) {
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();
        JsonObject asJsonObject = parser.parse(body).getAsJsonObject();

        System.out.println("Debug");
    }
}
