public class RemoveSpaceAndNewlineDotDecorator extends DataSourceDecorator {
    public RemoveSpaceAndNewlineDotDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(data.replace(" ", "").replace('.', '\n'));
    }

    @Override
    public String readData() {
        return super.readData();
    }
}
