package PeliculasEjercicio.model;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Response {
    int page;
    int per_page;
    int total;
    int total_pages;
    ArrayList<Movie> data;
}
