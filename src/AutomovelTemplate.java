public abstract class AutomovelTemplate {

        protected String base;

        protected String carcaca;

        protected String pintura;

        protected String interior;


        public AutomovelTemplate() {

            super();

        }

        public abstract void arrumarBase();

        public abstract void arrumarCarcaca();

        public abstract void pintura();

        public abstract void fixInterior();



        public void fabricaCarro()
        {
            pintura();
            arrumarBase();
            arrumarCarcaca();
            fixInterior();
        }

        public String getBase()
        {

            return base;

        }

        public void setBase(String base)
        {
            this.base = base;
        }

        public String getCarcaca()
        {
            return carcaca;
        }

        public void setCarcaca(String carcaca)
        {
            this.carcaca = carcaca;
        }

        public String getPintura()
        {
            return pintura;
        }

        public void setPintura(String pintura)
        {
            this.pintura = pintura;
        }

        public String getInterior()
        {
            return interior;
        }

        public void setInterior(String interior)
        {
            this.interior = interior;
        }
        public String toString() {

            StringBuilder constroiCarro = new StringBuilder();
            constroiCarro.append("Carro{base=").append(base).append(",carcaca=").append(carcaca)
                    .append(",pintura=")
                    .append(pintura)
                    .append(",interior=")
                    .append(interior).append("}");

            return constroiCarro.toString();

        }

    }


