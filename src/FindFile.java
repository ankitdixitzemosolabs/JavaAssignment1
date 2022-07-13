import java.io.File;
import java.util.Scanner;

public class FindFile {
    public void findFile(){

            // address of files or folder where to search
            File file = new File("/home/zadmin");
            //string to store the name of the file
            String str ;
            //  Scanner is declare
            Scanner in = new Scanner(System.in);
            // do while is used to run the program again and again
            do{
                int ab =0;
                System.out.println("ENTER THE NAME OF FILE OR FOLDER");
                //take input
                str =in.nextLine();
                //list of file is stored in string
                System.out.println("file is");
                System.out.println(file);

                String[] files = file.list();


                //continous check each file or folder
                if(files != null){
                    for (String string : files){
                        //check the name of file present or not and store in boolean str1
                        System.out.println("file List ");
                        System.out.println(string);
                        Boolean str1 = str.equals(string);
                        // str1 is true than print the following
                        if (str1){
                            ab = 1;
                            System.out.println("File Found : ");
                            System.out.println(string);
                            //print the address of the file
                            System.out.println("Path : "+ file.getAbsolutePath());
                        }
                    }
                    //if file not found
                    if(ab == 0)
                    {
                        System.out.println("File not find : Reenter the name of the file.");
                    }
                }

            } while(true);

    }
    public static void main(String[] args) {
      //object of FindFile class is created
        FindFile obj =new FindFile();
        //calling the findFile()
        obj.findFile();
    }
}
