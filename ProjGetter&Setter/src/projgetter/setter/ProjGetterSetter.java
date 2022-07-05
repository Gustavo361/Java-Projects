package projgetter.setter;

public class ProjGetterSetter {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("NIC", "Amarela", 0.4f);
        Caneta c2 = new Caneta("Cláudio","Preta",1.5f);
        
        c1.status();
        c2.status();
        
        /*c1.setModelo("BIC"); //metodo acessor
        //c1.modelo = "BIC"; //diretamente o atributo
        
        c1.setPonta(0.5f); //metodo acessor
        //c1.ponta = 0.5f; //diretamente o atributo 
        
        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());*/
    }
}