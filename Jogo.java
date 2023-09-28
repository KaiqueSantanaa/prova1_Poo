import java.util.Random;

public class Jogo {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var personagem = new Personagem("John");
    var personagem2 = new Personagem("Kenjinho",3,3,3);
    // var soneca = new Personagem("Soneca", 0, 4, 10);


    //nasce com muito sono e sem energia. fome mais ou menos
    //ele tem probabilidade 80% de dormir
    //10% de caçar
    //10% de comer
   
    while(personagem.vivo()&&personagem2.vivo()){
      
      if(!personagem.vivo() && !personagem2.vivo()){
          System.out.println("morreu");
          break;
      }
      int oQueFazer = gerador.nextInt(4); //[0..3[
        
        
      switch(oQueFazer){
        case 0:
          personagem.cacar();
          personagem2.dormir();
          break;
        case 1:
        personagem.comer();
        personagem2.cacar();
          break;
        case 2:
        personagem.dormir();
        personagem2.comer();
        break;
        case 3:
        int qmAtaca = gerador.nextInt(3);
      if(qmAtaca == 0){
        personagem.atacar(personagem2);
      }else{
        personagem2.atacar(personagem);
      }
      break;
        
      }
      
    
      personagem.exibirEstado();
      System.out.println("--------------------");
      personagem2.exibirEstado();
      System.out.println("--------------------");
    
    //   System.out.println("--------------------");
    //   var oQueOSonecaVaiFazer = gerador.nextDouble();
    //   if (oQueOSonecaVaiFazer <= 0.3)
    //     soneca.dormir();
    //   else if (oQueOSonecaVaiFazer <= 0.2)
    //     soneca.comer();
    //   else
    //     soneca.cacar();
    //   soneca.exibirEstado();
    //   System.out.println("********************");
       Thread.sleep(3000);
    }
    
    if(!personagem.vivo()&& !personagem2.vivo()){
      System.out.println("morreu");
      
  }
  
  }
}
