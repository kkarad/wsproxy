package org.kkarad.wsproxy;

import java.net.InetSocketAddress;

public final class ProxyMain {

    private ProxyMain() {
    }

    public static void main(String[] args) {
        WsProxyServer server = new WsProxyServer(new InetSocketAddress(8181));
        Runtime.getRuntime().addShutdownHook(new Thread(server::shutdown, "proxy-shutdown"));
        server.awaitShutdown();
    }
}
