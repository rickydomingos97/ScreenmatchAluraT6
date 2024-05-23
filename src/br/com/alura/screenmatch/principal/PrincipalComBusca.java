package br.com.alura.screenmatch.principal;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        // leitura da busca do filme pelo usuario
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um filme para busca: ");
        var busca = leitura.nextLine();

        // chamada da API/OMDB
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=e631682f";
        //    System.out.println(endereco);

        // chamada da API/OMDB com o uso da var enderec
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }

    Gson gson = new Gson();

    public Gson getGson() {
    };
}