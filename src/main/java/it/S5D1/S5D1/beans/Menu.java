package it.S5D1.S5D1.beans;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<VoceMenu> voci;

    public Menu() {
        this.voci = new ArrayList<>();
    }

    public void addVoce(VoceMenu voce) {
        voci.add(voce);
    }

    public List<VoceMenu> getVoci() {
        return voci;
    }
}