public class Test{
    public static void main(String[] args) {
        System.out.println("inserisci un numero da dividere per il numero che genero casualmente tra 0 e 3");
        try {
            System.out.println(new java.util.Scanner(System.in).nextInt()/new java.util.Random().nextInt(0, 3));
        }catch(ArithmeticException e){
            System.out.println("hai eseguito una divisione per 0 per cui il codice si è bloccato");
        }
    }
}