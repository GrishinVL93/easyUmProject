package lesson17;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;

public class CopyWithGuava implements CopyUtils {
    @Override
    public void copy(String from, String to) throws IOException {
        File original = new File(from);
        File copied = new File(to);

        Files.copy(original,copied);
    }
}
