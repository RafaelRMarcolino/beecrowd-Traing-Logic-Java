package POO;

import genericSetMaps.generics.application.List;

public class Compra {

    private String nome;

    public List<Item> item = new List<Item>();

    public Compra(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }
}
