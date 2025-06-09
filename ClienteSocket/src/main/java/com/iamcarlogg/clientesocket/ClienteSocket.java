import java.io.*;
import java.net.*;

public class ClienteSocket {
    public static void main(String[] args) {
        try {
            // Conectarse al servidor en localhost y puerto 5000
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Conectado al servidor");

            // Crear los flujos de entrada y salida para la comunicación
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            
            // Crear un objeto para escribir datos
            PrintWriter writer = new PrintWriter(outputStream, true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            
            // Enviar mensaje al servidor
            writer.println("¡Hola servidor!");
            
            // Leer respuesta del servidor
            String respuesta = reader.readLine();
            System.out.println("Respuesta del servidor: " + respuesta);
            
            // Cerrar la conexión
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
