package com.projeto.documentos.domain.model;

import com.projeto.documentos.domain.enums.StatusDocumento;
import com.projeto.documentos.domain.enums.TipoDocumento;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Documento {

    private Long id;
    private TipoDocumento tipo;
    private String nomeOriginal;
    private String mimeType;
    private StatusDocumento status;
    private LocalDateTime dataUpload;
    private Usuario usuario;
    private List<Analise> analises = new ArrayList<>();

    public boolean validarMimeType() {
        return false;
    }

    public void marcarExcluido() {
    }
}
