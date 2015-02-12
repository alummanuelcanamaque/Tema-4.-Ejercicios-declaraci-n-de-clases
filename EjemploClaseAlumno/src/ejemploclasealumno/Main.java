package ejemploclasealumno;

public class Main {

    public static void main(String[] args) {
        boolean mayorEdad;
        Alumno alumno1 = new Alumno();
        alumno1.asignaValores("Luis", "Pérez", 1979, 1, "1DAI", "Tarde");
        alumno1.muestraGrupo();
        mayorEdad = alumno1.esMayorEdad();
        if(mayorEdad)
            System.out.println("Es mayor de edad");
        alumno1.cambiaGrupo("2DAI");
        System.out.println("Se ha cambiado al grupo: " + alumno1.dameGrupo());
        
        Alumno alumno2 = new Alumno();
        alumno2.asignaValores("Manuel", "Cañamaque", 1989, 2, "PROG1", "Mañana");
        alumno2.muestraGrupo();
        mayorEdad = alumno2.esMayorEdad();
        if(mayorEdad)
            System.out.println("Es mayor de edad");
        alumno2.cambiaGrupo("PROG2");
        System.out.println("Se ha cambiado al grupo: " + alumno2.dameGrupo());
        System.out.println("Edad: " + alumno2.dameEdad());
        System.out.println("Edad: " + alumno2.dameNombre(true));
        System.out.println("Edad: " + alumno2.dameNombre(false));
    }

}
