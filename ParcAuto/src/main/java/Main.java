import java.io.*;

public class Main {
    public static void main(String[] args) {
        //sa se modeleze un parc auto
        //masinilor vor fi citite dintr-un fisier
        //in fisier o sa avem marca , modelul , culoarea , pretul , combustibil ,data fabricarii(separate cu virgula)
        //3 tipuri de masini
        //nemtesti
        //frantuzesti
        //altele

        //O sa citim din fisier masinile
        //Daca masina este nemteasca le scriem intr-un fisier separat
        //la fel si pentru celelalte
        //Masinile au comportamente
        //Pot fi vandute in leazing(avans care scade din pretul total )
        //o sa putem sa luam numarul de rate si cat valoreaza
        //masinile pot fi comparate (calitate)
        //calitatea reprezentat de an de fabricatie
        //Masinile o sa aiba un atribut vandut (boolean)
        //Dupa ce setam campul pe true masinile vandute o sa fie scrise intr-un alt fisier
        //La final o sa afisam toate masinile vandute
        //Masinile vandute o sa fie cele nemtesti de culoare neagra si combustibil benzina


        //Avem nevoie de o clasa masina
        //o sa contrina marca  model , culoare ,pret , combustibil , data favricatie
        //o sa aiba un camp de vanzare(boolean)

        //interfata pentru leazing (getRate+getValoare)
        //implementam pentru a putea compara(Comparable)

        //o sa avem neovie de un fisier de unde sa citim masinile
        //cand le citim le sortam pe fieserul respectiv


        //o sa mai adaugam un fisier cu masinile vandute si o sa le citim

        try {
            String masiniInitiale = "F:\\AdvanceJava\\AdvanceJava1\\Masini\\MasiniInitial.txt";
            FileReader masiniInitialeReader = new FileReader(masiniInitiale);
            BufferedReader masiniInitialeBuffer = new BufferedReader(masiniInitialeReader);


            String masiniNemtesti="F:\\AdvanceJava\\AdvanceJava1\\Masini\\MasiniNemtesti.txt";
            FileWriter masiniNemtestiWriter=new FileWriter(masiniNemtesti);
            BufferedWriter masiniNemstestiBufferd=new BufferedWriter(masiniNemtestiWriter);

            String masiniFrantuzesti="F:\\AdvanceJava\\AdvanceJava1\\Masini\\MasiniFrantuzesti.txt";
            FileWriter masiniFrantuzestiWriter=new FileWriter(masiniFrantuzesti);
            BufferedWriter masiniFrantuzestiBufferd=new BufferedWriter(masiniFrantuzestiWriter);

            String masiniAltele="F:\\AdvanceJava\\AdvanceJava1\\Masini\\MasiniAltele.txt";
            FileWriter masiniAlteleWriter=new FileWriter(masiniAltele);
            BufferedWriter masiniAlteleBuffer=new BufferedWriter(masiniAlteleWriter);

            String masiniVandute="F:\\AdvanceJava\\AdvanceJava1\\Masini\\MasiniVandute.txt";
            FileWriter masiniVanduteWriter=new FileWriter(masiniVandute);
            BufferedWriter masiniVanduteBuffer=new BufferedWriter(masiniVanduteWriter);

            String text=masiniInitialeBuffer.readLine();
            while (text!=null){
                String[] split=text.split(",");
                Masina masina=new Masina(split[0],split[1],split[2],Integer.valueOf(split[3]),split[4],Integer.valueOf(split[5]));
                System.out.println("Rata la masina " +masina.getMarca()+ " este : "+masina.payRate() );

                if(masina.getSold()==true){
                    masiniVanduteBuffer.write(text);
                    masiniVanduteBuffer.newLine();

                }


                text=masiniInitialeBuffer.readLine();
            }
            masiniVanduteBuffer.flush();
            masiniVanduteBuffer.close();


        } catch (IOException e) {
            System.out.println("A aparut eroarea : " + e.getMessage());
        }


    }
}
