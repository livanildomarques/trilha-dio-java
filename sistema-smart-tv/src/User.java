public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv tv = new SmartTv();
        System.out.println("TV está ligada? "+tv.ligada);
        System.out.println("Canal atual: "+tv.canal);
        System.out.println("Volume: "+tv.volume);


        tv.ligar();
        System.out.println("TV está ligada? "+tv.ligada);
    }
}
