public class ClassNotFoundException {
    public static void main(String[] args) {
        
        try{
            Class.forName("exapmle.abc");

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
