import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Swit {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String path="G:\\mohit\\";
        int mainChoice;
        int subChoice;

        do {
            System.out.println("Main Menu:");
            System.out.println("1. Assending");
            System.out.println("2. Business");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            mainChoice = sc.nextInt();

            switch (mainChoice) {
                case 1:
                {
                    File file=new File(path);
                    //display operation
                    File filename[]=file.listFiles();
                    //for-each
                    System.out.println("the list of files in asscending order in the "+ path +"is");
                    for(File ff:filename) {
                        System.out.println(ff.getName());
                    }
                    break;}
                case 2:
                    System.out.println("Submenu for Option 1:");
                    System.out.println("1. Add file ");
                    System.out.println("2. Delete file");
                    System.out.println("3. Search file");
                    System.out.println("4. Back to Main Menu");
                    System.out.print("Enter your choice: ");
                    subChoice = sc.nextInt();
                    
                    
                    switch (subChoice) {
                        case 1:{
				
				
					System.out.println("Enter the file Name");
					String filename =sc.next();
					String finalpath = path+filename;
					System.out.println(finalpath);
						File file=new File(finalpath);
						boolean res=file.createNewFile();
						if(res!=true) {
							System.out.println("file is not Add");
						}
						else {
							System.out.println("file is Added in list ");
                        }
							break;
                        }
				
				
				case 2:{
					
					System.out.println("Enter the file  Name to delet");
					String filename =sc.next();
					String finalpath = path+filename;
					System.out.println(finalpath);
				//delete operation
					File file=new File(finalpath);
				  file.delete();
				  System.out.println("file gets deleted");
                  break;
			    	
                }
                
				case 3:
				{
				System.out.println("Enter searching file name");
					String filenamesearch=sc.next();
					File file=new File(path);
					//display operation
					File filename[]=file.listFiles();
					//for-each
					int flag=0;
					for(File ff:filename) {
						if(ff.getName().equals(filenamesearch)) {
							flag=1;
							break;
						}
						else {
							flag=0;
						}
					}
					
					if(flag==1) {
						System.out.println("file is found");
					}
					else {
						System.out.println("file is not found");
					}
					
					break;
				}
                      
                        case 4:
                            System.out.println("Returning to Main Menu.");
                            break;
                        default:
                            System.out.println("Invalid choice. Returning to Main Menu.");
                            break;
                    }
                    break;
            
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (mainChoice != 3);

        sc.close();
    }
}

    


    
