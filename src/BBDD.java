public class BBDD {

    String empleados [][] = new String[10][3];

    public BBDD (){
        aggEmp (0, "Andres", "Asesor", "100");
        aggEmp (1, "David", "Asesor", "101");
        aggEmp (2, "Luis", "Asesor", "102");
        aggEmp (3, "Daniel", "Asesor", "103");
        aggEmp (4, "Andy", "Asesor", "104");
        aggEmp (5, "Daniela", "Coordinador", "105");
        aggEmp (6, "Andrea", "Coordinador", "106");
        aggEmp (7, "Raul", "Coordinador", "107");
        aggEmp (8, "Dimitri", "Jefe", "108");
        aggEmp (9, "Danilo", "Jefe", "109");
    }

    public void aggEmp (int fila, String nombre, String cargo, String dni) {
        empleados[fila][0] = nombre;
        empleados[fila][1] = cargo; 
        empleados[fila][2] = dni;  
    }
    
    public void imp_BBDD (){
        for (String[] empleado : empleados) {
            for (String dato : empleado) {
                System.out.println(dato + "\n");
            }
            System.out.println();
        }
    }

    public String[][] g_BBDD(){
        return empleados; 
    }
}
