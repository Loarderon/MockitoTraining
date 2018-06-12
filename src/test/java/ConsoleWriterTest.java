import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;

/**
 * ConsoleWriter test using Mockito
 */
public class ConsoleWriterTest {
    @Test
    public void shouldPrintTest()
    {
        //given
        PrintStream printStreamMock = Mockito.mock(PrintStream.class);
        ConsoleWriter consoleWriter = new ConsoleWriter(printStreamMock);
        //when
        consoleWriter.print("test");
        //then
        Mockito.verify(printStreamMock).println("test");
    }
}