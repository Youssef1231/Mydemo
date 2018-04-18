package thread;

public class Account {
    //1. Judge the account name and passport from the users "xiaoqiang" 123456
    //2. Get how much the user want to draw
    //3. Judge whether the account have enough money or not
    //4. Enough --success ;  Not enough ----fail
    private String name;
    private int pass;

    public Account(String name, int pass) {
        this.name = name;
        this.pass = pass;
    }
}
