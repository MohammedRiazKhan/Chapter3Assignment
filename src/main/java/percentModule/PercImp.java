package percentModule;

public class PercImp implements Perc {
    @Override
    public double percent(double value, int percent) {
        return value * percent/100;
    }
}
