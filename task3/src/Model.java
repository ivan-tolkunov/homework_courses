import java.util.ArrayList;

public class Model {

    ArrayList<Notebook> notebooks = new ArrayList<>();

    public void addToNotebookNewPerson(Notebook person) {
        notebooks.add(person);
    }
}
