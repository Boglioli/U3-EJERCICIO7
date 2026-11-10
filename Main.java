import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        ClienteCine cliente1 = new ClienteCine("martin" , 20, true);
        ClienteCine cliente2 = new ClienteCine("enzo" , 16, true);
        ClienteCine cliente3 = new ClienteCine("gabriel" , 25, false);
        System.out.println("cliente: " + cliente1.getNombre());
        System.out.println("apto pars mayores: " + cliente1.esAptoParMayores());
        System.out.println("puede entrar a sala VIP: " + cliente1.puedeEntrarSalaVIP());
        System.out.println();
        System.out.println("cliente: " + cliente2.getNombre());
        System.out.println("apto pars mayores: " + cliente2.esAptoParMayores());
        System.out.println("puede entrar a sala VIP: " + cliente2.puedeEntrarSalaVIP());
        System.out.println();
        System.out.println("cliente: " + cliente3.getNombre());
        System.out.println("apto pars mayores: " + cliente3.esAptoParMayores());
        System.out.println("puede entrar a sala VIP: " + cliente3.puedeEntrarSalaVIP());
        }
    }

