package org.example;

import org.apache.http.client.utils.URIBuilder;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class GitLabApiDirector {
    private URIBuilder builder;

    public GitLabApiDirector(URIBuilder builder) {
        this.builder = builder;
        this.builder.setScheme("https"); // defini le protocol de l'URI
        this.builder.setHost("gitlab.com"); // Defini le host (le domaine) de l'URI
    }

    // Directeur indique l’ordonnancement des étapes de construction d'un URL vers l'api projets de gitlab
    public URL makeGitLabProjectsApiUrl(String ID) throws URISyntaxException, MalformedURLException {
        this.resetBuilder(); // reinitialisation du builder

        this.builder.setPathSegments(
                "api",
                "v4",
                "projects", // defini les segments du chemin pour les projet
                ID  // defini le segment de l'ID de projet
        );

        URL url;
        url = this.builder.build().toURL(); // construit l'URL final et le retourne
        return url;
    }


    public void resetBuilder() {
        this.builder.setPath("");
        this.builder.clearParameters();
        this.builder.removeQuery();
    }

}
