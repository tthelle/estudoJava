package aula05;

    public class Conta {
        public int numConta;
        protected String tipo;
        private String dono;
        private float saldo;
        private boolean status;

        public Conta(){
            this.status = false;
            this.saldo = 0;
        }

        public int getNumConta(){
            return this.numConta;
        }

        public void setNumConta(int num){
            this.numConta = num;
        }

        public String getTipo(){
            return this.tipo;
        }

        public void setTipo(String t){
            this.tipo = t;
        }

        public String getDono(){
            return this.dono;
        }

        public void setDono(String d){
            this.dono = d;
        }

        public float getSaldo(){
            return this.saldo;
        }

        public void setSaldo(float s){
            this.saldo = s;
        }

        public boolean isStatus(){
            return this.status;
        }

        public void setStatus(boolean status){
            this.status = status;
        }

        public void estadoAtual(){
            System.out.println("Conta: " + this.getNumConta());
            System.out.println("Dono: " + this.getDono());
            System.out.println("Saldo: " + this.getSaldo());
            System.out.println("Status: " + this.isStatus());
        }

        public void abrirConta(String t){
            this.setTipo(t);
            this.setStatus(true);
            if (t == "CC"){
                this.setSaldo(50);
            } else if (t == "CP"){
                this.setSaldo(150);
            }
            System.out.println("Conta aberta com sucesso!");
        }

        public void fecharConta() {
            if (this.getSaldo() > 0) {
                System.out.println("Conta não pode ser fechada pois ainda tem dinheiro.");
            } else if (this.getSaldo() < 0){
                System.out.println("Conta não pode ser fechada pois está em débito.");
            } else {
                this.setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }

        public void depositar(float v){
            if (this.isStatus()) {
                this.setSaldo(this.getSaldo() +v);
                System.out.println("Depósito feito com sucesso");
            } else {
                System.out.println("Erro no depósito.");
            }
        }

        public void sacar(float v){
            if (this.isStatus()) {
                if (this.getSaldo() >= v) {
                    this.setSaldo(this.getSaldo() - v);
                    System.out.println("Saldo realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente.");
                }
            } else {
                System.out.println("Impossível sacar de uma conta fechada.");
            }
        }

        public void pagarMensal(){
             int r;
            if (this.getTipo() == "CC"){
                r = 12;
            } else if (this.getTipo() == "CP"){
                r = 20;
            }
            if (this.isStatus()){
                this.setSaldo(this.getSaldo() - r);
                System.out.println("Mensalidade paga com sucesso. saldo atual: " + this.getSaldo());
            }
        }
}
