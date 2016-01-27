package com.example.julio.servicios;

import java.util.List;

/**
 * Created by Julio on 27/01/2016.
 */
public class Busqueda {
    List<Pelicula> Search;
    String totalResults;
    String Response;



    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }

    public List<Pelicula> getSearch() {
        return Search;
    }

    public void setSearch(List<Pelicula> search) {
        Search = search;
    }


}
