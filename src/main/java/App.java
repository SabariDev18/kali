import org.apache.commons.lang3.StringUtils;
import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {

        String name = "Jenkins";

        System.out.println("Hello " + StringUtils.capitalize(name) + "!");

        Gson gson = new Gson();
        String json = gson.toJson(new Message("Build successful"));

        System.out.println(json);
    }

    static class Message {
        String message;

        Message(String message) {
            this.message = message;
        }
    }
}
