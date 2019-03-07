package addModule;

public class AddImp implements Add {

    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int addAlot(int[] alot) {

        int tot = 0;

        for (int a : alot){
            tot+=a;
        }


        return tot;
    }
}