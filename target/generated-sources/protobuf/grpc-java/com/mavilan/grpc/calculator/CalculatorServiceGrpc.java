package com.mavilan.grpc.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.0)",
    comments = "Source: calculator.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CalculatorServiceGrpc {

  private CalculatorServiceGrpc() {}

  public static final String SERVICE_NAME = "mavilan.myprotos.calculus.CalculatorService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.SumRequest,
      com.mavilan.grpc.calculator.NumberMessage> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.mavilan.grpc.calculator.SumRequest.class,
      responseType = com.mavilan.grpc.calculator.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.SumRequest,
      com.mavilan.grpc.calculator.NumberMessage> getSumMethod() {
    io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.SumRequest, com.mavilan.grpc.calculator.NumberMessage> getSumMethod;
    if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSumMethod = CalculatorServiceGrpc.getSumMethod) == null) {
          CalculatorServiceGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.mavilan.grpc.calculator.SumRequest, com.mavilan.grpc.calculator.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.SumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.PrimeResponse> getPrimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Primes",
      requestType = com.mavilan.grpc.calculator.NumberMessage.class,
      responseType = com.mavilan.grpc.calculator.PrimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.PrimeResponse> getPrimesMethod() {
    io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.PrimeResponse> getPrimesMethod;
    if ((getPrimesMethod = CalculatorServiceGrpc.getPrimesMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getPrimesMethod = CalculatorServiceGrpc.getPrimesMethod) == null) {
          CalculatorServiceGrpc.getPrimesMethod = getPrimesMethod =
              io.grpc.MethodDescriptor.<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.PrimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Primes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.PrimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Primes"))
              .build();
        }
      }
    }
    return getPrimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.AverageResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Average",
      requestType = com.mavilan.grpc.calculator.NumberMessage.class,
      responseType = com.mavilan.grpc.calculator.AverageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.AverageResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.AverageResponse> getAverageMethod;
    if ((getAverageMethod = CalculatorServiceGrpc.getAverageMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getAverageMethod = CalculatorServiceGrpc.getAverageMethod) == null) {
          CalculatorServiceGrpc.getAverageMethod = getAverageMethod =
              io.grpc.MethodDescriptor.<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.AverageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.AverageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Average"))
              .build();
        }
      }
    }
    return getAverageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.NumberMessage> getMaxMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Max",
      requestType = com.mavilan.grpc.calculator.NumberMessage.class,
      responseType = com.mavilan.grpc.calculator.NumberMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.NumberMessage> getMaxMethod() {
    io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.NumberMessage> getMaxMethod;
    if ((getMaxMethod = CalculatorServiceGrpc.getMaxMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getMaxMethod = CalculatorServiceGrpc.getMaxMethod) == null) {
          CalculatorServiceGrpc.getMaxMethod = getMaxMethod =
              io.grpc.MethodDescriptor.<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.NumberMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Max"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.NumberMessage.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Max"))
              .build();
        }
      }
    }
    return getMaxMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.SqrtResponse> getSqrtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sqrt",
      requestType = com.mavilan.grpc.calculator.NumberMessage.class,
      responseType = com.mavilan.grpc.calculator.SqrtResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage,
      com.mavilan.grpc.calculator.SqrtResponse> getSqrtMethod() {
    io.grpc.MethodDescriptor<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.SqrtResponse> getSqrtMethod;
    if ((getSqrtMethod = CalculatorServiceGrpc.getSqrtMethod) == null) {
      synchronized (CalculatorServiceGrpc.class) {
        if ((getSqrtMethod = CalculatorServiceGrpc.getSqrtMethod) == null) {
          CalculatorServiceGrpc.getSqrtMethod = getSqrtMethod =
              io.grpc.MethodDescriptor.<com.mavilan.grpc.calculator.NumberMessage, com.mavilan.grpc.calculator.SqrtResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sqrt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.NumberMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mavilan.grpc.calculator.SqrtResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CalculatorServiceMethodDescriptorSupplier("Sqrt"))
              .build();
        }
      }
    }
    return getSqrtMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceStub>() {
        @java.lang.Override
        public CalculatorServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceStub(channel, callOptions);
        }
      };
    return CalculatorServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceBlockingStub>() {
        @java.lang.Override
        public CalculatorServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceBlockingStub(channel, callOptions);
        }
      };
    return CalculatorServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CalculatorServiceFutureStub>() {
        @java.lang.Override
        public CalculatorServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CalculatorServiceFutureStub(channel, callOptions);
        }
      };
    return CalculatorServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CalculatorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.mavilan.grpc.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void primes(com.mavilan.grpc.calculator.NumberMessage request,
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.PrimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPrimesMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> average(
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.AverageResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> max(
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getMaxMethod(), responseObserver);
    }

    /**
     * <pre>
     *returns a Status.INVALID_ARGUMENT if the number is negative
     * </pre>
     */
    public void sqrt(com.mavilan.grpc.calculator.NumberMessage request,
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.SqrtResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSqrtMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mavilan.grpc.calculator.SumRequest,
                com.mavilan.grpc.calculator.NumberMessage>(
                  this, METHODID_SUM)))
          .addMethod(
            getPrimesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.mavilan.grpc.calculator.NumberMessage,
                com.mavilan.grpc.calculator.PrimeResponse>(
                  this, METHODID_PRIMES)))
          .addMethod(
            getAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.mavilan.grpc.calculator.NumberMessage,
                com.mavilan.grpc.calculator.AverageResponse>(
                  this, METHODID_AVERAGE)))
          .addMethod(
            getMaxMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.mavilan.grpc.calculator.NumberMessage,
                com.mavilan.grpc.calculator.NumberMessage>(
                  this, METHODID_MAX)))
          .addMethod(
            getSqrtMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.mavilan.grpc.calculator.NumberMessage,
                com.mavilan.grpc.calculator.SqrtResponse>(
                  this, METHODID_SQRT)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorServiceStub extends io.grpc.stub.AbstractAsyncStub<CalculatorServiceStub> {
    private CalculatorServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.mavilan.grpc.calculator.SumRequest request,
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void primes(com.mavilan.grpc.calculator.NumberMessage request,
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.PrimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getPrimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> average(
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.AverageResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> max(
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getMaxMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *returns a Status.INVALID_ARGUMENT if the number is negative
     * </pre>
     */
    public void sqrt(com.mavilan.grpc.calculator.NumberMessage request,
        io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.SqrtResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CalculatorServiceBlockingStub> {
    private CalculatorServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mavilan.grpc.calculator.NumberMessage sum(com.mavilan.grpc.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.mavilan.grpc.calculator.PrimeResponse> primes(
        com.mavilan.grpc.calculator.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getPrimesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *returns a Status.INVALID_ARGUMENT if the number is negative
     * </pre>
     */
    public com.mavilan.grpc.calculator.SqrtResponse sqrt(com.mavilan.grpc.calculator.NumberMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSqrtMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CalculatorServiceFutureStub> {
    private CalculatorServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CalculatorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mavilan.grpc.calculator.NumberMessage> sum(
        com.mavilan.grpc.calculator.SumRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *returns a Status.INVALID_ARGUMENT if the number is negative
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mavilan.grpc.calculator.SqrtResponse> sqrt(
        com.mavilan.grpc.calculator.NumberMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSqrtMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_PRIMES = 1;
  private static final int METHODID_SQRT = 2;
  private static final int METHODID_AVERAGE = 3;
  private static final int METHODID_MAX = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.mavilan.grpc.calculator.SumRequest) request,
              (io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage>) responseObserver);
          break;
        case METHODID_PRIMES:
          serviceImpl.primes((com.mavilan.grpc.calculator.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.PrimeResponse>) responseObserver);
          break;
        case METHODID_SQRT:
          serviceImpl.sqrt((com.mavilan.grpc.calculator.NumberMessage) request,
              (io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.SqrtResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.AverageResponse>) responseObserver);
        case METHODID_MAX:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.max(
              (io.grpc.stub.StreamObserver<com.mavilan.grpc.calculator.NumberMessage>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mavilan.grpc.calculator.CalculatorProtoClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CalculatorService");
    }
  }

  private static final class CalculatorServiceFileDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier {
    CalculatorServiceFileDescriptorSupplier() {}
  }

  private static final class CalculatorServiceMethodDescriptorSupplier
      extends CalculatorServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorServiceFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getPrimesMethod())
              .addMethod(getAverageMethod())
              .addMethod(getMaxMethod())
              .addMethod(getSqrtMethod())
              .build();
        }
      }
    }
    return result;
  }
}
