package Aula10_Expressoes;

import java.time.LocalDate;
import java.time.LocalTime;

public class GeradorCupom {
    public Cupom gerar() {
        Cupom cupom = new Cupom();
        cupom.data = LocalDate.of(2022, 1, 6);
        cupom.hora = LocalTime.of(12, 12, 39);
        cupom.nomeFantasia = "PANIFICADORA PAO DOURADO";

        Endereco endereco = new Endereco();
        endereco.logradouro = "RUA 9";
        endereco.numero = "1006";
        endereco.complemento = "QD 34";
        endereco.bairro = "SETOR CANOAS";
        endereco.cidade = "SAO JOSE";
        endereco.uf = "SC";
        cupom.endereco = endereco;

        cupom.ccf = 120289;
        cupom.cdd = 124857;
        cupom.cpf = "33498700867";
        cupom.ie = "10.457.671-2";
        cupom.im = "08641569";

        CupomItem item01 = new CupomItem();
        item01.ordem = 1;
        item01.sku = 146;
        item01.descricao = "QUIBE CRU";
        item01.preco = 27.9;
        item01.und = "KG";
        item01.quantidade = 3.000;
        item01.subtotal = item01.getPreco() * item01.getQuantidade();
        cupom.itens.add(item01);

        CupomItem item02 = new CupomItem();
        item02.ordem = 2;
        item02.sku = 138;
        item02.descricao = "ESFIHA ABERTA";
        item02.preco = 12.0;
        item02.und = "KG";
        item02.quantidade = 3.500;
        item02.subtotal = item02.getPreco() * item02.getQuantidade();;
        cupom.itens.add(item02);

        CupomItem item03 = new CupomItem();
        item03.ordem = 3;
        item03.sku = 423;
        item03.descricao = "COXINHA";
        item03.preco = 10.0;
        item03.und = "KG";
        item03.quantidade = 5.500;
        item03.subtotal = item03.getPreco() * item03.getQuantidade();
        cupom.itens.add(item03);

        return cupom;
    }
}
