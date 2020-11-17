package es.unileon.prg.date;

public class Date{
    private int dia;
    private int mes;
    private int anyo;

public Date (){
    this.dia = 15;
    this.mes = 11;
    this.anyo = 2020;
}
public Date (int dia, int mes, int anyo) throws DateException{
    this.anyo = anyo;
    if (mes >= 1 && mes <= 12){
        this.mes = mes;
    } else{
        throw new DateException ("el mes" +mes+ "no es valido valores positivos entre 1 y 12");
    }
    switch (this.mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            if (dia >= 1 && dia <= 31){
                this.dia=dia;
            } else{
                throw new DateException("el dia"+dia+"no existe al menos en este mes"+mes);    
            }
            this.mes=mes;
            break;
        case 2: 
            if (dia >=1 && dia <= 29){
                this.dia = dia;
            } else{
                throw new DateException("el dia" +dia+ "no es valido al menos en este mes"+mes);    
            }
            this.mes=mes;
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            if (dia >= 1 || dia <= 30){
                this.dia = dia;
            } else{
                throw new DateException("el dia" +dia+ "no es valido al menos en este mes"+mes);    
            }
            this.mes=mes;
            break;
            }
    }
public int getDia(){
    return this.dia;
} public int getMes(){
    return this.mes;
} public int getAnyo(){
    return this.anyo;
}
public Date (Date anotherDate){
    this.dia = anotherDate.getDia();
    this.mes = anotherDate.getMes();
    this.anyo = anotherDate.getAnyo();
}
public String toString() {
    return this.dia + "/" + this.mes + "/" + this.anyo;
} 
public void setMes(int mes)throws DateException{
    if (mes >= 1 && mes <= 12){
        this.mes = mes;
    }else {
        throw new DateException("el mes introducido no es valido ya que es menor que 1 o mayor  que 12");
    }
}
public void setDia(int dia) throws DateException{
    switch (this.mes) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        if (dia > 1 || dia < 31){
            this.dia=dia;
        } else{
            throw new DateException("el dia"+dia+"no existe al menos en este mes"+mes);    
        }
        this.mes=mes;
        break;
    case 2: 
        if (dia >1 || dia < 29){
            this.dia = dia;
        } else{
            throw new DateException("el dia" +dia+ "no es valido al menos en este mes"+mes);    
        }
        this.mes=mes;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        if (dia > 1 || dia < 30){
            this.dia = dia;
        } else{
            throw new DateException("el dia" +dia+ "no es valido al menos en este mes"+mes);    
        }
        this.mes=mes;
        break;
        }
}
public boolean esELMismoAnyo(Date date){
    if (this.getAnyo()== getAnyo()){
        return true;
    } else{
        return false;
    }
}
public boolean esElMismoMes(Date date){
    if (this.getMes()==getMes()){
        return true;
    }else{
        return false;
    }
}
public boolean esElMismoDia(Date date){
    if (this.getDia()==getDia()){
        return true;
    }else {
        return false;
    }
}
public boolean esLoMismo(Date date){
    if (esELMismoAnyo(date) && esElMismoMes(date) && esElMismoDia(date)){
        return true;
    }else {
        return false;
    }
}
public boolean esElMIsmoAnyo(Date date){
    return this.getAnyo() == date.getAnyo();
}
public boolean esElMismoMes1(Date date){
    return this.getMes() == date.getMes();
}
public boolean esElMismoDia1(Date date){
    return this.getDia()==date.getDia();
}
public boolean esIgual(Date date){
    return esElMismoDia(date) && esElMismoMes(date) && esELMismoAnyo(date);
}
public int diasDelMes(){
    int salida=0;
    salida = diasDelMes();
    return salida;
}
private int diasDelMes(int mes) {
    int salida;
    switch (this.mes) {
        case 4:
        case 6:
        case 9:
        case 11:
            salida=30;
            break;
        case 2:
            salida = 28;
            break;
        default:
            salida = 31;
            
    }
    return salida;
}
public String getMesNombre(){
    StringBuilder salida = new StringBuilder();
    switch (this.mes) {
        case 1:
        salida.append ("Enero");
        break;
        case 2:
        salida.append("Febrero");
        break;
        case 3:
        salida.append("Marzo");
        break;
        case 4:
        salida.append("Abril");
        break;
        case 5:
        salida.append("Mayo");
        break;
        case 6:
        salida.append("Junio");
        break;
        case 7:
        salida.append("Julio");
        break;
        case 8:
        salida.append("agosto");
        break;
        case 9:
        salida.append("septiembre");
        break;
        case 10:
        salida.append("octubre");
        break;
        case 11:
        salida.append("Noviembre");
        break;
        case 12:
        salida.append("Diciembre");
        break;
    }
    return salida.toString();
}
public String getEstcionNombre(){
    StringBuilder salida = new StringBuilder();
    switch (this.mes) {
        case 9:
        case 10:
        case 11:
            salida.append("otonyo");
            break;
        case 12:
        case 1:
        case 2:
            salida.append("Invierno");
            break;
        case 3:
        case 4:
        case 5:
            salida.append("primavera");
            break;
        case 6:
        case 7:
        case 8:
            salida.append("Verano");
            break;
    }
    return salida.toString();
}
public String getMesLeft(){
    StringBuilder salida = new StringBuilder();
    int aux = this.mes;
    if (this.mes == 12){
        salida.append("0 meses left");
    } for (int i= this.mes+1; i <= 12; i++){
        this.mes+=1;
        salida.append(getMesNombre());
        salida.append("");
    }
    this.mes = aux;
    return salida.toString();
}
public String getDiasLeftMes(){
    StringBuilder salida = new StringBuilder();
    switch (this.mes) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            for (int i=this.dia+1; i<=31 ; ++i) {
                salida.append(i + "/"+ this.mes+"/"+this.anyo);
                salida.append(" ");
            }
            break;
        case 2:
            for (int i=this.dia+1; i<=28 ; ++i ) {
                
                salida.append(i + "/"+ this.mes+"/"+this.anyo);
                salida.append(" ");
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            for (int i=this.dia+1; i<=30 ; ++i ) { 
                salida.append(i + "/"+ this.mes+"/"+this.anyo);
                salida.append(" ");
            }
            break;
    }
    return salida.toString();
}
public String getMesCoincidenDias(){
    StringBuilder salida= new StringBuilder();
    switch (this.mes) {
        case 1:
        salida.append("enero");
        break;
        case 3:
        salida.append("marzo");
        break;
        case 5:
        salida.append("mayo");
        break;
        case 7:
        salida.append("julio");
        break;
        case 8:
        salida.append("agosto");
        break;
        case 10:
        salida.append("octubre");
        break;
        case 12:
            salida.append(" diciembre");
            break;
        case 2:
            salida.append("Febrero");
            break;
        case 4: 
        salida.append("abril");
        break;
        case 6:
        salida.append("junio");
        break;
        case 9:
        salida.append("septiembre");
        break;
        case 11:
            salida.append("noviembre");
            break;
    }
    return salida.toString();
}
public int diasPasan(){
    int diasParaEmpezar=0;
        for (int i =1; i<this.mes ; i++) {
         switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                diasParaEmpezar += 31;
                break;
            case 2:
                diasParaEmpezar += 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasParaEmpezar += 30;
                break;
         }
    } 
    return diasParaEmpezar;
}
public int numRandomEqualDate(){	
    int randomDia=365;
    int intentos =0;
    while(this.dia != randomDia) {
        randomDia = (int)(Math.random()*((364-0)+1))+0;
        intentos++;
    }
    return intentos;
}
public String diaDeSemana(int primerDiaDeAnyo){
    StringBuilder salida = new StringBuilder();  
    int diaDeSemana = (this.dia %7)+primerDiaDeAnyo;
        switch (primerDiaDeAnyo) {
            case 7:
                salida.append("domingo");
                break;
            case 1:
                salida.append("lunes");
                break;
            case 2:
                salida.append("martes");
                break;
            case 3:	
                salida.append("miercoles");
                break;
            case 4:
                salida.append("jueves");
                break;
            case 5:
                salida.append("viernes");
                break;
            case 6:
                salida.append("sabado");
                break;
        }
    return salida.toString();
}

}

