import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonWriter;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Set;

public class JsonHelper
{
    static String pathIn = "src/PolEngTestIn.json";
    static String pathOut = "src/PolEngTestOut.json";
    static Gson gson = new Gson();

    public static String ReadJson() {
        StringBuilder builder = new StringBuilder();

        String text;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(pathIn));
            while ((text = reader.readLine()) != null) {
                builder.append(text);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return builder.toString();
    }

    public static void WriteJson(Set<Question> questions)
    {
        JsonParser parser = new JsonParser();
        JsonArray json = parser.parse(gson.toJson(questions)).getAsJsonArray();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(json);

        try {
            FileWriter file = new FileWriter(pathOut);
            file.write(prettyJson);
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Question> GetQuestions()
    {
        String input = ReadJson();
        Type targetClassType = new TypeToken<List<Question>>() { }.getType();
        return gson.fromJson(input,targetClassType);
    }
}
