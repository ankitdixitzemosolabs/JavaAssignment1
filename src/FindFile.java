import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FindFile {
    public void findFile(){

            // address of files or folder where to search
            File file = new File("/home/ankid/");
            //string to store the name of the file
            String str ;
            //  Scanner is declare
            Scanner keyboardInput = new Scanner(System.in);
            boolean isFileFound=false;
            // do while is used to run the program again and again
            do{
                boolean fileFound =false;
                System.out.println("ENTER THE NAME OF FILE OR FOLDER");
                //take keyboard input
                str =keyboardInput.nextLine();

                //list of file is stored in string
                String[] files = file.list();
                //list of file found in string
                ArrayList<String> filesFoundList= new ArrayList<>();

                //continous check each file or folder
                if(files != null){
                    for (String string : files){
                        //check the name of file present or not and store in boolean str1
                        int str1 = string.indexOf(str);
                        // str1 is true than print the following
                        if (str1 != -1){
                            fileFound = true;
                            filesFoundList.add(string);
                        }
                    }
                    //if file not found
                    if(fileFound)
                    {
                        System.out.print("Files Found : ");
                        System.out.println(filesFoundList);
                        //print the address of the file
                        System.out.println("Path : "+ file.getAbsolutePath());
                        isFileFound=true;
                    }
                    if(!fileFound)
                    {
                        System.out.println("File not find : Reenter the name of the file.");
                    }
                }

            } while(!isFileFound);

    }
    public static void main(String[] args) {
      //object of FindFile class is created
        FindFile obj =new FindFile();
        //calling the findFile()
        obj.findFile();
    }
}
