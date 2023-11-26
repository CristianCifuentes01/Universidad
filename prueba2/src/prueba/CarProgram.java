package prueba;
// Importar las librerías necesarias
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.json.JSONException;
import org.json.JSONObject;

public class CarProgram {

    // Definir la URL base de la API y la clave de acceso
    public static final String API_URL = "https://car-data.p.rapidapi.com/cars?vin=";
    public static final String API_KEY = "b4e9838186mshb386d059d283425p10d594jsna349c8e90094";

    public static void main(String[] args) throws NumberFormatException, JSONException {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Pedir al usuario que introduzca el VIN del coche
        System.out.println("Introduce el VIN del coche:");
        String vin = sc.nextLine();

        // Llamar al método getCarData para obtener la información del coche
        JSONObject carData = getCarData(vin);

        // Comprobar si se obtuvo la información correctamente
        if (carData != null) {
            // Mostrar la información del coche
            System.out.println("Información del coche:");
            System.out.println("Marca: " + carData.getString("make"));
            System.out.println("Modelo: " + carData.getString("model"));
            System.out.println("Año: " + carData.getInt("year"));
            System.out.println("Kilometraje: " + carData.getInt("mileage") + " km");

            // Calcular la edad del coche en años
            int currentYear = 2023; // Asumir que el año actual es 2023
            int  carYear = Integer.valueOf(carData.getString("year"));
            int carAge = currentYear - carYear;

            // Calcular el tiempo de funcionamiento del coche en horas
            int carMileage = carData.getInt("mileage");
            int averageSpeed = 50; // Asumir que la velocidad media es 50 km/h
            int carRunningTime = carMileage / averageSpeed;

            // Mostrar los resultados del cálculo
            System.out.println("El coche tiene " + carAge + " años de edad.");
            System.out.println("El coche ha funcionado " + carRunningTime + " horas aproximadamente.");
        } else {
            // Mostrar un mensaje de error
            System.out.println("No se pudo obtener la información del coche. Inténtalo de nuevo más tarde.");
        }

        // Cerrar el objeto Scanner
        sc.close();
    }

    // Definir el método getCarData que recibe el VIN del coche y devuelve un objeto JSON con la información del coche
    public static JSONObject getCarData(String vin) {
        try {
            // Crear un objeto URL con la URL completa de la API
            URL url = new URL(API_URL + vin);

            // Abrir una conexión HTTP con la URL
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            // Establecer el método de solicitud como GET
            con.setRequestMethod("GET");

            // Establecer la clave de acceso de la API como un encabezado de solicitud
            con.setRequestProperty("x-rapidapi-key", API_KEY);

            // Verificar el código de respuesta de la API
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Crear un objeto BufferedReader para leer la respuesta de la API
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

                // Leer la respuesta de la API línea por línea y almacenarla en un objeto StringBuilder
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                // Cerrar el objeto BufferedReader
                in.close();

                // Convertir el objeto StringBuilder en un objeto JSONObject
                JSONObject json = new JSONObject(response.toString());

                // Cerrar la conexión HTTP
                con.disconnect();

                // Devolver el objeto JSONObject
                return json;
            } else {
                // Mostrar un mensaje de error si la respuesta no es HTTP_OK
                System.out.println("Error en la respuesta de la API. Código de respuesta: " + responseCode);

                // Cerrar la conexión HTTP
                con.disconnect();

                // Devolver null en caso de error
                return null;
            }
        } catch (Exception e) {
            // Mostrar el mensaje de la excepción
            e.printStackTrace();

            // Devolver null en caso de error
            return null;
        }
    }

}
