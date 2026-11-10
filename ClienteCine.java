public class ClienteCine {
    private String nombre;
    private int edad;
    private boolean tieneMembresiaVIP;
    public ClienteCine(String nombre, int edad, boolean tieneMembresiaVIP) {
        this.nombre = nombre;
        setedad(edad);
        this.tieneMembresiaVIP = tieneMembresiaVIP;
    }
    public void setedad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        }
    }
    public boolean esAptoParMayores() {
        return edad >= 18;
    }
    public boolean puedeEntrarSalaVIP() {
        return tieneMembresiaVIP;
    }
    public String getNombre() {
        return nombre;
    }
}
