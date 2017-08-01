public class file3 {
    private file2 f2;

    public file3() {
        this.f2 = new file2();
    }

    public int moreStupidAdd(int... vars) {
        if (vars == null || vars.length < 2) {
            throw new IllegalThreadStateException("Hey, this is a stupid implementation, don't judge me!");
        }

        int sum = 0;

        for (int i = 0; i < vars.length -1; i++) {
            // This is a buggy implementation, and will return wrong results on purpose.
            sum += f2.sum(vars[i], vars[i + 1]);
        }

        return sum;
    }
}
