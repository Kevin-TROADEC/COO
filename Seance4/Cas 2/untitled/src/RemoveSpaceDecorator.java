public class RemoveSpaceDecorator extends DataSourceDecorator {
    public RemoveSpaceDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data.replace(".", "\n"));
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
