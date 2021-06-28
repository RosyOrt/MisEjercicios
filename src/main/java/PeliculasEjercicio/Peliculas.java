package PeliculasEjercicio;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class Peliculas {

    public static void main(String[] args)  {

        String nomPeli ;
        URL url ;
        HttpsURLConnection connection ;
        Scanner lee = new Scanner(System.in);
        OrdenarInfo objOrdena = new OrdenarInfo();

        System.out.println("Que pelicula desea consultar?");
        nomPeli = lee.nextLine();

        String HTTPS_URL = "https://jsonmock.hackerrank.com/api/movies/search/?Title=" + nomPeli + "&page=1";

        try {
            url = new URL(HTTPS_URL);
            connection = (HttpsURLConnection) url.openConnection();

            InputStream inputStream = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader br = new BufferedReader(isr);
            String jsonText = br.readLine();

            JSONParser parser = new JSONParser();
            JSONObject mijson = (JSONObject) parser.parse(jsonText);
            objOrdena.Ordenar(mijson);
            br.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

