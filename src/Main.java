public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Zumbilândia");

        int anoDeLancamento = 2010;
        System.out.println("Ano de lançamento:" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme= 8.1;
        //Média calculadada pelas 3 notas da Maria, Gustavo e Luiz

        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Zumbilândia
                Filme de zumbi com a Emma Stone
                Muito Bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);


        int classificacao = (int) (media /2);
        System.out.println(classificacao);
    }
}