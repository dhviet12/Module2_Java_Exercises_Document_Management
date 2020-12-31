import java.util.ArrayList;

public class DocumentManagement {
    private ArrayList<Document> listDocuments = new ArrayList<>();
    public void addNewDocument(Document document){
        listDocuments.add(document);
    }

    public void findbyCode(String code){
        boolean checkCode = false;
        for (int i = 0; i < listDocuments.size(); i++) {
            Document document = listDocuments.get(i);
            if(document.getCode().equalsIgnoreCase(code)){
                System.out.println(document);
                checkCode=true;
            }
        }
        if(!checkCode){
            System.out.println("Not found");
        }
    }
}
