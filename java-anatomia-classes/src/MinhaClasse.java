public class MinhaClasse {

    public static void main(String[] args) {
        System.out.print("Olá turma, sejam bem-vindos");

        /*
         * Declaração inválida de variáveis
         * 
         * int numero&um = 1; //Os únicos símbolos permitidos são _ e $
         * int 1numero = 1; //Uma variável não pode começar com números
         * int numero um = 1; //Não pode ter espaço no nome da variável
         * int long = 1; //long faz parte das palavras reservadas da linguagem
         */

        /*
         * Declaração válida de
         * 
         * int numero$um = 1;
         * int numero1 = 1;
         * int numeroum = 1;
         * int longo = 1;
         */

        /*
         * Declarar uma Variavel em Java segue sempre a seguinte estrutura
         * 
         * // Estrutura
         * 
         * Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
         * 
         * // Exemplo
         */
        int idade = 23;
        double altura = 1.62;
        // Dog spike; //Observe que aqui a variável spike não tem valor

        String meuNome = "Lucas";

        int anoFabricacao = 2022;

        boolean verdadeira = false;

        anoFabricacao = 2018;

    }

}
