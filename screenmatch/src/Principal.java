import br.com.screenmatch.www.Filme;

public class Principal extends Filme{
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeavaliacoes());
//        System.out.println("Soma das avaliações: " + meuFilme.g);
//        System.out.println(meuFilme.pegaMedia());
//

    }
}
