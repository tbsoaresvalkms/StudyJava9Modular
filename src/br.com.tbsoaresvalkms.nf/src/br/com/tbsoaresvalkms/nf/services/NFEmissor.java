package br.com.tbsoaresvalkms.nf.services;

import br.com.tbsoaresvalkms.domain.models.Book;
import br.com.tbsoaresvalkms.nf.engine.NFSubscriber;
import br.com.tbsoaresvalkms.nf.models.NF;

import java.util.concurrent.SubmissionPublisher;

public class NFEmissor {
    private final SubmissionPublisher<NF> publisher;

    public NFEmissor() {
        this.publisher = new SubmissionPublisher<>();
        this.publisher.subscribe(new NFSubscriber());
    }

    public void emit(String client, Book book) {
        NF nf = new NF(client, book.getName(), 10);
        this.publisher.submit(nf);
    }

    public void close() {
        this.publisher.close();
    }
}
