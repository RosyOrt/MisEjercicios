package PeliculasEjercicio;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class OrdenarInfo {

     public void Ordenar(JSONObject jsonObject) {

        JSONArray array = (JSONArray) jsonObject.get("data");
        int tamArray = array.size();

        System.out.println("\nCoincidencias: " + tamArray + "\n");

            array.forEach(a -> {
                JSONObject object = (JSONObject) a;
                System.out.println("Año: " + object.get("Year") + "\nID: " + object.get("imdbID") + "\nTitulo: " + object.get("Title") + "\n");
            });
    }
}
