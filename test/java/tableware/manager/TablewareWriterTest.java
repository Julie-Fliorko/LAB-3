package tableware.manager;

import static org.junit.Assert.fail;

import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

import org.junit.Test;

import tableware.writer.TablewareWriter;

public class TablewareWriterTest extends BaseTablewareManagerTest {
	TablewareWriter tablewareWriter = new TablewareWriter();

	@Test
	public void writeToFileTest() throws IOException {
		try (Writer csvWriter = new FileWriter("TablewareWriter.csv")) {
			tablewareWriter.setCsvWriter(csvWriter);
			tablewareWriter.writerToFile(tableware);
		} catch (Exception e) {
			fail();
		}
	}
}
