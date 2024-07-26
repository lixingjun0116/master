package com.example.lxjdemo.Controller;

import com.example.lxjdemo.response.Feature;
import com.example.lxjdemo.response.Geometry;
import com.example.lxjdemo.response.MapCoordinate;
import com.example.lxjdemo.response.Properties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 地图测试
 * @Date 2024/7/19 14:02
 * @Created by lxj
 */
@RestController
@RequestMapping("/map")
public class MapController {

    @GetMapping("/coordinates")
    public List<MapCoordinate> getCoordinates() {
        List<MapCoordinate> coordinates = new ArrayList<>();
        coordinates.add(new MapCoordinate(39.149918, 117.132119));
        coordinates.add(new MapCoordinate(39.149966, 117.132073));
        coordinates.add(new MapCoordinate(39.150058, 117.132042));
        coordinates.add(new MapCoordinate(39.150063, 117.131976));
        coordinates.add(new MapCoordinate(39.150138, 117.131923));
        coordinates.add(new MapCoordinate(39.150216, 117.131857));
        coordinates.add(new MapCoordinate(39.150272, 117.131793));
        coordinates.add(new MapCoordinate(39.150348, 117.131723));
        coordinates.add(new MapCoordinate(39.150444, 117.131638));
        coordinates.add(new MapCoordinate(39.150520, 117.13157));
        coordinates.add(new MapCoordinate(39.150591, 117.13150));
        coordinates.add(new MapCoordinate(39.150679, 117.131415));
        coordinates.add(new MapCoordinate(39.150771, 117.131325));
        coordinates.add(new MapCoordinate(39.150896, 117.131184));
        coordinates.add(new MapCoordinate(39.150996, 117.131084));
        coordinates.add(new MapCoordinate(39.151113, 117.130964));
        coordinates.add(new MapCoordinate(39.151211, 117.130846));
        coordinates.add(new MapCoordinate(39.151341, 117.130709));
        coordinates.add(new MapCoordinate(39.151513, 117.130516));
        coordinates.add(new MapCoordinate(39.151670, 117.130304));
        coordinates.add(new MapCoordinate(39.151807, 117.130074));
        coordinates.add(new MapCoordinate(39.151922, 117.129854));
        coordinates.add(new MapCoordinate(39.151990, 117.129707));
        coordinates.add(new MapCoordinate(39.152102, 117.129422));
        coordinates.add(new MapCoordinate(39.152178, 117.129161));
        coordinates.add(new MapCoordinate(39.152218, 117.128956));
        coordinates.add(new MapCoordinate(39.152286, 117.128663));
        coordinates.add(new MapCoordinate(39.152293, 117.128450));
        coordinates.add(new MapCoordinate(39.152256, 117.128177));
        coordinates.add(new MapCoordinate(39.152163, 117.127956));
        coordinates.add(new MapCoordinate(39.152061, 117.127766));
        coordinates.add(new MapCoordinate(39.151932, 117.127632));
        coordinates.add(new MapCoordinate(39.151804, 117.127567));
        coordinates.add(new MapCoordinate(39.151632, 117.127512));
        coordinates.add(new MapCoordinate(39.151399, 117.127444));
        coordinates.add(new MapCoordinate(39.151228, 117.127384));
        coordinates.add(new MapCoordinate(39.151062, 117.127344));
        coordinates.add(new MapCoordinate(39.150815, 117.127304));
        coordinates.add(new MapCoordinate(39.150563, 117.127270));
        coordinates.add(new MapCoordinate(39.150280, 117.127233));
        coordinates.add(new MapCoordinate(39.149974, 117.127164));
        coordinates.add(new MapCoordinate(39.149752, 117.127034));
        coordinates.add(new MapCoordinate(39.149601, 117.1267886));
        coordinates.add(new MapCoordinate(39.149491, 117.126386));
        coordinates.add(new MapCoordinate(39.149403, 117.126043));
        coordinates.add(new MapCoordinate(39.149285, 117.125703));
        coordinates.add(new MapCoordinate(39.149161, 117.125394));
        coordinates.add(new MapCoordinate(39.149007, 117.125104));
        coordinates.add(new MapCoordinate(39.148871, 117.124814));
        coordinates.add(new MapCoordinate(39.148656, 117.124591));
        return coordinates;
    }

