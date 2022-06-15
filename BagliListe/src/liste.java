public class liste {
   
    public dugum head;
    
    public liste(){
        this.head=null;
    }
       
   
     

    public void basaekle(int deger){
       dugum yeni=new dugum(deger);
       yeni.sonraki=head;
       this.head=yeni;
  }
      
    public void sonaekle(int deger){
         dugum yeni=new dugum(deger);
          
         if(this.head==null){
           this.head=yeni;
           return;
         }
         
         
         dugum temp=this.head; 
          while(temp.sonraki!=null){
            temp=temp.sonraki;
            
          }     
         temp.sonraki=yeni;   
    
        }

     public void arayaekle(int deger,int indis){
      if((this.head==null) || (indis==1)){
         this.basaekle(deger);
         return;
      }
      dugum yeni=new dugum(deger);
      dugum temp=this.head;
      int sayac=1;
      while(temp.sonraki!=null){
        if(sayac+1==indis){
          break;}
          sayac++;
          temp=temp.sonraki;
      }
      yeni.sonraki=temp.sonraki;
      temp.sonraki=yeni;
     }

      public int listeboyutu(){
        int  sayac=0;
      dugum temp=this.head;
       while(temp!=null){
         sayac++;
      temp=temp.sonraki;
       }
       return sayac;


      } 

      public dugum elemanbul(int deger){
        dugum temp=this.head;
        dugum bulunan=null;
        while(temp!=null){
          if(temp.veri!=deger){
            temp=temp.sonraki;
          }
          else{
            bulunan=temp;
            break;
          }
       
        }
       return bulunan;

      }

      public int elemansil(int deger){
        if(this.head==null){
          return -1;
        }
        
        if(this.head.veri==deger){
          this.head=this.head.sonraki;
          return 0;
        }
        
        dugum temp=this.head;
        while(temp.sonraki.veri!=deger){
          if(temp.sonraki.sonraki==null){
            return -2;}
          temp=temp.sonraki;
        }
         temp.sonraki=temp.sonraki.sonraki;
         return 0;
      }

  
      public void listele(){
      dugum temp=this.head;
      
      if(temp==null){
          System.out.println("Liste bos");
          return;
        }

      while(temp!=null){
        temp.yazdir();
        temp=temp.sonraki;
      }

      }









}
