package AvaliacaoTres;

import java.util.ArrayList;
import java.util.Objects;

public class Mercado extends Estabelecimento{

    private String promocoes;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Mercado(int id, String nome, String dataAbertura, String promocoes, String idEndereco,
        String cep, String rua,int numero, String bairro, String cidade
    ) {
        super(id, nome, dataAbertura, idEndereco, cep, rua, numero, bairro, cidade);
        this.promocoes = promocoes;
    }

    public String getPromocoes() {
        return this.promocoes;
    }

    public void setPromocoes(String promocoes) {
        this.promocoes = promocoes;
    }

    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);    
    }
 
    public void adicionarReceita(String id, String nome, String etapas, int numEtapas, String valor) {
        Receita receita = new Receita(id, nome, etapas, numEtapas, valor);
        this.receitas.add(receita);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Mercado)) {
            return false;
        }
        Mercado mercados = (Mercado) o;
        return Objects.equals(promocoes, mercados.promocoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promocoes);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            " Data de Abertura='" + getDataAbertura() + "'" +
            " Promoções ='" + getPromocoes() + "'" +
            " Endereço ='" + getEndereco() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nPromoções: " + this.getPromocoes();
    }
}