package Aula10_Expressoes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Cupom {
    String nomeFantasia;
    Endereco endereco;
    String cpf;
    String ie;
    String im;
    LocalDate data;
    LocalTime hora;
    Integer ccf;
    Integer cdd;
    List<CupomItem> itens = new ArrayList<>();

    public Cupom() {
        this.ccf = ccf;
        this.cdd = cdd;
        this.cpf = cpf;
        this.data = data;
        this.endereco = endereco;
        this.hora = hora;
        this.ie = ie;
        this.im = im;
        this.nomeFantasia = nomeFantasia;
    }

    public Integer getCcf() {
        return ccf;
    }

    public void setCcf(Integer ccf) {
        this.ccf = ccf;
    }

    public Integer getCdd() {
        return cdd;
    }

    public void setCdd(Integer cdd) {
        this.cdd = cdd;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getIm() {
        return im;
    }

    public void setIm(String im) {
        this.im = im;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

}
