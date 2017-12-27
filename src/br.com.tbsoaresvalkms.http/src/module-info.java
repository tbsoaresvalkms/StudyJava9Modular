module br.com.tbsoaresvalkms.http {
    exports br.com.tbsoaresvalkms.http.requests;
    requires jdk.incubator.httpclient;
    requires transitive br.com.tbsoaresvalkms.domain;
}