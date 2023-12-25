/*
No Te Puedo Olvidar (NTPO)
Creado por: Emmanuel Acoltzi Bautista
Fecha de creacion:25-08-2023
Correo electronico: basedeemma@gmail.com
*/
package NTPO;
public class NTPO {
    private long Time;
private int Letra;
       public void SimpleLove(long time,int InformationProgress){
      this.Letra=InformationProgress;
      
            this.Time=time;   
            
            //si eligio la opcion para que tenga informacion
            
      if(Letra==1){
        int i=0;
        System.out.print("Progress:\t");
    for(i=1;i<=10;i++){
        String total=""+i;
        System.out.print("♥");
        try{
        Thread.sleep(time);
        }catch(Exception E){}
    }System.out.print("\t "+(i*10-10)+"%");
        }
      
      //si eligio la otra opcion que no contenga la informacion
      
      else if(Letra==0){
        for(int i=1;i<=10;i++){
            System.out.print("♥");
        try{
        Thread.sleep(Time);
        }catch(Exception E){}
        }
        }}

    
    
        public void BarAsterisk(long time,int InformationProgress){
            this.Letra=InformationProgress;
        this.Time=time;
        int i=0;
        
        //si quiere la informacion
        
        if(Letra==1){
        System.out.print("Progress:\t");
    for(i=1;i<=10;i++){
        String total=""+i;
        System.out.print("*");
        try{
        Thread.sleep(time);
        }catch(Exception E){}
    }System.out.print("\t "+(i*10-10)+"%");
        }
        
        //si no quiere la informacion
        
        else if(Letra==0){
        for(i=1;i<=10;i++){
            System.out.print("*");
        try{
        Thread.sleep(time);
        }catch(Exception E){}
        }
        }}

    
        
            public void BarSlash(long time,int InformationProgress){
        this.Time=time;
        this.Letra=InformationProgress;
       
        //si quiere la informacion
        if(Letra==1){
        int i=0;
        System.out.print("Progress:\t");
    for(i=0;i<=10;i++){
        String total=""+i;
        System.out.print("/");
        try{
        Thread.sleep(time);
        }catch(Exception E){}
    }System.out.print("\t "+(i*10-10)+"%");
        }
        //si no quiere la informacion
        else if(Letra==0){
            for(int i=1;i<=10;i++){
        System.out.print("/");
            try{
            Thread.sleep(time);
            }catch(Exception E){}
            }
        }
            }

            
             
        
            public void Arrows(long time,int InformationProgress){
        this.Time=time;
        this.Letra=InformationProgress;
       
        //si quiere la informacion
        if(Letra==1){
        int i=0;
        System.out.print("Progress:\t");
    for(i=0;i<=10;i++){
        if(i<=5){
            System.out.print("<");
        }else{
            System.out.print(">");
        }
        
        try{
        Thread.sleep(time);
        }catch(Exception E){}
    }System.out.print("\t "+(i*10-10)+"%");
        }
        //si no quiere la informacion
        else if(Letra==0){
        for(int i=1;i<=10;i++){
            if(i<=5){
            System.out.print("<");
        }else{
            System.out.print(">");
        }
        
        try{
        Thread.sleep(time);
        }catch(Exception E){}
        }
        
        }
           }
    
      
            public void SimpleBar(long time,int InformationProgress){
        this.Time=time;
        this.Letra=InformationProgress;
       
        //si quiere la informacion
        if(Letra==1){
        int i=0;
        System.out.print("Progress:\t");
    for(i=1;i<=10;i++){
        System.out.print("■");
        
        try{
        Thread.sleep(time);
        }catch(Exception E){}
    }System.out.print("\t "+(i*10-10)+"%");
        }
        //si no quiere la informacion
        else if(Letra==0){
        for(int i=1;i<=10;i++){
            
            System.out.print("■");
       
        
        try{
        Thread.sleep(time);
        }catch(Exception E){}
        }
        
        }
           }
    
            
            
    }

    

