package OopCamara;

public class Stelaj {

    private Raft[] rafturi = new Raft[]{
            new Raft(),//avem doar 4 rafturi
            new Raft(),
            new Raft(),
            new Raft(),
    };

    public void afisare() {
        System.out.println("Afisare camara");
        for (int i = 0; i < rafturi.length; i++) {
            System.out.println("Raft" + i);
            rafturi[i].afisare();
        }
    }

    public boolean isEmpty() {
        boolean empty = true;
        for (Raft r : rafturi)
            empty = empty && r.isEmpty();
            return empty;

    }
    public boolean adaugare(ObiectDinCamara obiect) {
        for(Raft raft : rafturi) {
            //if(!raft.isFull())
            if(raft.adauga(obiect))
                return true;
        }
        return false;
    }
}



