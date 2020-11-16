package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {
		Date today;
		
		try {
        System.out.println("Dia: ");
        int dia = Teclado.readInteger();
        System.out.println("del mes: ");
        int mes = Teclado.readInteger();
        System.out.println("del anyo: ");
        int anyo = Teclado.readInteger();
        today = new Date(dia, mes, anyo);
        System.out.println("la fecha es: ");
        System.out.println(today.toString());
        System.out.println("el mes: "+today.getMes());
        // System.out.println("la estacion del mes es: "+mes+"en el hemisferio norte:"+today.getEstacionN()+"en el hemisferio sur:"+today.getEstacionS());
        // System.out.println("meses que faltan para el final del anyo: "+today.MesLeft());
        // System.out.println("los dias que quedan para final de mes: "+today.DiaLeft());
        // System.out.println("meses que coinciden en dias con el mes introducido: "+today.MesSameDia());
        // System.out.println("van"+today.DiaDedeAnyo()+"dias de este Anyo");
        // System.out.println("se ha necesitado"+today.numRandEqual()+"intentos para generar un numero cualquiera");
        // System.out.println("esa fecha cae en:"+today.diaDeLaSemana(1));
		}catch (DateException e){
            System.out.println(e.getMessage());
        }
	}

}