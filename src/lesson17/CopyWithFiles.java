package lesson17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class CopyWithFiles implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        File fileFrom = new File(from);
        File fileTo = new File(to);
        Files.copy(fileFrom.toPath(),fileTo.toPath());
    }
}
