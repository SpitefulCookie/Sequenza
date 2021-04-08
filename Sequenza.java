class Sequenza{

    private int dimensionecorrente;

    private int[] numeri;

    private int min = Integer.MAX_VALUE;

    private int max = Integer.MIN_VALUE;

    public Sequenza(int dim){

        this.numeri = new int[dim];

        this.dimensionecorrente = 0;

    }

    public void aggiungiNumero(int num) throws ArrayPienoException{

        if(this.numeri.length == dimensionecorrente){

            throw new ArrayPienoException();

        } else{

            this.numeri[dimensionecorrente] = num;

            dimensionecorrente++;

            if(num<this.min){

                this.min = num;

            }

            if(num>this.max){

                this.max = num;
                
            }

        }

    }

    public String toString() {
        
        String buffer="";

        for(int i = 0; i<dimensionecorrente; i++){

           buffer=buffer.concat(Integer.toString(this.numeri[i])+"; ");

        }

        return buffer;
    }

    public int max(){

        return this.max;

    }

    public int min(){

        return this.min;
        
    }

    public int lunghezza(){

        return this.numeri.length;

    }

}