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

                writer.write("Inserisci la dimensione massima dell'array: ");

                writer.flush();

                String input = reader.readLine();

                writer.newLine();

                writer.flush();

                try{

                    seq = new Sequenza(Integer.parseInt(input));

                    break;

                } catch (NumberFormatException F){

                    writer.write("Errore! il valore inserito non è valido");

                    writer.newLine();

                    writer.flush();

                }    
            

            } catch (IOException E) {

                E.printStackTrace();

            }

        }while(true);

        try{
            
            seq.aggiungiNumero(12);

			seq.aggiungiNumero(59);

			seq.aggiungiNumero(73);

        }catch(ArrayPienoException A){

            A.printStackTrace();

        }

    }

    public void visualizzaLunghezza(){

        try{

            writer.write("Lunghezza: "+ Integer.toString(this.seq.lunghezza()));

            writer.newLine();
			
			writer.flush();           

        }catch(IOException H){

            H.printStackTrace();

        }

    }

    public void visualizzaMin(){

        try{
		
            writer.write("Min: "+Integer.toString(this.seq.min()));

            writer.newLine();
			
			writer.flush();

        }catch(IOException H){

            H.printStackTrace();

        }

    }

    public void visualizzaMax(){

        try{

            writer.write("Max: "+Integer.toString(this.seq.max())); // idem

            writer.newLine();
			
			writer.flush();

        }catch(IOException H){

            H.printStackTrace();

        }

    }

	public void provaToString(){

		try{

            writer.write("Elementi presenti all'interno della sequenza: " + this.seq.toString());

            writer.newLine();
			
			writer.flush();

        }catch(IOException H){

            H.printStackTrace();

        }


	}

}

