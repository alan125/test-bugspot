
public class file2 {

    private file1 f1;

    public file2() {
        this.f1 = new file1();
    }

    public int sum(int var1, int var2) {
        return f1.add(var1, var2);
    }
}
