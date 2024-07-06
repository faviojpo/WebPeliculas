package com.example.demo;

import java.util.List;

import com.example.demo.dao.PeliculaDAO;
import com.example.demo.model.Pelicula;

public class App {
    
    public static void main(String[] args) {
        PeliculaDAO peliculaDAO=new PeliculaDAO();
        List<Pelicula> listPeli=peliculaDAO.listar();
        
        for (Pelicula pelicula : listPeli) {
            System.out.println(pelicula.getTitulo());
        }
    }
}
