public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(numero++);
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(numero--);
        System.out.println(numero);
        System.out.println(--numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        int a = 6;
        int b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;
        boolean teste = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + teste);
        teste = numero1 != numero2;
        System.out.println("numero1 é diferente a numero2? " + teste);
        teste = numero1 > numero2;
        System.out.println("numero1 é maior a numero2? " + teste);
        teste = numero1 >= numero2;
        System.out.println("numero1 é maior ou igual a numero2? " + teste);
        teste = numero1 < numero2;
        System.out.println("numero1 é menor a numero2? " + teste);
        teste = numero1 <= numero2;
        System.out.println("numero1 é menor ou igual a numero2? " + teste);

        String nome1 = "Marcos";
        String nome2 = "Marcos";
        String nome3 = new String("Marcos");
        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome2);
        System.out.println(nome1 == nome3);
        System.out.println(nome1.equals(nome3));

        boolean condicao1 = true;
        boolean condicao2 = true;
        if(condicao1 && (7 > 4)) {
            System.out.println("As duas condições são verdadeiras.");
        }
        if(condicao1 || condicao2) {
            System.out.println("Uma das duas condições é verdadeira.");
        }
        System.out.println("Fim.");
    }
}
