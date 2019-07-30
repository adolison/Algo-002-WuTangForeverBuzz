package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(){
        String response ="";
        Integer x =0;

        do{
            x++;
            if (x!=1) {
                response += "\n";
            }
            if (x%3==0 && x%5==0){
                //System.out.println("WuTang Forever");
                response += "WuTang Forever";
            }
            else
            if(x%3==0){
                //System.out.println("Wu");
                response += "Wu";
            }else
            if(x%5==0){
                //System.out.println("Tang");
                response += "Tang";
            }else
                //System.out.println(x);
                response += x;


        } while(x<15);
        return response;
    }
}
/*for (int x=1;x<=15;x++){
            if (x%3==0 && x%5==0){
                //System.out.println("WuTang Forever");
                response += "WuTang Forever";
            }
            else
                if(x%3==0){
                    //System.out.println("Wu");
                    response += "Wu\n";
                }else
                    if(x%5==0){
                        //System.out.println("Tang");
                        response += "Tang\n";
                    }else
                        //System.out.println(x);
                        response += x+"\n";


        }*/
