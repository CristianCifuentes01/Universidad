package prueba;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import org.json.JSONArray;


public class main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        // Obtener marcas de coches disponibles
        JSONArray marcas = getMakes();
        System.out.println("Marcas de coches disponibles: " + marcas);

        
        System.out.println("Ingrese la marca del coche:");
        String marcaCarroA = entrada.nextLine();
        
        JSONArray years = getYears(marcaCarroA);
        System.out.println("Años disponibles para la marca " + marcaCarroA + ": " + years);

        System.out.println("Ingrese el año del coche:");
        int yearCocheA = entrada.nextInt();
        
        JSONArray tipoCoche = getTypes(marcaCarroA);
        System.out.println("Tipos de coche disponibles para la marca " + marcaCarroA + ": " + tipoCoche);
        System.out.println("Ingrese el modelo de su coche: ");
        entrada.nextLine(); 
        String tipoCocheElegido = entrada.nextLine();
        
        System.out.println("Ingrese el kilometraje actual del coche:");
        int kilometrajeActual = entrada.nextInt();

        
        // Calculo del tiempo de daño aproximado
        int promedioKilometrajeAnual = 20000; // Kilometraje anual promedio
        double tiempoDamage = (MAX_KILOMETRAJE - kilometrajeActual) / (double) promedioKilometrajeAnual;
        
        
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Informacion del coche seleccionado"
        					+"\nCoche: "+marcaCarroA
        					+"\nAño: "+yearCocheA
        					+"\nTipo: "+tipoCocheElegido
        					+"\nKilometraje: "+kilometrajeActual);
        System.out.println("El tiempo de daño aproximado para el coche es de aproximadamente " + tiempoDamage + " años.");
       
        //Creacion del objeto de la clase del gemelo digital
        CarDigitalTwin carDigitalTwin = new CarDigitalTwin(marcaCarroA, tipoCocheElegido, yearCocheA, kilometrajeActual, tiempoDamage);
        System.out.println();
        System.out.println("------------------------------------------------------------------");
        // Mostrar la información del gemelo digital
        System.out.println("Creacion de gemelo digital del coche con mantenimiento preventivo");
        System.out.println(carDigitalTwin);

        entrada.close();
        
    }
    
    
    
    
    public static final String API_KEY = "b4e9838186mshb386d059d283425p10d594jsna349c8e90094";
    public static final String API_HOST = "car-data.p.rapidapi.com";
    public static final String API_BASE_URL = "https://car-data.p.rapidapi.com/cars";
    public static final int MAX_KILOMETRAJE = 200000; // Kilometraje máximo estimado en la vida útil del coche
    
    
    //Metodos y conexion de la API 
    
    private static JSONArray getMakes() {
        return sendGetRequest(API_BASE_URL + "/makes");
    }
    private static JSONArray getYears(String make) {
        return sendGetRequest(API_BASE_URL + "/years?make=" + make);
    }
    private static JSONArray getTypes( String make) {
        return sendGetRequest(API_BASE_URL + "/types?make=" + make);
    }
    private static JSONArray sendGetRequest(String url) {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("X-RapidAPI-Key", API_KEY)
                    .header("X-RapidAPI-Host", API_HOST)
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();

            HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 200) {
                return new JSONArray(response.body());
            } else {
                System.out.println("Error en la solicitud. Código de respuesta: " + response.statusCode());
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}



// Clase para representar el gemelo digital del coche
class CarDigitalTwin {
    private String make,type;
    private int year;
    private int currentMileage;
    private double damageTime;
   

    public CarDigitalTwin(String make, String type ,int year, int currentMileage, double damageTime) {
        this.make = make;
        this.year = year;
        this.currentMileage = currentMileage;
        this.damageTime = damageTime+(damageTime*0.25);
        this.type=type;
    }

    @Override
    public String toString() {
        return "Marca: " + make +
               "\nAño: " + year +
               "\nTipo: "+type+
               "\nKilometraje: " + currentMileage +
               "\nTiempo de daño aproximado: " + damageTime + " años";
    }
}


