public class RemoveSemiColonDecorator extends DataSourceDecorator {
    public RemoveSemiColonDecorator(DataSource source) {
        super(source);
    }

    @Override
    public String readData() {
        return super.readData();
    }

    @Override
    public void writeData(String data) {
        super.writeData(data.replace(";", ""));
    }
}
