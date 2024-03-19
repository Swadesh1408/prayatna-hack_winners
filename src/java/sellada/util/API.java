/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sellada.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Swadesh Sharma
 */
public class API {

    public static String getApiKey() {
        String output = "";
        StringBuffer api=new StringBuffer();
        try {
            URL url = new URL("http://13.48.136.54:8000/api/api-code/");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Authorization", "Bearer 5e4455b2-0877-45c6-985a-529347c0ee68");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            System.out.println("Output from Server .... \n");
            while ((output = br.readLine())!=null) {
                  if (output.contains("api_code")){
                      output=output.substring(output.indexOf("PR"), output.length()-6);
                      return output;
                  }
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return output;
    }

    public static void main(String[] args) {
        String api = API.getApiKey();
//        Pattern p = Pattern.compile("^.*$");
//        
//        Matcher apiKey=p.matcher(api);
        System.out.println(api);
    }
}
