package test;

public class Auto{

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        int sumatoria=0;

        for (int i=0; i < asientos.length ; i++){
            if (asientos[i] !=null){
                sumatoria++;
            }
        }
        return sumatoria;
    }

    String verificarIntegridad(){
        String retornoGeneral="";
        
        if (this.motor.registro==registro){
            boolean confirmacion= false;
            for (int i=0; i<asientos.length; i++){
                if (this.asientos[i].registro==registro){
                    confirmacion=true;
                } else{
                    confirmacion=false;}
            }
            if (confirmacion==true){
                retornoGeneral="Auto original";}
        }
        else{
            retornoGeneral="Las piezas no son original";
        }
        return retornoGeneral;
            

    }

}