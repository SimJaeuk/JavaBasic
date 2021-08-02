package kr.co.infopub.object;

public class ArrayMain {
    public static void main(String[] args){
        Geo[] geo = new Geo[]{
                new Geo(37.56, 126.98), new Geo(47.01, 10.2),
                new Geo(40.71, -74.22)};

                Geo[] geo1 = new Geo[3];
                geo1[0] = new Geo(37.56, 126.98);
                geo1[1] = new Geo(47.01, 10.2);
                geo1[2] = new Geo(40.71, -74.22);

        System.out.printf("위도 :%f, 경도:%f\n", geo[2].getLatitude(), geo[2].getLongitude());
        System.out.printf("위도 :%f, 경도:%f\n", geo1[0].getLatitude(), geo1[0].getLongitude());

        for(Geo gg: geo){
            System.out.printf("위도 :%f, 경도:%f\n", gg.getLatitude(), gg.getLongitude());
        }
    }
}
