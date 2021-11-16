package bsu.comp152.windowwebdata;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;

public class DataHandler {
    private HttpClient dataGrabber;
    private String webLocation;

    public DataHandler(String siteToSearch) {
        dataGrabber = HttpClient.newHttpClient();
        webLocation = siteToSearch;
    }

    public universityDataType[] getData()   {
        var requestBuilder = HttpClient.newBuilder();
        var ourURI = URI.create(webLocation);
        var dataRequest = requestBuilder.uri(ourURI).build();
        HttpResponse<String> response = null;
    }


    class universityDataType    {
        String alpha_two_code;
        ArrayList<String> web_pages;
        String name;
        String country;
        ArrayList<String> domains;

        @Override
        public String toString()    {
            return name;
        }
    }
}
