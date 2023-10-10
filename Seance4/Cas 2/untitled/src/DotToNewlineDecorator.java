public class DotToNewlineDecorator extends DataSourceDecorator {
    public DotToNewlineDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data.replace(" ", ""));
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
