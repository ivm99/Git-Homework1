package Notes.model;

import java.util.List;

public interface iFileOperation {
    List<String> readAllLines();

    void saveAllLines(List<String> lines);
}
