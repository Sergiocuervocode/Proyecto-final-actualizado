package Proyectofinal.Prueba;

import Proyectofinal.vehicules.Camion;
import Proyectofinal.vehicules.Auto;
import Proyectofinal.vehicules.Camioneta;
import Proyectofinal.vehicules.Moto;
import Proyectofinal.Garajesss.Garaje;
import Proyectofinal.Garajesss.GestionEmpresa;
import Proyectofinal.Garajesss.Vehiculo;
import Proyectofinal.excepciones.EspacioInsuficienteException;
import Proyectofinal.excepciones.ExcesoCamionesException;
import Proyectofinal.excepciones.ExcesoMotosException;
import Proyectofinal.excepciones.GarajeException;
import Proyectofinal.excepciones.VehiculoExistenteException;

public class Main {
    public static void main(String[] args) {
        
         
            GestionEmpresa gestion = new GestionEmpresa();

            gestion.crearGaraje("Huila", "Neiva", "CRA 34 6 65", "3112548792", "g1@empresa.co", "MARIA", 9);
            gestion.crearGaraje("Tolima", "Ibague", "CLL65 89 87", "3256987412", "g2@emprersa.co", "PEDRO", 10);

          
            Auto auto1 = new Auto("Toyota", 5000, 2600, "AGC123", 100, true, false); 
            Auto auto2 = new Auto("Honda", 5500, 2000, "AFC131", 100, false, false); 
            Auto auto3 = new Auto("Chevrolet", 5550, 3000, "ABC1456", 100, false, true );
            Auto auto4 = new Auto("Ford", 6000, 5000, "ADC543", 100, false, true);
            Auto auto5 = new Auto("Honda", 6500, 2500, "ABG153", 100, true, false);

            Moto moto1 = new Moto("Yamaha", 4000, 4500, "FGS123", 100, true);   
            Moto moto2 = new Moto("honda", 3000, 500, "FGH456", 100, false); 
            Moto moto3 = new Moto("kawasaki", 7000, 6900, "HGI567", 100, true); 
            Moto moto4 = new Moto("Susuki", 2000, 3000, "JHK456", 100, false); 
            Moto moto5 = new Moto("BMW", 10000, 10000, "LKU567", 100, true); 

            Camion camion1 = new Camion("CAM123", 15000, 2000, "FGH234", 100, 5 , "Sencillo", 2); 
            Camion camion2 = new Camion("CAM123", 16000, 5000, "FHT367", 100, 7, "Doble", 6); 
            Camion camion3 = new Camion("CAM123", 15000, 4000, "HKY890", 100, 3, "Sencillo", 2); 
            Camion camion4 = new Camion("CAM123", 16000, 3000, "FKL345", 100, 6, "Doble", 3); 
            Camion camion5 = new Camion("CAM123", 15000, 7000, "BVC345", 100, 5, "Doble", 4); 
            
            Camioneta camionetaPickup1 = new Camioneta("BMW", 50000, "Pickup", 2, true);
            Camioneta camionetaPickup2 = new Camioneta("kIA", 60000, "Pickup", 2, false);
            Camioneta camionetaPickup3 = new Camioneta("Suzuki", 10000, "Pickup", 2, true);
            Camioneta camionetaPickup4 = new Camioneta("Honda", 40000, "Pickup", 2, false);
            Camioneta camionetaPickup5 = new Camioneta("Hyundai", 30000, "Pickup", 2, true);

            Camioneta camionetaSUV1 = new Camioneta("BMW", 25000, "SUV", 5, false);
            Camioneta camionetaSUV2 = new Camioneta("kIA", 25000, "SUV", 4, true);
            Camioneta camionetaSUV3 = new Camioneta("Ford", 25000, "SUV", 3, false);
            Camioneta camionetaSUV4 = new Camioneta("BMW", 25000, "SUV", 2, true);
            Camioneta camionetaSUV5 = new Camioneta("Subaru", 25000, "SUV", 5, false);

         
            System.out.println("Ingresando vehiculos al garaje 1");
            Garaje garaje1 = gestion.getRed().buscarGaraje(new Garaje("Huila", "Neiva", "CRA 34 6 65", "3112548792", "g1@empresa.co", "MARIA", 9));
            gestion.ingresarVehiculo(garaje1, auto1);
            gestion.ingresarVehiculo(garaje1, auto2);
            gestion.ingresarVehiculo(garaje1, auto3);
            gestion.ingresarVehiculo(garaje1, auto4);
            gestion.ingresarVehiculo(garaje1, auto5);
            gestion.ingresarVehiculo(garaje1, moto1);
            gestion.ingresarVehiculo(garaje1, moto3);
            gestion.ingresarVehiculo(garaje1, moto4);
            gestion.ingresarVehiculo(garaje1, moto5);
            gestion.ingresarVehiculo(garaje1, camion1);
            gestion.ingresarVehiculo(garaje1, camion2);
            gestion.ingresarVehiculo(garaje1, camion3);
            gestion.ingresarVehiculo(garaje1, camion4);
            gestion.ingresarVehiculo(garaje1, camion5);
            gestion.ingresarVehiculo(garaje1, camionetaPickup1);
            gestion.ingresarVehiculo(garaje1, camionetaPickup2);
            gestion.ingresarVehiculo(garaje1, camionetaPickup3);
            gestion.ingresarVehiculo(garaje1, camionetaPickup4);
            gestion.ingresarVehiculo(garaje1, camionetaPickup5);
            gestion.ingresarVehiculo(garaje1, camionetaSUV1);
            gestion.ingresarVehiculo(garaje1, camionetaSUV2);
            gestion.ingresarVehiculo(garaje1, camionetaSUV3);
            gestion.ingresarVehiculo(garaje1, camionetaSUV4);
            gestion.ingresarVehiculo(garaje1, camionetaSUV5);
         
            System.out.println("Ingresando vehiculos al garaje 2");
            Garaje garaje2 = gestion.getRed().buscarGaraje(new Garaje("Tolima", "Ibague", "CLL65 89 87", "3256987412", "g2@emprersa.co", "PEDRO", 10));
            gestion.ingresarVehiculo(garaje2, auto1);
            gestion.ingresarVehiculo(garaje2, auto2);
            gestion.ingresarVehiculo(garaje2, auto3);
            gestion.ingresarVehiculo(garaje2, auto4);
            gestion.ingresarVehiculo(garaje2, auto5);
            gestion.ingresarVehiculo(garaje2, moto1);
            gestion.ingresarVehiculo(garaje2, moto3);
            gestion.ingresarVehiculo(garaje2, moto4);
            gestion.ingresarVehiculo(garaje2, moto5);
            gestion.ingresarVehiculo(garaje2, camion1);
            gestion.ingresarVehiculo(garaje2, camion2);
            gestion.ingresarVehiculo(garaje2, camion3);
            gestion.ingresarVehiculo(garaje2, camion4);
            gestion.ingresarVehiculo(garaje2, camion5);
            gestion.ingresarVehiculo(garaje2, camionetaPickup1);
            gestion.ingresarVehiculo(garaje2, camionetaPickup2);
            gestion.ingresarVehiculo(garaje2, camionetaPickup3);
            gestion.ingresarVehiculo(garaje2, camionetaPickup4);
            gestion.ingresarVehiculo(garaje2, camionetaPickup5);
            gestion.ingresarVehiculo(garaje2, camionetaSUV1);
            gestion.ingresarVehiculo(garaje2, camionetaSUV2);
            gestion.ingresarVehiculo(garaje2, camionetaSUV3);
            gestion.ingresarVehiculo(garaje2, camionetaSUV4);
            gestion.ingresarVehiculo(garaje2, camionetaSUV5);

            
            System.out.println("informe de ocupación y recaudo");
            gestion.generarInforme();

            try {
                gestion.ingresarVehiculo(garaje2, moto1); 
            } catch (VehiculoExistenteException e) {
                System.out.println("Excepcion: " + e.getMessage());
            }

            
            System.out.println("llenando el garaje 1");
            for (int i = 0; i < 200; i++) {  
                try {
                    Moto motoExtra = new Moto("MOTO" + (i + 124), 3000, i, null, i, false);
                    gestion.ingresarVehiculo(garaje1, motoExtra);
                } catch (GarajeException e) {
                    System.out.println("Excepción al agregar vehículo: " + e.getMessage());
                    break;
                }
            }

           
            System.out.println("retirar vehiculo del garaje 1");
            gestion.retirarVehiculo(garaje1, moto1);  

            
            System.out.println("informe de ocupacion despues de retirar un vehiculo");
            gestion.generarInforme();

            try {
                gestion.retirarVehiculo(garaje1, new Moto("NonExistentMoto", 0, 0, "XXX000", 0, false));
            } catch (GarajeException e) {
                System.out.println("Excepcion al retirar vehiculo no existente: " + e.getMessage());
            }

            try {
                gestion.eliminarGaraje(garaje1);
            } catch (GarajeException e) {
                System.out.println("Excepcion al eliminar garaje con vehiculos: " + e.getMessage());
            }

            System.out.println("Recaudo mensual por cada parqueadero y total: ");
            gestion.generarInformeRecaudo();

    }
}