    private List<Feature> features;


    public MapController() {
        features = new ArrayList<>();

        features.add(new Feature("Feature1",new Properties(1 , "route1 ", "松林"),new Geometry("Point",new double[]{117.132119, 39.149918})));
        features.add(new Feature("Feature1",new Properties(2 , "route2 ", "柳岸"),new Geometry("Point",new double[]{117.132073, 39.149966})));
        features.add(new Feature("Feature1",new Properties(3 , "route3 ", "竹溪"),new Geometry("Point",new double[]{117.132042, 39.150058})));
        features.add(new Feature("Feature1",new Properties(4 , "route4 ", "梅园"),new Geometry("Point",new double[]{117.131976, 39.150063})));
        features.add(new Feature("Feature1",new Properties(5 , "route5 ", "桃源"),new Geometry("Point",new double[]{117.131923, 39.150138})));
        features.add(new Feature("Feature1",new Properties(6 , "route6 ", "桂香"),new Geometry("Point",new double[]{117.131857, 39.150216})));
        features.add(new Feature("Feature1",new Properties(7 , "route7 ", "枫桥"),new Geometry("Point",new double[]{117.131793, 39.150272})));
        features.add(new Feature("Feature1",new Properties(8 , "route8 ", "桦谷"),new Geometry("Point",new double[]{117.131723, 39.150348})));
        features.add(new Feature("Feature1",new Properties(9 , "route9 ", "桐乡"),new Geometry("Point",new double[]{117.131638, 39.150444})));
        features.add(new Feature("Feature1",new Properties(10, "route10", "柏岭"),new Geometry("Point",new double[]{117.131578, 39.150520})));
        features.add(new Feature("Feature1",new Properties(11, "route11", "桂城"),new Geometry("Point",new double[]{117.131508, 39.150591})));
        features.add(new Feature("Feature1",new Properties(12, "route12", "榆关"),new Geometry("Point",new double[]{117.131415, 39.150679})));
        features.add(new Feature("Feature1",new Properties(13, "route13", "松山"),new Geometry("Point",new double[]{117.131325, 39.150771})));
        features.add(new Feature("Feature1",new Properties(14, "route14", "杉海"),new Geometry("Point",new double[]{117.131184, 39.150896})));
        features.add(new Feature("Feature1",new Properties(15, "route15", "榉林"),new Geometry("Point",new double[]{117.131084, 39.150996})));
        features.add(new Feature("Feature1",new Properties(16, "route16", "榕城"),new Geometry("Point",new double[]{117.130964, 39.151113})));
        features.add(new Feature("Feature1",new Properties(17, "route17", "桦川"),new Geometry("Point",new double[]{117.130846, 39.151211})));
        features.add(new Feature("Feature1",new Properties(18, "route18", "桂巷"),new Geometry("Point",new double[]{117.130709, 39.151341})));
        features.add(new Feature("Feature1",new Properties(19, "route19", "梅溪"),new Geometry("Point",new double[]{117.130516, 39.151513})));
        features.add(new Feature("Feature1",new Properties(20, "route20", "桃林"),new Geometry("Point",new double[]{117.130304, 39.151670})));
        features.add(new Feature("Feature1",new Properties(21, "route21", "桂园"),new Geometry("Point",new double[]{117.130074, 39.151807})));
        features.add(new Feature("Feature1",new Properties(22, "route22", "枫港"),new Geometry("Point",new double[]{117.129854, 39.151922})));
        features.add(new Feature("Feature1",new Properties(23, "route23", "桦峰"),new Geometry("Point",new double[]{117.129707, 39.151990})));
        features.add(new Feature("Feature1",new Properties(24, "route24", "桐山"),new Geometry("Point",new double[]{117.129422, 39.152102})));
        features.add(new Feature("Feature1",new Properties(25, "route25", "松岩"),new Geometry("Point",new double[]{117.129161, 39.152178})));
        features.add(new Feature("Feature1",new Properties(26, "route26", "杉溪"),new Geometry("Point",new double[]{117.128956, 39.152218})));
        features.add(new Feature("Feature1",new Properties(27, "route27", "榉谷"),new Geometry("Point",new double[]{117.128663, 39.152286})));
        features.add(new Feature("Feature1",new Properties(28, "route28", "榕海"),new Geometry("Point",new double[]{117.128450, 39.152293})));
        features.add(new Feature("Feature1",new Properties(29, "route29", "桦泉"),new Geometry("Point",new double[]{117.128177, 39.152256})));
        features.add(new Feature("Feature1",new Properties(30, "route30", "桂潭"),new Geometry("Point",new double[]{117.127956, 39.152163})));
        features.add(new Feature("Feature1",new Properties(31, "route31", "梅岭"),new Geometry("Point",new double[]{117.127766, 39.152061})));
        features.add(new Feature("Feature1",new Properties(32, "route32", "桃港"),new Geometry("Point",new double[]{117.127632, 39.151932})));
        features.add(new Feature("Feature1",new Properties(33, "route33", "桂峰"),new Geometry("Point",new double[]{117.127567, 39.151804})));
        features.add(new Feature("Feature1",new Properties(34, "route34", "枫林"),new Geometry("Point",new double[]{117.127512, 39.151632})));
        features.add(new Feature("Feature1",new Properties(35, "route35", "桦城"),new Geometry("Point",new double[]{117.127444, 39.151399})));
        features.add(new Feature("Feature1",new Properties(36, "route36", "桐乡"),new Geometry("Point",new double[]{117.127384, 39.151228})));
        features.add(new Feature("Feature1",new Properties(37, "route37", "松湖"),new Geometry("Point",new double[]{117.127344, 39.151062})));
        features.add(new Feature("Feature1",new Properties(38, "route38", "杉河"),new Geometry("Point",new double[]{117.127304, 39.150815})));
        features.add(new Feature("Feature1",new Properties(39, "route39", "榉园"),new Geometry("Point",new double[]{117.127270, 39.150563})));
        features.add(new Feature("Feature1",new Properties(40, "route40", "榕港"),new Geometry("Point",new double[]{117.127233, 39.150280})));
        features.add(new Feature("Feature1",new Properties(41, "route41", "桦溪"),new Geometry("Point",new double[]{117.127164, 39.149974})));
        features.add(new Feature("Feature1",new Properties(42, "route42", "桂山"),new Geometry("Point",new double[]{117.127034, 39.149752})));
        features.add(new Feature("Feature1",new Properties(43, "route43", "梅河"),new Geometry("Point",new double[]{117.126788, 39.149601})));
        features.add(new Feature("Feature1",new Properties(44, "route44", "桃岩"),new Geometry("Point",new double[]{117.126386, 39.149491})));
        features.add(new Feature("Feature1",new Properties(45, "route45", "桂河"),new Geometry("Point",new double[]{117.126043, 39.149403})));
        features.add(new Feature("Feature1",new Properties(46, "route46", "枫泉"),new Geometry("Point",new double[]{117.125703, 39.149285})));
        features.add(new Feature("Feature1",new Properties(47, "route47", "桦海"),new Geometry("Point",new double[]{117.125394, 39.149161})));
        features.add(new Feature("Feature1",new Properties(48, "route48", "桐林"),new Geometry("Point",new double[]{117.125104, 39.149007})));
        features.add(new Feature("Feature1",new Properties(49, "route49", "松溪"),new Geometry("Point",new double[]{117.124814, 39.148871})));
        features.add(new Feature("Feature1",new Properties(50, "route50", "杉泉"),new Geometry("Point",new double[]{117.124591, 39.148656})));
    }


    @GetMapping("/history")
    public List<Feature> getData() {
        return features;
    }
}
