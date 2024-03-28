//--Task 3--(TO-DO-LIST )//
import java.util.*;
import java.util.ArrayList;

class Todolist
{
    public static void main(String[] args)
     {
        ArrayList<String> todolist=new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        while (true)
         {
            System.out.println("*****TO DO LIST MENU*****");
            System.out.println("1. Add an item to list");
            System.out.println("2. Remove an item from list");
            System.out.println("3. View the to-do-list");
            System.out.println("4. Quit");

            System.out.print("Select any Choice (1/2/3/4) :");
            int choice =sc.nextInt();

            switch (choice)
             {
         case 1:System.out.print("Enter an item to add : ");
                sc.nextLine();
                String newitem = sc.nextLine();
                todolist.add(newitem);
                System.out.println("New Item Added to to-do-list sucessfully !");
                break;   
                 
        case 2: if(todolist.isEmpty())
        {
            System.out.println(" Your To-do-list is Empty!");
        }  
        else
        {
            System.out.print("Please Enter an Item index number to Remove : ");
            int index=sc.nextInt();
            if(index>=0 && index<todolist.size())
            {
                String itemremoved= todolist.remove(index);
                System.out.println("Selected item Removed Succesfully ! : "+itemremoved);
            }
            else
            {
                System.out.print("Invalid Index Number !! please Enter correct.");
            }
        }  
        break;
                case  3: if (todolist.isEmpty())
                {
                    System.out.println(" Your To-do-list is Empty!");
                }
                else
                {
                    System.out.println("***TO-DO-LIST*** :-");
                    for (int i=0;i<todolist.size();i++)
                    {
                        System.out.println(i+". "+todolist.get(i));
                    }
                }
                break;
                case 4: System.out.println("Program Exited sucessfully ...");
                sc.close();
                System.exit(0);
                default: System.out.println(" You have Entered invalid choice !! please Try again.");
                break;

            }
        }
    }
}