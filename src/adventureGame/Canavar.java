package adventureGame;

public class Canavar {

        private int id;
        private int hasar;
        private int can;

        public Canavar(int id, int hasar, int can) {
            this.id = id;
            this.hasar = hasar;
            this.can = can;
        }

        public int getId() {
            return id;
        }

        public int getHasar() {
            return hasar;
        }

        public int getCan() {
            return can;
        }

        public int vur(int hasar) {
            this.can -= hasar;
            if (this.can < 0) {
                this.can = 0;
            }
            return this.can;
        }
    }


