public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        ConsoleReader consoleReader = new ConsoleReader(order);
        consoleReader.inputFromConsole();
        Json json = new Json(order);
        json.saveToJson();
    }
}

