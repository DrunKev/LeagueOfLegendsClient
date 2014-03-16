/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leagueoflegendsclient;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Kevin
 */
public class LeagueOfLegendsClient
{
    public final static String API_KEY = "a6120fa4-b725-4971-8a95-3790140f1cfa";
    static InputStream requestStream;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String url = "https://prod.api.pvp.net/api/lol/na/v1.3/summoner/by-name/RiotSchmick?api_key=";
        try
        {
            requestStream = new URL(url + API_KEY).openStream();
            requestStream.read();
        } catch (MalformedURLException ex)
        {
            Logger.getLogger(LeagueOfLegendsClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex)
        {
            Logger.getLogger(LeagueOfLegendsClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
