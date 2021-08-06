package kr.co.infopub.staticmethod;

import kr.co.infopub.object.Geo;

public class GeoDistance {
    public static void main(String[] args) {
        Geo seoul = new Geo(37.5670, 126.9807);
        Geo austria = new Geo(47.01, 10.2);
        double distance = HaversineDistance.distance(
                seoul.getLatitude(), seoul.getLongitude(),
                austria.getLatitude(), austria.getLongitude());
        System.out.println(distance);
    }
}
