package ws;

import javax.xml.ws.Endpoint;

public class Publicar {
    public static void main(String[] args) {
        Storage storage = new Storage();
        String URL = "http://localhost:8080/signows";

        System.out.println("SignoWS rodando: " + URL + "?wsdl");
        Endpoint.publish(URL, storage);
    }
}
