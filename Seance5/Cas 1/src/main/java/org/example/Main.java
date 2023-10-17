package org.example;

import org.apache.http.client.utils.URIBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, MalformedURLException, URISyntaxException {
        System.out.println("Entrez l'ID du projet GitLab: ");
        String ID = (new Scanner(System.in)).next();

        // creation d'un builder d'URI
        URIBuilder builder = new URIBuilder(); // builder est un Builder Concret

        GitLabApiDirector d = new GitLabApiDirector(builder); // on instancie le directeur, et on l'associe a notre URIBuilder

        URL url = d.makeGitLabProjectsApiUrl(ID); // d construit l'url avec le builder et retourne l'url construit

        System.out.println(url);
        sendGET(url); // faire un get sur l'URL et afficher les donnees de l'API

    }

    private static String sendGET(URL obj) throws IOException {

        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
            return response.toString();
        } else {
            System.out.println("GET request did not work.");
        }
        return null;
    }
}