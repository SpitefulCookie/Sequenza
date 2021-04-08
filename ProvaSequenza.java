import java.io.*;

public class ProvaSequenza {

    public Sequenza seq = null;

    private InputStream in = System.in;

    private PrintStream out = System.out;

    private BufferedReader reader = new BufferedReader(new InputStreamReader(in));

    private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out));
    
    public void inizializzaSeq(){        

        do{

            try{

                writer.write("Inserisci la dimensione massima dell'array:");

                writer.flush();

                String input = reader.readLine();

                writer.newLine();

                try{

                    seq = new Sequenza(Integer.parseInt(input));

                    break;

                } catch (NumberFormatException F){

                    writer.write("Errore! il valore inserito non è valido");

                    writer.newLine();

                }    
            

            } catch (IOException E) {

                E.printStackTrace();

            }

        }while(true);

        try{
            
            seq.aggiungiNumero(12);

        }catch(ArrayPienoException A){

            A.printStackTrace();

        }

    }

    public void visualizzaLunghezza(){

        try{

            writer.write(this.seq.lunghezza());

            writer.flush();

            writer.newLine();

        }catch(IOException H){

            H.printStackTrace();

        }

    }

    public void visualizzaMin(){

        try{

            writer.write(this.seq.min());

            writer.flush();

            writer.newLine();

        }catch(IOException H){

            H.printStackTrace();

        }

    }

    public void visualizzaMax(){

        try{

            writer.write(this.seq.lunghezza());

            writer.flush();

            writer.newLine();

        }catch(IOException H){

            H.printStackTrace();

        }

    }

}

