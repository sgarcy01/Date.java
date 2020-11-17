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
        System.out.println("la estacion: "+today.getEstcionNombre());
        System.out.println("el mes es: "+today.getMesCoincidenDias());
        System.out.println("meses que faltan para el final del anyo: "+today.getMesLeft());
        System.out.println("los dias que quedan para final de mes: "+today.getDiasLeftMes());
        System.out.println("los dias que faltan: "+today.diasPasan());
        System.out.println("dias de semana:"+today.numRandomEqualDate());
		}catch (DateException e){
            System.out.println(e.getMessage());
        }
	}

}