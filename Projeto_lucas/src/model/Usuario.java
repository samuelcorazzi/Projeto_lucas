package com.projeto.documentos.domain.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String senhaHash;
    private boolean ativo;
    private LocalDateTime ultimoLoginEm;
    private Perfil perfil;
    private List<Documento> documentos = new ArrayList<>();
    private List<LogAcesso> logsAcesso = new ArrayList<>();
    private List<Analise> analises = new ArrayList<>();

    public boolean autenticar(String senha) {
        return false;
    }

    public void alterarPerfil(Perfil perfil) {
    }
}
