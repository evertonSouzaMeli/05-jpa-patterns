package br.com.fiap.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;

@Entity
@Table(name = "TB_VEICULO")
@SequenceGenerator(name = "veiculo", sequenceName = "SQ_TB_VEICULO", allocationSize = 1)
public class Veiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veiculo")
    @Column(name = "cd_veiculo")
    private Long codigo;

    @Column(name = "ds_modelo", length = 50, nullable = false)
    private String modelo;

    @Column(name = "vl_veiculo", precision = 10, scale = 2)
    private BigDecimal valor;

    @Column(name = "nr_ano")
    private Integer ano;

    @Column(name = "dt_revisao")
    @Temporal(TemporalType.TIME)
    private LocalDate dataRevisao;

    @Column(name = "ds_tipo", length = 30)
    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    @Column(name = "br_placa", length = 8, unique = true)
    private String placa;

    public Veiculo() {
    }

    public Veiculo(Long codigo, String modelo, BigDecimal valor, Integer ano, LocalDate dataRevisao, Tipo tipo, String placa) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.valor = valor;
        this.ano = ano;
        this.dataRevisao = dataRevisao;
        this.tipo = tipo;
        this.placa = placa;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public LocalDate getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(LocalDate dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
