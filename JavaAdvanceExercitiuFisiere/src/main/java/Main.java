import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Sa se citeasca dintr-un fisier linie cu linie
        //Sa se scrie in alt fisier liniile din primul fisier care au numar par de cuvinte



        //Prima data declaram calea
      try {
          String textCitit = "F:\\AdvanceJava\\AdvanceJava1\\FisierDeCitit.txt";
          String textScris = "F:\\AdvanceJava\\AdvanceJava1\\FisierDeScris2.txt";

          FileReader fileReader = new FileReader(textCitit);
          FileWriter fileWriter = new FileWriter(textScris);

          BufferedReader bufferedReader=new BufferedReader(fileReader);
          BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

          String text=bufferedReader.readLine();
          while (text!=null){
              String[] split=text.split(" ");
              if(split.length%2==0){
                  bufferedWriter.write(text);
                  bufferedWriter.newLine();
              }
              bufferedWriter.flush();
              text=bufferedReader.readLine();


          }
          bufferedWriter.close();

      }catch (IOException e){
          System.out.println("A aparut eroarea : "+e.getMessage());
      }

    }
}
