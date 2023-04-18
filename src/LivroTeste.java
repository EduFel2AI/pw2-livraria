public class LivroTeste {

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Hobbit", 9.99);
        //meuLivro.nome = "O Hobbit";
        meuLivro.setPaginas(521);
        meuLivro.setResumo("bla bla bla bla bla");
        meuLivro.setAutor("J. R. Tolkien");

        Editora editora = new Editora();
        //editora.nome = "Felipe";
        editora.email = "felipeeduardo.git@gmail.com";
        meuLivro.setEditora (editora);
        meuLivro.aplicarDesconto(0.5);

        meuLivro.exibirDados();

        Livro livroFavorito = new Livro("O Código Da Vinci", 27.90);
        livroFavorito.setNome ("O Código Da Vinci");
        livroFavorito.setResumo ("bla bla bla bla bla");
        livroFavorito.setPaginas (500);
        livroFavorito.setAutor ("Dan Brown");
        Editora editora2 = new Editora("Felipe");
        editora.nome = "Editora Felipe";
        editora.email = "felipeeduardogit@gmail.com";


        livroFavorito.setEditora (editora2);
        livroFavorito.setTipoCapa (TipoCapaEnum.PERSONALIZADA);

        livroFavorito.aplicarDesconto(0.25);

        livroFavorito.exibirDados();

    }

}
