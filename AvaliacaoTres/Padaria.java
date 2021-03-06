package AvaliacaoTres;

//import Avaliacao.Pessoa;
import java.util.ArrayList;
import java.util.Objects;

public class Padaria extends Estabelecimento{

    private String horario;
    ArrayList<Receita> receitas = new ArrayList<>();

    public Padaria(int id, String nome, String dataAbertura,  String horario,  String Endereco, String cep,
        String rua, int numero, String bairro, String cidade
    ) {
        super(id, nome, dataAbertura, Endereco, cep, rua, numero, bairro, cidade);
        this.horario = horario;
    }

    public String getHorario() {
        return this.horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
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
        if (!(o instanceof Padaria)) {
            return false;
        }
        Padaria padaria = (Padaria) o;
        return Objects.equals(horario, padaria.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horario);
    }

    @Override
    public String toString() {
        return "{" +
            " Nome='" + getNome() + "'" +
            " Data de Abertura='" + getDataAbertura() + "'" +
            " Horário ='" + getHorario() + "'" +
            " Endereço ='" + getEndereco() + "'" +
            "}";
    }

    public String carteira() {
        return super.carteira()
            + "\nHorário: " + this.getHorario();
    }
}