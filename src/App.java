public class App {
    public static void main(String[] args) throws Exception {
        BBDD bas_datos = new BBDD();

        System.out.println("Base de datos completa");
        bas_datos.imp_BBDD();
        System.out.println();

        buscador.bus_car("Asesor", bas_datos);
        System.out.println();

        buscador.bus_DNI("105", bas_datos);
        System.out.println();
    }
}
