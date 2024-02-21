package co.edu.uniquindio.poo;

public class ServicioSpa extends Servicio implements IConsumible{

    public ServicioSpa(String descripcion) {
        super(descripcion);
        
    }

    @Override
    public void consumir() {
        System.out.println("Realizando servicio de Spa :)");
    }

  
    
    
}
