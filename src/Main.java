import java.util.Scanner;

public class Main {
    public static DocumentManagement documentManagement = new DocumentManagement();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
            showMenu();
            choice= Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Enter number of documents you want to add");
                    int number = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < number; i++) {
                        addNewDocument();
                    }
                    break;
                case 2:
                    System.out.println("Enter code of document");
                    String code = scanner.nextLine();
                    documentManagement.findbyCode(code);
                    break;
                case 0:
                    System.exit(0);
            }
        }while (true);
    }

    private static void showMenu() {
        System.out.println("1.Add new document");
        System.out.println("2.Find document by code");
        System.out.println("0.Exit");
        System.out.println("Enter your choice");
    }
    private static void addNewDocument(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter code");
        String code = scanner.nextLine();
        System.out.println("Enter publishing company");
        String publishingCompany = scanner.nextLine();
        System.out.println("Enter release amount");
        int releaseAmount = Integer.parseInt(scanner.nextLine());
        String kingOfDocument;
        boolean invalidKind = true;
        do{
            System.out.println("Enter kind of document");
            kingOfDocument = scanner.nextLine();
            if(kingOfDocument.equalsIgnoreCase("Book")){
                invalidKind=false;
                System.out.println("Enter author");
                String author = scanner.nextLine();
                System.out.println("Enter page number");
                int pageNumber = Integer.parseInt(scanner.nextLine());
                Document book = new Book(code,publishingCompany,releaseAmount,author,pageNumber);
                documentManagement.addNewDocument(book);
                System.err.println("Add successfully");
            } else if(kingOfDocument.equalsIgnoreCase("Magazine")){
                invalidKind= false;
                System.out.println("Enter number of publishing");
                int numberPublishing = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter month releasing");
                int monthPublishing = Integer.parseInt(scanner.nextLine());
                Document magazine = new Magazine(code,publishingCompany,releaseAmount,numberPublishing,monthPublishing);
                documentManagement.addNewDocument(magazine);
                System.err.println("Add successfully");
            } else if(kingOfDocument.equalsIgnoreCase("Newspaper")){
                invalidKind = false;
                System.out.println("Enter date publishing ");
                String datePublishing = scanner.nextLine();
                Document newspaper = new Newspaper(code,publishingCompany,releaseAmount,datePublishing);
                documentManagement.addNewDocument(newspaper);
                System.err.println("Add successfully");
            }
        }while (invalidKind);
    }
}
