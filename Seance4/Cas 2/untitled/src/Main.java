public class Main {
    public static void main(String[] args) {
        DataSourceDecorator application1 = new DotToNewlineDecorator(
                new RemoveSpaceDecorator(
                    new RemoveSemiColonDecorator(
                            new FileDataSource("src/input.txt", "src/output1.txt")
                    )
            )
        );
        String inputString = application1.readData();
        application1.writeData(inputString);

        DataSourceDecorator application2 = new RemoveSpaceDecorator(
                new DotToNewlineDecorator(
                        new FileDataSource("src/input.txt", "src/output2.txt")
                )
        );
        String inputString2 = application2.readData();
        application2.writeData(inputString2);

    }
}