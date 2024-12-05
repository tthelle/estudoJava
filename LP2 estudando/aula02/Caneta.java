package aula02;
    public class Caneta{
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;

        void status(){
                System.out.println("Uma caneta de cor " + this.cor);
                System.out.println("De ponta " + this.ponta);
                System.out.println("Modelo " + this.modelo);
                System.out.println("Está com " + this.carga + "% de carga");
                if (!this.tampada) {
                    System.out.println("Não está tampada.");
                } else {
                    System.out.println("Está tampada.");
                }
        }

        void rabiscar(){
            if (this.tampada == false){
                System.out.println("Estou rabiscando!");
            } else {
                System.out.println("Erro!! Com a caneta tampada, sou incapaz de rabiscar");
            }
        }

        void tampar(){
            this.tampada = true;
        }
        
        void destampar(){
            this.tampada = false;
        }
    }