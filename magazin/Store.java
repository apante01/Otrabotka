package magazin;

import otdel.Dep;

public class Store {
    private String nameStore;
    private Dep dep;

    public Store(String nameStore) {
        this.nameStore = nameStore;
        System.out.println(nameStore);
        Dep alcohol = new Dep("Отдел Алкоголь");


    }


    public String getNameStore() {
        return nameStore;
    }

    public void setNameStore(String nameStore) {
        this.nameStore = nameStore;
    }

    public Dep getDep() {
        return dep;
    }

    public void setDep(Dep dep) {
        this.dep = dep;
    }


}
