package br.com.semcodar.tomada;

public abstract class Tomada<P> {

    public abstract String conecta(P plug);

    public abstract String getNomeRede();
}
