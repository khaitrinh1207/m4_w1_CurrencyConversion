package DAO;

public class Convert {
    public double UsdToVnd(double usd){
        double vnd = usd*23000;
        return vnd;
    }

    public double VndToUsd(double vnd){
        double usd = vnd / 23000;
        return usd;
    }
}
