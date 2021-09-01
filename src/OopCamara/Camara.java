package OopCamara;


    public class Camara {
        private Stelaj[] stelaje;

        public Camara(int nrStelaje) {
            stelaje = new Stelaj[nrStelaje];

            for(int i=0;i<nrStelaje;i++) {
                stelaje[i] = new Stelaj();
            }
        }

        public void afisare() {
            System.out.println("Afisare camara");

            for (int i=0; i<stelaje.length; i++) {
                System.out.println("Stelaj " + i);
                stelaje[i].afisare();
            }

        }

        public boolean isEmpty() {
            boolean empty = true;
            for(Stelaj stelaj : stelaje)
                empty = empty && stelaj.isEmpty();
            return empty;
        }

        public boolean adauga(Borcan borcan) {
            for(Stelaj st : stelaje) {
                // if(!st.isFull())
                if(st.adaugare(borcan))
                    return true;
            }
            return false;
        }

        public boolean adauga(Sticla sticla) {
            for(Stelaj st : stelaje) {
                // if(!st.isFull())
                if(st.adaugare(sticla))
                    return true;
            }
            return false;
        }
    }




