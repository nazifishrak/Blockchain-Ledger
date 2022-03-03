import java.util.Arrays;

public class Block {
    int prevHash;
    int hash;
    String transaction;


    public Block(int prevHash, String transaction) {
        this.prevHash = prevHash;
        this.transaction = transaction;
        this.hash = Arrays.hashCode(new int[] {transaction.hashCode(), prevHash});
    }

    public int getPrevHash() {
        return prevHash;
    }

    public void setPrevHash(int prevHash) {
        this.prevHash = prevHash;
    }

    public int getHash() {
        return hash;
    }

    public void setHash(int hash) {
        this.hash = hash;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Block{" +
                "prevHash=" + prevHash +
                ", hash=" + hash +
                ", transaction='" + transaction + '\'' +
                '}';
    }
}
