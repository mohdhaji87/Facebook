import java.net.HttpURLConnection;
import java.net.URL;


 class Main{
  public static void main(String args[]) throws Exception {



    URL url = new URL("https://m.facebook.com/dialog/share?client_id=5085647995&redirect_uri=https%3A%2F%2Fwww.facebook.com%2Fdialog%2Freturn%2Fclose&href=http://site50.net");
    HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();


   if (httpCon.getResponseCode()==500)
{
System.out.println("Sorry can't post this link on facebook");
}
else
{
System.out.println("Congrats you can post this link on facebook");
}   

 }
}
