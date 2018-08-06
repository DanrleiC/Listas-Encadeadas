package listasencadeadas;

public class ListasEncadeadas {

    public static void main(String[] args) {
        
        Lista lst = new Lista();
        lst.PrintAll();
        System.out.println("------------------");
        
      
        lst.AddNoFinal(12);
        lst.AddNoFinal("Pantera");
        lst.AddNoFinal("Lamb of God");
        lst.AddNoFinal(34);
        lst.PrintAll();
        System.out.println("---------------------");

        lst.AddNoInicio(55);
        lst.PrintAll();
        System.out.println("------------------");

        lst.RemoverDoInicio();
        lst.PrintAll();
    }
    
}
