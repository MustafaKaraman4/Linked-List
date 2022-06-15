public class App {
    public static void main(String[] args) throws Exception {
    
       /* dugum yeni= new dugum();
        yeni.yazdir();
        dugum yeni1=new dugum(10);
        yeni1.yazdir();
      
       */
    
    liste listem= new liste();
   
    listem.basaekle(10);
    listem.basaekle(20);
    listem.basaekle(30);
    /* 
   
    listem.basaekle(20);
    listem.basaekle(30);
    listem.listele();
    */
    listem.sonaekle(10);
    listem.sonaekle(20);
    listem.sonaekle(30);
    listem.arayaekle(200, 3);
    listem.listele();
    System.out.println(listem.listeboyutu());
    
    dugum sonuc=listem.elemanbul(30);
    if(sonuc==null){
        System.out.println("bulunamadı");
    }
    else{
        System.out.println("bulundu");
    }
    // yeni bir siraliliste sınıfı oluştur bu sınıf için sadece eleman ekle ve listele fonksiyonu kodla
    // bu fonsiyon sayıları küçükten büyüğe doğru listeye eklesin 
    //***sınav sorusu***
    
    }
}
