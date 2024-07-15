import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Conversor {
    public String converte(String moedaOrigem, String moedaDestino, Double valor) throws IOException {
        // chave exchangerate
        String url_str = "https://v6.exchangerate-api.com/v6/4bec014d2c4db3d5fdb4cfc9/pair/"+moedaOrigem+"/"+moedaDestino+"/"+valor;

        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

// JSON
        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        JsonObject jsonobj = root.getAsJsonObject();

// Accessing object
        Double req_result = jsonobj.get("conversion_result").getAsDouble();
        return "Para o valor "+valor+"["+moedaOrigem+"] "+" apos implementacao do cambio o valor final sera de: "+req_result+"["+moedaDestino+"]"+"\n"+valor+" >> "+ req_result;
    }
}
