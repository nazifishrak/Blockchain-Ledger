import java.util.ArrayList;

public class Blockchain {

    ArrayList<Block> blockchain;

    public Blockchain() {
        this.blockchain = new ArrayList<>();
        blockchain.add(new Block(0, "Genesis Block"));
    }

    public ArrayList<Block> getBlockchain() {
        return blockchain;
    }

    public void addBlock(String b) {
        blockchain.add(new Block(blockchain.get(blockchain.size()-1).prevHash ,b));
    }
}
