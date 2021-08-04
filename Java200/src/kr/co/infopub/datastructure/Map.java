package kr.co.infopub.datastructure;

import kr.co.infopub.object.Geo;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Geo> cities = new HashMap<String, Geo>(); // Map 생성, 키 타입은 String, 벨류 타입은 Geo
        cities.clear(); // Map에 저장된 내용 제거
        cities.put("Korea", new Geo(37.5670, 126.9807));
        cities.put("Austria", new Geo(47.01, 10.2));
        cities.put("US", new Geo(40.714086, -74.228697));

        System.out.println(cities.size());     // Map에 저장된 개수
        System.out.println(cities.containsKey("Austria")); // 키 값에 Austria가 있는가?
        Geo geo = cities.get("Austria"); // Austria 값에 해당하는 밸류
        System.out.printf("%s: 위도:%f, 경도%f\n", "Austria", geo.getLatitude(), geo.getLongitude());


    }
}
