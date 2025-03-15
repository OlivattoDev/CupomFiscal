package Aula10_Expressoes;

public class ImpressorCupom {
    public void imprimir(Cupom cupom) {
        /* Vamos somente imprimir o resultado no console mas este mesmo conteudo podera
        proporcionar varias saidas logo a variavel conteudo deveria ser retornada
        para outros "proceccasdores" como gerador de arquivo txt, pdf ou ate mesmo envio por e-mail.
         */


        /* CONSIDERE O COMPRIMENTO MAXIMO DE 50 CARACTERES EM CADA LINHA
        E APLIQUE O RESPECTIVO ALINHAMENTO.
         */

        StringBuilder conteudo = new StringBuilder();
        conteudo.append(tracos());
        conteudo.append(cupom.nomeFantasia + "\n");
        Endereco end = cupom.endereco;
        conteudo.append(end.logradouro + " N:" + end.numero + " " + end.complemento + " " + end.bairro + "\n" + "" + end.cidade + " " + end.uf + " ");
        conteudo.append("\nCPF/CNPJ:" + cupom.cpf + " " + cupom.data + " " + "\n");
        conteudo.append("IE:" + cupom.ie + " " + cupom.hora + "\n");
        conteudo.append("IM:" + cupom.im + " " + "CCF:" + cupom.ccf + "\n");
        conteudo.append("CDD:" + cupom.cdd + "\n");
        conteudo.append(tracos());
        conteudo.append("CUPOM FISCAL\n");
        //modelo para ser replicado.
        conteudo.append(String.format("%-4s %-6s %-20s %6s %8s %10s%n",
                "ITEM", "COD.", "DESCRIÇÃO", "QTD.", "VALOR", "TOTAL"));

        for (CupomItem item : cupom.itens) {
            conteudo.append(item.toString());
        }
        conteudo.append(tracos());
        System.out.println(conteudo.toString());
        //em caso de resolver explorar algumas formas de apresentacao
        //return conteudo.toString();
    }
    private String tracos() {
        String repeat = new String(new char[70]).replace("\0", "-");
        return repeat + "\n";
    }
    private String cpfCnpj(String cpfCnpj) {
        String newCnpj = "";
        if (cpfCnpj.length() == 11)
            newCnpj = cpfCnpj.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
        else
            newCnpj = cpfCnpj.replaceAll("(\\d{2})(\\d{3})(\\d{3})(\\d{4})(\\d{2})", "$1.$2.$3/$4-$5");
        return newCnpj;
    }
}
