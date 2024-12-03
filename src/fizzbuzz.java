public class fizzbuzz {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0 ){
                System.out.println("fizzbuzz");
            }else if(i % 3 == 0  ){
                System.out.println("fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);;
            }
        }
    } 
}
