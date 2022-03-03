import java.util.Objects;
import java.util.Scanner;

public class BlockchainLauncher {
    private  Scanner in;
    private  String transaction;
    boolean state = true;
    Blockchain bc = new Blockchain();

    public BlockchainLauncher() {

        while (state) {

            in = new Scanner(System.in);
            System.out.println("Enter transaction or press q to quit: ");
            transaction = in.nextLine();
            bc.addBlock(transaction);

            if (Objects.equals(transaction, "q")) {
                break;
            }



        }

        for (Block b : bc.blockchain) {
            System.out.println(b.toString());
        }

    }
}
