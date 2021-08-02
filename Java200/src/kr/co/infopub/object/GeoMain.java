package kr.co.infopub.object;

public class GeoMain {
    public static void main(String[] args) {

        Geo geo1 = new Geo();
        System.out.printf("위도 :%f, 경도:%f\n", geo1.getLatitude(), geo1.getLongitude());

        Geo geo2 = geo1;
        System.out.printf("위도 :%f, 경도:%f\n", geo2.getLatitude(), geo2.getLongitude());
    }
}
