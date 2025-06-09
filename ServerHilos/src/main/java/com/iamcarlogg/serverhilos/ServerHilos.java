/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.iamcarlogg.serverhilos;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author carlo
 */
public class ServerHilos {

    public static void main(String[] args) {
               try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Esperando conexiones...");
            
            while (true) {
                // Aceptar una conexión entrante
                Socket socketCliente = serverSocket.accept();
                System.out.println("Cliente conectado desde " + socketCliente.getInetAddress());
                
                // Crear un nuevo hilo para manejar al cliente
                new Thread(new ManejadorCliente(socketCliente)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }


