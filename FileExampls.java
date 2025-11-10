/*
 * NAME: aaron martinez bastidas
 * DATE: 21/10/2025
 * VERSION: 1 ig
 * SOURCES USED: you mrs smith 
 * COMMENTS: nope
*/

// IMPORT STREAMS // 
import java.io.*; 
import java.util.*; 

public class FileExampls {
    
    private static final String FILE_NAME = "tasks.txt";
    private static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        // Load Task 
        Scanner sc = new Scanner(System.in); 
        boolean running = true; 

        while (running){
            // MENU 
            // ---> Menu List 
            // ---> User Input
            // IF/ELSE or SWITCH for the menu
        }

        // Save Task
        // Close Scanner

    }// END OF MAIN

    // - - - - - - - - - FUNCTIONS  - - - - - - - - - // 

    private static void loadTask()  throws IOException{
        File file = new File(FILE_NAME);
        if (file.exists()){
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()){
                tasks.add(fileReader.nextLine());
            }
            fileReader.close();
        }
    };

    private static void saveTask() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME));
        for (String task : tasks){
            writer.write(task);
            writer.newLine();
        }
        writer.close();
    };

    // Function 3 - viewTask()    // To view the File
    private static void viewTask() {
        if(tasks.isEmpty()) System.out.println("No tasks.");
        else for (int i = 0; i < tasks.size(); i++){
            System.out.println((i+1) + "." + tasks.get(i));
        }
    };


    // Function 4 - addTask()     // To add information to the file
    // Function 5 - removeTask()  // To remove information from the file
    // Error Handling 
    
    // - - - - - - - - - OTHER REQUIREMENTS - - - - - - - - - // 
    // Function 6 - check the status of the task
    // Function 7 - check the status of the task
    // Function 8 - check the status of the task

    // - - - - - - - - - ADDITIONAL FEATURES - - - - - - - - - // 

    // Function 9 - priorityTask() 
    // Function 10 - searchTask() 
    // Function 11 - sortTask() 

}// END OF CLASS 