public interface Verificacao {
    void setNext(Verificacao next);
    void verificar(Cliente cliente);
}
