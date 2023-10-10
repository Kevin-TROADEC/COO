import java.io.*;

public class FileDataSource implements DataSource {
    private String inputName;
    private String outputName;

    FileDataSource(String in, String out) {
        this.inputName = in;
        this.outputName = out;
    }
    @Override
    public void writeData(String data) {
        File file = new File(outputName);
        try (OutputStream fos = new FileOutputStream(file)) {
            fos.write(data.getBytes(), 0, data.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String readData() {
        char[] buffer = null;
        File file = new File(inputName);
        try (FileReader reader = new FileReader(file)) {
            buffer = new char[(int) file.length()];
            reader.read(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return new String(buffer);
    }
}
