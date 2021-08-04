package kr.co.infopub.datastructure;

import java.util.ArrayList;
import kr.co.infopub.object.Geo;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Geo> geolist = new ArrayList<Geo>(); // ArrayList<Geo> 생성
        geolist.clear(); // 리스트의 모든 내용을 제거
        geolist.add(new Geo(37.56, 126.98)); // 객체를 리스트에 넣음
        geolist.add(new Geo(47.01, 10.2));
        geolist.add(new Geo(40.71, -74.22));
        geolist.add(new Geo(19.42, -99.12));
        geolist.add(new Geo(39.90, 116.39));
        geolist.add(new Geo(55.75, 37.61));
        System.out.println(geolist.size()); // 리스트에 저장된 객체의 수

        Geo gt= geolist.get(1);             // index 1의 객체를 가져온다. ( 47.01, 10.2 )
        System.out.printf("위도:%f, 경도:%f\n", gt.getLatitude(), gt.getLongitude());


    }



}
