package ex34;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.ArrayList;

class DeleteNameTest {

    @Test
    void remove_names() {
        DeleteName app = new DeleteName();
        String[] names = {"Chris Julio", "John James", "Rich Dave", "Keith Williams", "Lionel Messi"};
        String[] new_names = DeleteName.remove_names(names,"Lionel Messi");
        assertEquals(4, new_names.length);
    }
}