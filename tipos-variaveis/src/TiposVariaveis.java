public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /*double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14

        String meuNome = "Rafael Benetti"

        String nomeCompleto = "Rafael " + "Benetti";
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);*/

        /*int a, b;
        a = 5;
        b = 5;

        String resultado = "";
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";

        System.out.println(resultado);

        String resultado = a == b ? "verdadeiro" : "falso";

        System.out.println(resultado);*/

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?; " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?; " + simNao);

        String nomeUm = "Rafael";
        String nomeDois = new String("Rafael") ;

        System.out.println(nomeUm.equals(nomeDois)); //quando for fazer a relação entre dois objetos


    }
}
