package br.com.tbsoaresvalkms.nf.engine;


import br.com.tbsoaresvalkms.nf.models.NF;

public class WSPrefeitura {

    public static void emit(NF nf) throws InterruptedException {
        System.out.println(String.format("NF (%s) recebida", nf));
        Thread.sleep(5000);
        System.out.println(String.format("NF (%s) enviada", nf));
    }
}
