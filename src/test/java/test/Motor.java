package test;
public class Motor{
    
    int numeroCilindros;
    String tipo;
    int registro;

    void cambiarRegistro(int registro){
        this.registro=registro;
    }

    void asignarTipo(String tipo){
        if(tipo=="electrico"){
            this.tipo=tipo;
        }if(tipo=="gasolina"){
            this.tipo=tipo;
        }
        else{
            this.tipo=null;
        }
           
    }
}