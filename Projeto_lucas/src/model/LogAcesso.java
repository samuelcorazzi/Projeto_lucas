package com.projeto.documentos.domain.model;

import java.time.LocalDateTime;

public class LogAcesso {

    private Long id;
    private String emailInformado;
    private boolean sucesso;
    private String ip;
    private String userAgent;
    private LocalDateTime criadoEm;
    private Usuario usuario;

    public void registrarTentativa() {
    }
}
