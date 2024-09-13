public interface fileOperations {

     void open();
     void save(String name);

}

class Text implements fileOperations{

    String fileName;

     public void save(String name){

        fileName = name;
        System.out.println("FIle saved //"+fileName+".txt");
    }
    public void open(){

    }


}



//class PDF implements fileOperations{
//
//    public void save(){
//
//    }
//    public void open(){
//
//    }
//}
