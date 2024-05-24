package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecoes.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TitulosOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

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

        String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=e631682f";
        //    System.out.println(endereco);
        try {
            // chamada da API/OMDB com o uso da var enderec
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // tratamento da resposta
            String json = response.body();
            //System.out.println(json);

            // transformando o json em um objeto
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
            TitulosOmdb meuTituloOmbd = gson.fromJson(json, TitulosOmdb.class);
            System.out.println(meuTituloOmbd);
            // tratativa do erro com o uso de try catch //
            //  try {
            Titulo meuTitulo = new Titulo(meuTituloOmbd);
            System.out.println("Titulo já convertido");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        }
    }
}