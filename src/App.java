public class App {
    public static void main(String[] args) throws Exception {
        int x = 1;

        System.out.println("Tabela de multiplicação do " + x);

        for(int i = 1; i<10; i++) { 
            System.out.println(x + " x " + i + " = " + x*i);
        }
    }
}
