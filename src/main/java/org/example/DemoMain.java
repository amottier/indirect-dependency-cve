package org.example;

import io.grpc.netty.GrpcSslContexts;
import io.netty.handler.codec.http.multipart.AbstractDiskHttpData;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.SslProvider;

public class DemoMain {
    public static void main(String[] args) {
        GrpcSslContexts.configure(SslContextBuilder.forClient(), SslProvider.OPENSSL);
        AbstractDiskHttpData
        /*
        Call trace:
        GrpcSslContexts.configure grcp-netty
        OpenSsl.isAlpnSupported() netty-handler
        OpenSsl static block netty-handler
        OpenSsl.loadTcNative() netty-handler
        NativeLibraryLoader.loadFirstAvailable netty-common
        NativeLibraryLoader.load netty-common (line 185 in version 4.1.52, line 180 in version 4.1.59
         modified from `File.createTempFile` to `PlatformDependent.createTempFile`) as a fix to CVE-2021-21290
         */
    }
}
