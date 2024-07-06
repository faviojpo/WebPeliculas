package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.model.Usuario;

@RestController
public class UsuarioController {
    
    @CrossOrigin(origins = "*")
    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios() {
        UsuarioDAO usuarioDAO=new UsuarioDAO();
        return usuarioDAO.listar();
    }
}
