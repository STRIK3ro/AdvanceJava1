import java.io.*;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        //Sa se citeasca fiecare rand dintr-un fisier
        //Sa se afisieaze numarul de cuvinte dintr-un rand


        try {
            //Declaram calea catre fisier
            String filePath = "F:\\FisierDeCitit.txt";


            //Incarcarea fisierului in program
            //Se face cu ajutorul obiectului FileReader
            FileReader fileReader = new FileReader(filePath);

            //Incepem citirea din fisier
            //Obiectul folosit pentru a citi linie cu linie se numeste BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String text = bufferedReader.readLine();
            //Daca nu pui intr-un while nu o sa iti citeasca tot fisierul
            while (text != null) {
                System.out.println("Linia citita este : " + text);
                String[] wordArray = text.split(" ");
                System.out.println("Numarul de cuvinte de pe o linie este : " + wordArray.length);
                text = bufferedReader.readLine();


            }

        } catch (IOException e) {
            System.out.println("A aparut o eroare : " + e.getMessage());
        }

        try {
            String filePathToWrite = "F:\\AdvanceJava\\AdvanceJava1\\FisierDeScris.txt";
            FileWriter fileWriter = new FileWriter(filePathToWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String linieDeScris = "Afara ploua";
            String linieDeScris2="Afara nu mai ploua";
            bufferedWriter.write(linieDeScris);
            bufferedWriter.newLine();
            bufferedWriter.write(linieDeScris2);
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            System.out.println("A aparut eroarea : " + e.getMessage());
        }






    }
}
