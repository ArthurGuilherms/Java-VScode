import java.util.Scanner;
  public class App {
  public static void main(String[] args) {

    System.out.println("Informe um valor: ");
    Scanner entrada = new Scanner(System.in);
    String var = entrada.next();
    System.out.println(var);
    System.out.println("Informe outro valor: ");
    int var2 = entrada.nextInt();
    System.out.println(var2);
    entrada.close();

}
}