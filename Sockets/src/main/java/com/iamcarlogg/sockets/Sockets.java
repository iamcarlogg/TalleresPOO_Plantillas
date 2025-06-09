/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iamcarlogg.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author carlo
 */
public class Sockets {

    public static void main(String[] args) {
        try {
            // Crear un servidor en el puerto 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Esperando conexiones...");
            
            // Aceptar una conexión entrante
            Socket socketCliente = serverSocket.accept();
            System.out.println("Cliente conectado desde " + socketCliente.getInetAddress());
            
            // Crear los flujos de entrada y salida para la comunicación
            InputStream inputStream = socketCliente.getInputStream();
            OutputStream outputStream = socketCliente.getOutputStream();
            
            // Crear un objeto para leer datos
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            PrintWriter writer = new PrintWriter(outputStream, true);
            
            // Leer mensaje enviado por el cliente
            String mensaje = reader.readLine();
            System.out.println("Mensaje del cliente: " + mensaje);
            
            // Enviar respuesta al cliente
            writer.println("Hola desde el servidor!");
            
            // Cerrar la conexión
            socketCliente.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
