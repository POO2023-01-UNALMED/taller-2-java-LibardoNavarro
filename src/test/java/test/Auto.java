package test;

public class Auto {
    public String modelo;
    public int precio;
    public Asiento[] asientos;
    public String marca;
    public Motor motor;
    public int registro;
    public int static cantidadCreados;

    public int cantidadAsientos(){
        int objetosAsiento = 0;

        for (int i = 0; i < asientos.length; i++){

            if (asientos[i] != null){

                objetosAsiento++;
            }
        }
        
        return objetosAsiento;
    }

    public String verificarIntegridad(){

        if (this.motor.registro != this.registro){
            return "Las piezas no son originales";
        }

        for (int i = 0; i < asientos.length; i++){
            if (asientos[i] != null && asientos[i].registro != this.registro){
                return "Las piezas no son originales";
            }
        }

        return "Auto original";
    }

}
