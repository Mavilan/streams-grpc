package com.mavilan.grpc.calculator.service;

import com.mavilan.grpc.calculator.AverageResponse;
import com.mavilan.grpc.calculator.CalculatorServiceGrpc;
import com.mavilan.grpc.calculator.NumberMessage;
import com.mavilan.grpc.calculator.PrimeResponse;
import com.mavilan.grpc.calculator.SqrtResponse;
import com.mavilan.grpc.calculator.SumRequest;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {

    @Override
    public void sum(SumRequest sumRequest, StreamObserver<NumberMessage> responseObserver) {
        System.out.println("[IMPL][DEB] Iniciando método suma del servicio...");
        responseObserver.onNext(
                NumberMessage.newBuilder()
                        .setNumber(sumRequest.getFirstNumber() + sumRequest.getSecondNumber())
                        .build());

        System.out.println("[IMPL][INF] Terminando metodo suma del servicio...");
        responseObserver.onCompleted();
    }

    @Override
    public void primes(NumberMessage numberMessage, StreamObserver<PrimeResponse> responseObserver) {
        System.out.println("[IMPL][DEB] Iniciando el metodo primos del servicio...");
        int posiblePrime = 2;
        int number = numberMessage.getNumber();
        while (number > 1) {
            if (number % posiblePrime == 0) {
                System.out.println("[IMPL][INF] primo encontrado: " + posiblePrime);
                responseObserver.onNext(PrimeResponse.newBuilder().setPrime(posiblePrime).build());
                number = number/posiblePrime;
            } else posiblePrime++;
        }

        responseObserver.onCompleted();
        System.out.println("[IMPL][INF] Terminando el metodo primos del servicio...");
    }

    @Override
    public StreamObserver<NumberMessage> average(StreamObserver<AverageResponse> responseObserver) {
        System.out.println("[IMPL][DEB] Iniciando el metodo average del servicio...");

        return new StreamObserver<NumberMessage>() {
            int sum = 0;
            int count = 0;

            @Override
            public void onNext(NumberMessage numberMessage) {
                sum += numberMessage.getNumber();
                count++;
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("[IMPL][ERR] En caso del error del streamObserver...");
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("[IMPL][INF] Acciones en el onComplete en el server...");
                responseObserver.onNext(AverageResponse.newBuilder().setAverage(
                        (double) sum / count
                ).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<NumberMessage> max(StreamObserver<NumberMessage> responseObserver) {
        return new StreamObserver<NumberMessage>() {
            int maxPropuesto;

            @Override
            public void onNext(NumberMessage numberMessage) {
                System.out.println("[IMPL][INF] En caso del onNext en el servicio...");
                maxPropuesto = Math.max(numberMessage.getNumber(), maxPropuesto);
                responseObserver.onNext(NumberMessage.newBuilder().setNumber(maxPropuesto).build());
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("[IMPL][ERR] En caso del onError en el servicio...");
                responseObserver.onError(throwable);
            }

            @Override
            public void onCompleted() {
                System.out.println("[IMPL][INF] En caso del onComplete en el servicio...");
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public void sqrt(NumberMessage numberMessage, StreamObserver<SqrtResponse> responseObserver) {
        System.out.println("[IMPL] Iniciando el metodo sqrt del servicio...");

        int number = numberMessage.getNumber();
        if (number < 0) {
            responseObserver.onError(Status.INVALID_ARGUMENT
                    .withDescription("The number being sent can't be negative")
                    .augmentDescription("Number: ".concat(String.valueOf(number)))
                    .asRuntimeException());
            return;
        }

        responseObserver.onNext(SqrtResponse.newBuilder().setSqrt(Math.sqrt(number)).build());
        responseObserver.onCompleted();
    }
}
