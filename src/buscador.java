public class buscador {
    
    public static void bus_car(String cargo, BBDD bas_datos) {
        String empleados [][] = bas_datos.g_BBDD();
        System.out.println("Resultados de la busqueda por cargo '" + cargo + "': ");

        for (String empleado[] : empleados) {
            if (empleado[1].equalsIgnoreCase(cargo)) {
                imp_emp(empleado);
            }            
        }        
    }

    public static void bus_DNI (String dni, BBDD bas_datos){
        String empleados [][] = bas_datos.g_BBDD();
        System.out.println("Resultados de la busqueda por DNI '" + dni + "': ");

        for (String[] empleado : empleados) {
            if (empleado[2].equalsIgnoreCase(dni)) {
                imp_emp(empleado);
            }
        }
    }

    private static void imp_emp (String[] empleado){
        System.out.println("Nombre: " + empleado[0] + ", Cargo: " + empleado[1] + ", DNI: " + empleado[2]);
    }
}
