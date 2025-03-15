package Aula10_Expressoes;

import java.util.Objects;

public class CupomItem {
    Integer ordem;
    Integer sku;
    String descricao;
    Double quantidade;
    String und;
    Double preco;
    Double subtotal;

    public CupomItem(Integer ordem, Integer sku, String descricao, Double quantidade, String und, Double preco, Double subtotal) {
        this.ordem = ordem;
        this.sku = sku;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.und = und;
        this.preco = preco;
        this.subtotal = subtotal;
    }

    public CupomItem() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public String getUnd() {
        return und;
    }

    public void setUnd(String und) {
        this.und = und;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CupomItem cupomItem = (CupomItem) o;
        return Objects.equals(ordem, cupomItem.ordem);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ordem);
    }
    /*@Override
    public String toString() {
        return String.format("%-4d %-6d %-10s %6.2f X %6.2f %12.2f\n",
                ordem, sku, descricao, quantidade, preco, subtotal);
    }

     */

    @Override
    public String toString() {
        return String.format("%-4d %-6d %-20s %6.2f X %6.2f %10.2f\n",
                ordem, sku, descricao, quantidade, preco, subtotal);
    }
}
