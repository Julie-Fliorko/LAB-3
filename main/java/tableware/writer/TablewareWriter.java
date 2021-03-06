package tableware.writer;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import tableware.model.AbstractTableware;

public class TablewareWriter {
	private Writer csvWriter;
	
	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}
	
	public void writerToFile(List<AbstractTableware> tableware) throws IOException  {
		csvWriter.write(tableware.get(0).getHeaders());
		csvWriter.write("\n");
		for (AbstractTableware goods : tableware) {
			csvWriter.write(goods.toCSV());
			csvWriter.write("\n");
		}
		csvWriter.flush();
	}

	@Override
	public String toString() {
		return csvWriter.toString();
	}}
