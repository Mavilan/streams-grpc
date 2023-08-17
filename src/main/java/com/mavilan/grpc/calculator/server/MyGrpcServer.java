package com.mavilan.grpc.calculator.server;

import com.mavilan.grpc.calculator.service.CalculatorServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class MyGrpcServer {

    public static final int PORT = 50050;

    public static void main(String[] args) {

        System.out.println("[SERV][DEB] Inicio del servidor grpc...");
        Server server = ServerBuilder
                .forPort(PORT)
                .addService(new CalculatorServiceImpl())
                .build();

        try {
            server.start();
            System.out.println("[SERV][INF] Servidor iniciado y escuchando en el puerto: " + PORT);

            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("[SERV][WAR] Apagando el servidor...");
                server.shutdown();
                System.out.println("[SERV][WAR] Servidor apagado, ADIOOOooossss!!!!");
            }));

            server.awaitTermination();

        } catch (IOException e) {
            System.out.println("[SERV][ERR] No se pudo iniciar el servidor por: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("[SERV][ERR] No se puede mantener encendido el servidor por: " + e.getMessage());
        }
    }
}
