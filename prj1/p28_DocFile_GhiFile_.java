package prj1;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import javax.naming.NameNotFoundException;

public class p28_DocFile_GhiFile_ {
    public static void main(String[] args) throws NameNotFoundException { // Hoặc thay trycat bằng throws kiểu này
    
    //----- Đọc file 
    

        try{ // Đọc file phải được vào trycat
            File file = new File("prj1/p28_InputData_.txt");
            Scanner sc = new Scanner(file);
            
            String s="";
            while(sc.hasNextLine()){
                String n = sc.nextLine();
                s+=n;
            }
            System.out.println(s);

            sc.close();
        }catch(Exception e){
            System.out.println("Ko mo duoc file");
        }
         

    //----- Ghi file 


        try{ 
            FileWriter wt = new FileWriter("prj1/p28_OutputData_.txt",true); // Thêm true để ghi thêm vào cuối file
            wt.write(100);
            wt.write("\nStart\n");
            wt.write(100+"");
            
            System.out.println("Đa ghi vào file");
            wt.close();
        }catch(Exception e){
            System.out.println("Ko mo duoc file");
        }

        
    //-----
    }
}
