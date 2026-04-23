package com.projeto.documentos.domain.model;

import com.projeto.documentos.domain.enums.StatusAnalise;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Analise {

    private Long id;
    private StatusAnalise status;
    private String protocoloExterno;
    private Boolean indicioEdicao;
    private BigDecimal scoreSuspeita;
    private BigDecimal grauConfianca;
    private LocalDateTime dataSolicitacao;
    private LocalDateTime dataRetorno;
    private Usuario usuario;
    private Documento documento;
    private List<AnaliseOcorrencia> ocorrencias = new ArrayList<>();

    public void solicitar() {
    }

    public void registrarResultado() {
    }
}
