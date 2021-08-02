package kr.co.infopub.object;

public class VarMain {
    public static void main(String[] args){
        Geo seoul = new Geo(37.56, 126.98);
        Geo rusia = new Geo(55.75, 37.61);
        Geo china = new Geo(39.90, 116.39);

        showGeo(seoul, rusia, china);

    }
    public static void showGeo(Geo ...args){
        for(Geo gg: args){
            System.out.printf("위도:%f, 경도:%f\n", gg.getLatitude(), gg.getLongitude());
        }
    }
}
