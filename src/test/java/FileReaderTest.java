import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


import static junit.framework.TestCase.assertEquals;

/**
 * Mocking test for FileReader
 */
@RunWith(MockitoJUnitRunner.class)
public class FileReaderTest {
    @Mock
    private Scanner scanner;

    @Test
    public void shouldReadLine()
    {
        //given
        Mockito.when(scanner.nextLine()).thenReturn("NEXT LINE FROM FILE :)");
        FileReader fileReader = new FileReader(scanner);
        //when
        String result = fileReader.readNextLine();
        //then
        assertEquals("NEXT LINE FROM FILE :)", result);
    }
}